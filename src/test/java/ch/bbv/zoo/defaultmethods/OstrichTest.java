package ch.bbv.zoo.defaultmethods;

import ch.bbv.zoo.Ostrich;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by simonneidhart on 03.04.2017.
 */
@RunWith(JUnitPlatform.class)
class OstrichTest implements RequiredSpaceContract {

    Ostrich ostrich = new Ostrich();

    @Override
    public int getRequiredSpaceOfAnimal() {
        return ostrich.getRequiredSpace();
    }
}