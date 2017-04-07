package ch.bbv.zoo.defaultmethods;

import ch.bbv.zoo.Ostrich;
import extensions.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by simonneidhart on 03.04.2017.
 */
@RunWith(JUnitPlatform.class)
class OstrichTest implements PersonalSpaceContract {

    Ostrich ostrich = new Ostrich();

    @Override
    public int getPersonalSpaceOfAnimal() {
        return ostrich.getPersonalSpace();
    }
}