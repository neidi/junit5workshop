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
    }

    @Test
    void whenMachineGoesFullPower_ThenThrowOverHeatException(){
    }

    @Test
    void whenMachineWaits_ThenMethodDoesNotTakeLongerThanExpected(){
    }

    @Test
    void onlyWhenMachineIsOn_ThenMachineCanBeReady(){
    }



}