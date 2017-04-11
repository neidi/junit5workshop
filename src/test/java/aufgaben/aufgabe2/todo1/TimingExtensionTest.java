package aufgaben.aufgabe2.todo1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import aufgaben.aufgabe2.todo2_3.AllExtensions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by dariosagud on 07.04.2017.
 */
@RunWith(JUnitPlatform.class)
public class TimingExtensionTest {

    @DisplayName("Test Fox")
    @Test
    void foxTest(TestInfo testInfo) {
        System.out.println("IN TEST 1");
        Assertions.assertTrue(testInfo.getDisplayName().toString().contains("Fox"));
    }

    @DisplayName("Test Lion")
    @Test
    void lionTest(TestInfo testInfo) {
        System.out.println("IN TEST 1");
        Assertions.assertTrue(testInfo.getTestClass().toString().contains("Timing"));
    }

}
