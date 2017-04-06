package ch.bbv.zoo;

import java.util.Locale;

/**
 * Created by simonneidhart on 03.04.2017.
 */
public class Lion implements Animal {
    @Override
    public boolean hasClaws() {
        return true;
    }

    @Override
    public String makeNoise() {
        return "roar!";
    }

    @Override
    public Locale getOrigin() { return new Locale("EN", "Africa"); }

    @Override
    public int getPersonalSpace() {
        return 120;
    }
}
