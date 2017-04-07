package ch.bbv.zoo;

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

    public void tryToFly(){
        throw new CantFlyException("I can't fly, dude!");
    }

    private class CantFlyException extends RuntimeException{
        public CantFlyException(){};
        public CantFlyException(String s){
            super(s);
        }

    }
}
