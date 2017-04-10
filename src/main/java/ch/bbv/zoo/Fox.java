package ch.bbv.zoo;

import ch.bbv.zoo.Assert.utility.OverheatException;

import java.util.Locale;

/**
 * Created by simonneidhart on 03.04.2017.
 */
public class Fox implements Animal {
    @Override
    public boolean hasClaws() {
        return false;
    }

    @Override
    public String makeNoise() { return "ringdingding!"; }

    @Override
    public Locale getOrigin() {
        return new Locale("EN", "Canada");
    }

    @Override
    public int getPersonalSpace() {
        return 65;
    }

    @Override
    public String toString() {
        return "Fox";
    }
}
