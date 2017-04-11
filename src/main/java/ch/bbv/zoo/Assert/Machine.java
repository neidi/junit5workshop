package ch.bbv.zoo.Assert;

/**
 * Created by romankieser on 10/04/2017.
 */
public interface Machine {

    public void initialize();
    public void transportMachine(int seconds);
    public boolean isOn();
    public boolean isReady();
    public boolean hasInitialized();
    public String getName();
    public void goFullPower();

}
