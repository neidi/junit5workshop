package ch.bbv.zoo.asserts;

import ch.bbv.zoo.Fox;
import extensions.MockitoExtension;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by dariosagud on 06.04.2017.
 */
@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
public class AssertsTest {

    Fox fox;

    @Before
    public void setup(){
        fox = new Fox();
    }


    @org.junit.Test(expected = RuntimeException.class)
    public void WhenFoxTriesToFly_ThenThrowRuntimeException_JUnit4(){
        fox.tryToFly();
    }

    @Test
    void WhenFoxTriesToFly_ThenThrowRuntimeException_JUnit5(){
        assertThrows(RuntimeException.class, () -> fox.tryToFly());
    }



}
