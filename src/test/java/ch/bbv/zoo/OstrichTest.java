package ch.bbv.zoo;

import ch.bbv.zoo.defaultmethods.PersonalSpaceContract;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.junit.platform.runner.JUnitPlatform;

/**
 * Created by simonneidhart on 03.04.2017.
 */
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