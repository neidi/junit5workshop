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
class LionTest implements PersonalSpaceContract {


    Lion lion;

    @BeforeEach
    void SetUp() {
        this.lion = new Lion();
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
        return lion.getPersonalSpace();
    }
}