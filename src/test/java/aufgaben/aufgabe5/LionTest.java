package aufgaben.aufgabe5;

import ch.bbv.zoo.Lion;
import extensions.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by simonneidhart on 03.04.2017.
 */
@RunWith(JUnitPlatform.class)
@ExtendWith({MockitoExtension.class})
class LionTest implements RequiredSpaceContract {

    Lion lion = new Lion();

    @Override
    public int getRequiredSpaceOfAnimal() {
        return lion.getRequiredSpace();
    }
}