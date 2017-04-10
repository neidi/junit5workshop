package ch.bbv.zoo;

import java.util.Locale;

/**
 * Created by simonneidhart on 03.04.2017.
 */
public class Ostrich implements Animal {
    @Override
    public boolean hasClaws() {
        return true;
    }

    @Override
    public String makeNoise() {
        return "Gurr!";
    }

    @Override
    public Locale getOrigin() { return new Locale("EN", "Australia"); }

    @Override
    public int getPersonalSpace() {
        return 100;
    }

    @Override
    public String toString() {
        return "Ostrich";
    }
}
