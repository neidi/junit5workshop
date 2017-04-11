package ch.bbv.zoo.defaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by simonneidhart on 03.04.2017.
 */
public interface RequiredSpaceContract {

    int minSpace = 50;
    int maxSpace =150;

    int getRequiredSpaceOfAnimal();

    @Test
    default void personalSpaceShouldBeBetween50And150SquareMeters(){
        int requiredSpace = getRequiredSpaceOfAnimal();
        assertAll("Required Space",
                () -> assertTrue(requiredSpace >= minSpace, "you're an animal tormentor"),
                () -> assertTrue(requiredSpace <= maxSpace, "you've got too much money")
        );
    }
}
