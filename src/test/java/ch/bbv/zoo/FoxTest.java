package ch.bbv.zoo;

import ch.bbv.zoo.defaultmethods.PersonalSpaceContract;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.junit.platform.runner.JUnitPlatform;
/**
 * Created by simonneidhart on 03.04.2017.
 */
class FoxTest implements PersonalSpaceContract {

    Fox fox;

    @BeforeEach
    void SetUp(){
        fox = new Fox();
    }

    @TestFactory
    Collection<DynamicTest> hasClaws() {
// TODO: implement dynamic tests
        return null;
    }

    @Test
    void shouldMakeRingdingdingNoise() {
        String whatDoesTheFoxSay = fox.makeNoise();
        assertTrue(whatDoesTheFoxSay == "ringdingding!");
    }

    @Test
    void getOrigin() {

    }

    @Override
    public int getPersonalSpaceOfAnimal() {
        return fox.getPersonalSpace();
    }
}