package ch.bbv.zoo.dynamic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import ch.bbv.zoo.Animal;
import ch.bbv.zoo.Fox;
import ch.bbv.zoo.Lion;
import extensions.Mock;
import extensions.MockitoExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by dariosagud on 06.04.2017.
 */
@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
public class DynamicTests {

    // test falsche Daten; der ganze Test wird trotzdem ausgeführt
    @DisplayName("Dynamischer Test 1")
    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() { // funktioniert fast gleich wie assertAll()
        System.out.println("Dynamischer Test 1 start");
        // arrange
        Locale africa = new Locale("EN", "Africa");
        // act
        Lion lion = new Lion();
        // assert
        List<DynamicTest> factory = Arrays.asList(
                dynamicTest("erster dynamischer test", () -> assertEquals(africa,  lion.getOrigin(), "wrong origin")),
                dynamicTest("zweiter dynamischer test", () -> assertEquals("Buu!", lion.makeNoise(), "wrong noise")),
                dynamicTest("dritter dynamischer test", () -> assertTrue(lion.hasClaws(), "claws should be false"))
        );
        System.out.println("Dynamischer Test 1 end");
        return factory;
    }

    @DisplayName("Dynamischer Test 2")
    @TestFactory
    Stream<DynamicTest> dynamicTestsFromIntStream() {
        System.out.println("Dynamischer Test 2 start");
        // arrange
        // act
        Fox fox = new Fox();
        // assert
        Stream<DynamicTest> stream = Stream.of("ring", "ding", "d").map(
                str -> dynamicTest("Username of SuperUser contains " + str,
                        () -> assertTrue(fox.makeNoise().contains(str), "Noise should contain " + str))
        );
        System.out.println("Dynamischer Test 2 end");
        return stream;
    }

}
