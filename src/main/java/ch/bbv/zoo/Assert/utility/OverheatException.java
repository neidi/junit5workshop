package ch.bbv.zoo.Assert.utility;

/**
 * Created by romankieser on 07/04/2017.
 */
public class OverheatException extends RuntimeException{
    public OverheatException(){};
    public OverheatException(String s){
        super(s);
    }
}