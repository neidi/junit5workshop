package ch.bbv.zoo.extension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.*;

import extensions.AllExtensions;
import extensions.MockitoExtension;
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
    /*
    @BeforeAll
    static void setBefore() {
        System.out.println("BeforeALL  CLASS      <------");
    }

    @BeforeEach
    void setUpBefore() {
        System.out.println("BeforeEach CLASS      <------");
    }

    @AfterAll
    static void setAfter() {
        System.out.println("AfterAll   CLASS      <------");
    }

    @AfterEach
    void setUpAfter() {
        System.out.println("AfterEach  CLASS      <------");
    }*/

    @DisplayName("Test 1")
    @Test
    void einTest(TestInfo testInfo) {
        System.out.println("IN TEST 1");
        Assertions.assertTrue(testInfo.getTestClass().toString().contains("Extension"), "The class name should contain 'Extension'");
    }

    @DisplayName("Test 2")
    @Test
    @Tag("dario")
    void einAndererTest(TestInfo testInfo) {
        System.out.println("IN TEST 2");
        Assertions.assertTrue(testInfo.getTestClass().toString().contains("Extension"), "The class name should contain 'Extension'");
    }

}
