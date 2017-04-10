package ch.bbv.zoo.extension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.*;

import extensions.AllExtensions;
import extensions.MockitoExtension;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by dariosagud on 06.04.2017.
 */
@ExtendWith(AllExtensions.class)
@RunWith(JUnitPlatform.class)
public class ExtensionTest {

    @Test
    void random(){
        Assert.assertTrue(true);
    }

}
