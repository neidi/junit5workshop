package aufgaben.aufgabe1;

import ch.bbv.zoo.Assert.Machine;
import ch.bbv.zoo.Assert.MachineImpl;
import ch.bbv.zoo.Assert.utility.OverheatException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by romankieser on 10/04/2017.
 */
class MachineImplTest {

    private Machine testee;

    public MachineImplTest(){
        testee = new MachineImpl();
    }

    @Test
    void whenMachineHasBeenInitialized_ThenShouldBeOnReadyAndInitialized(){
        testee.initialize();
        assertAll(
                () -> assertTrue(testee.isOn()),
                () -> assertTrue(testee.isReady()),
                () -> assertTrue(testee.hasInitialized()));
    }

    @Test
    void whenMachineGoesFullPower_ThenThrowOverHeatException(){
        Assertions.assertThrows(OverheatException.class, () -> testee.goFullPower());
    }

    @Test
    void whenMachineWaits_ThenMethodDoesNotTakeLongerThanExpected(){
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> testee.transportMachine(2));
    }

    @Test
    void onlyWhenMachineIsOn_ThenMachineCanBeReady(){
        testee.initialize();
        Assumptions.assumeTrue(testee.isOn());
        Assertions.assertTrue(testee.isReady());
    }



}