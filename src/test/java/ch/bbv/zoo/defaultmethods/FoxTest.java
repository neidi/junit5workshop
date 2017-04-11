package ch.bbv.zoo.defaultmethods;

import ch.bbv.zoo.Fox;
import extensions.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by simonneidhart on 03.04.2017.
 */
@RunWith(JUnitPlatform.class)
@ExtendWith({MockitoExtension.class})
class FoxTest implements RequiredSpaceContract {

    Fox fox = new Fox();

    @Override
    public int getRequiredSpaceOfAnimal() {
        return fox.getRequiredSpace();
    }
}