package ch.bbv.zoo;

import java.util.Locale;

/**
 * Created by simonneidhart on 03.04.2017.
 */
public interface Animal {
    boolean hasClaws();
    String makeNoise();
    Locale getOrigin();
    int getPersonalSpace();
}
