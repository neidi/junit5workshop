package ch.bbv.zoo.parameterized;

import ch.bbv.calculator.Calculator;
import ch.bbv.zoo.Animal;
import ch.bbv.zoo.Fox;
import ch.bbv.zoo.Lion;
import ch.bbv.zoo.Ostrich;
import extensions.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ObjectArrayArguments;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.ObjectArrayArguments.create;

/**
 * Created by simonneidhart on 10.04.2017.
 */
@RunWith(JUnitPlatform.class)
public class ParameterizedTests {
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    void parameterizedTest(String value) {
        System.out.println(value);
    }

    @ParameterizedTest(name = "{index} ==> addition of {0} and {1}")
    @MethodSource(names = "summandProvider2")
    void calculatorShouldAddSummands(int summand1, int summand2, int expected) {

        // Act
        long additionResult = new Calculator().add(summand1, summand2);

        // Assert
        assertEquals(expected, additionResult);
    }

    static Stream<Arguments> summandProvider() {
        return Stream.of(create(1, 2, 3), create(3, 4, 7));
    }

    static List<Arguments> summandProvider2() {
        ArrayList<Arguments> arguments = new ArrayList<>();
        arguments.add(ObjectArrayArguments.create(1, 2, 3));
        arguments.add(ObjectArrayArguments.create(2, 4, 6));
        return arguments;
    }


    @ParameterizedTest(name = "{index} ==> test of animal {0}")
    @MethodSource(names = "animalTestProvider")
    void animalsShouldHaveTheirOwnWhateversChöbel(Animal animal, boolean hasClaws, String noise, int area) {
        assertAll(
                () -> assertEquals(hasClaws, animal.hasClaws()),
                () -> assertEquals(noise, animal.makeNoise()),
                () -> assertEquals(area, animal.getPersonalSpace()));
    }

    static List<Arguments> animalTestProvider() {
        ArrayList<Arguments> arguments = new ArrayList<>();
        arguments.add(ObjectArrayArguments.create(new Fox(), false, "ringdingding!", 65));
        arguments.add(ObjectArrayArguments.create(new Ostrich(), true, "Gurr!", 100));
        arguments.add(ObjectArrayArguments.create(new Lion(), true, "roar!", 120));
        return arguments;
    }
}

class FibonacciTest {
    public static Iterable<Arguments> data() {
        return Arrays.asList(ObjectArrayArguments.create(0, 0), ObjectArrayArguments.create(1, 1));
    }

    @ParameterizedTest(name = "{index} ==> rib[{0}]={1}")
    @MethodSource(names = "data")
    public void test(int expected, int input) {
        assertEquals(expected, Fibonacci.compute(input));
    }
}
