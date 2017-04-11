package aufgaben.aufgabe3;

import static org.junit.jupiter.api.Assertions.*;

import ch.bbv.zoo.Animal;
import ch.bbv.zoo.Fox;
import ch.bbv.zoo.Lion;
import ch.bbv.zoo.Ostrich;
import extensions.MockitoExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.Locale;

/**
 * Created by dariosagud on 06.04.2017.
 */
@DisplayName("When the animal")
@RunWith(JUnitPlatform.class)
public class NestedTest {

    public Animal animal;

    class NestedFox {

        @BeforeEach
        void setUp() {
            animal = new Fox();
        }

        @Test
        void hasClaws() {
            // assert
            assertFalse(animal.hasClaws(), "The fox does not have claws.");
        }

        @Test
        void makeNoise() {
            // assert
            String actual = animal.makeNoise();
            assertAll(
                    () -> assertTrue(actual.contains("ring"), "should contain ring"),
                    () -> assertTrue(actual.contains("ding"), "should contain ding"),
                    () -> assertTrue(actual.contains("dingding"), "should contain dingding")
            );
        }

        @Test
        void getOrigin() {
            // assert
            assertEquals(new Locale("EN", "Canada"), animal.getOrigin(), "The fox origin is Canada.");
        }

    }

    class NestedLion {

        @BeforeEach
        void setUp() {
            animal = new Lion();
        }

        void hasClaws() {
            // assert
            assertTrue(animal.hasClaws(), "The lion does have claws.");
        }

        @Test
        void makeNoise() {
            // assert
            String actual = animal.makeNoise();
            assertTrue(actual.contains("roar"), "should contain roar");
        }

        @Test
        void getOrigin() {
            // assert
            assertEquals(new Locale("EN", "Africa"), animal.getOrigin(), "The lion origin is Africa.");
        }

    }

    class NestedOstrich {

        @BeforeEach
        void setUp() {
            animal = new Ostrich();
        }

        @Test
        void hasClaws() {
            // assert
            assertTrue(animal.hasClaws(), "The ostrich does have claws.");
        }

        @Test
        void makeNoise() {
            // assert
            String actual = animal.makeNoise();
            assertTrue(actual.contains("Gurr"), "should contain Gurr");
        }

        @Test
        void getOrigin() {
            // assert
            assertEquals(new Locale("EN", "Australia"), animal.getOrigin(), "The lion origin is Australia.");
        }

    }

}
