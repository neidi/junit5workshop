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
@ExtendWith({MockitoExtension.class})
class OstrichTest implements PersonalSpaceContract {
    Ostrich ostrich;
    @BeforeEach
    void SetUp(){
        this.ostrich = new Ostrich();
    }

    @Test
    void hasClaws() {

    }

    @Test
    void makeNoise() {

    }

    @Test
    void getOrigin() {

    }

    @Override
    public int getPersonalSpaceOfAnimal() {
        return this.ostrich.getPersonalSpace();
    }
}