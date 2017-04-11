package ch.bbv.zoo.Assert;

import ch.bbv.zoo.Assert.utility.OverheatException;

/**
 * Created by romankieser on 10/04/2017.
 */
public class MachineImpl implements Machine {

    private boolean isOn;
    private boolean isReady;
    private boolean hasInitialized;

    @Override
    public void initialize() {
        this.isOn = true;
        this.isReady = true;
        this.hasInitialized = true;
    }

    @Override
    public void transportMachine(int seconds) {
        try {
            synchronized (this){
                this.wait(seconds*1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public boolean isReady() {
        return this.isReady;
    }

    @Override
    public boolean hasInitialized() {
        return this.hasInitialized;
    }

    @Override
    public String getName() {
        return "I am a Machine";
    }

    @Override
    public void goFullPower() {
        throw new OverheatException();
    }
}
