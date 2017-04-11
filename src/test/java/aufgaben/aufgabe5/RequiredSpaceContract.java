package aufgaben.aufgabe5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by simonneidhart on 03.04.2017.
 */
public interface RequiredSpaceContract {

    int minSpace = 50;
    int maxSpace = 150;

    int getRequiredSpaceOfAnimal();

    @Test
    default void personalSpaceShouldBeBetween50And150SquareMeters(){
    }
}
