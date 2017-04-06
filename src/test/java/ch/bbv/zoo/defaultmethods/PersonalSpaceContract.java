package ch.bbv.zoo.defaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by simonneidhart on 03.04.2017.
 */
public interface PersonalSpaceContract {

    int minLength = 50;
    int maxLength=150;

    int getPersonalSpaceOfAnimal();

    @Test
    default void personalSpaceShouldBeBetween50And150SquareMeters(){

        int personalSpace = getPersonalSpaceOfAnimal();
        assertAll("Personal Space",
                () -> assertTrue(personalSpace >= minLength, "you're an animal tormentor"),
                () -> assertTrue(personalSpace <= maxLength, "you've got too much money")
        );
    }
}
