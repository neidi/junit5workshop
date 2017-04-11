package aufgaben.aufgabe2.todo2_3;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.*;

/**
 * Created by dariosagud on 19.12.2016.
 */
public class AllExtensions implements BeforeAllCallback, AfterAllCallback,
        BeforeEachCallback, AfterEachCallback, BeforeTestExecutionCallback, AfterTestExecutionCallback {
    @Override
    public void afterAll(ContainerExtensionContext containerExtensionContext) throws Exception {
        System.out.println("AfterAll   EXTENSION");
    }

    @Override
    public void afterEach(TestExtensionContext testExtensionContext) throws Exception {
        System.out.println("AfterEach  EXTENSION");
    }

    @Override
    public void afterTestExecution(TestExtensionContext testExtensionContext) throws Exception {
        System.out.println("AfterTest  EXTENSION");
    }

    @Override
    public void beforeAll(ContainerExtensionContext containerExtensionContext) throws Exception {
        System.out.println("BeforeAll  EXTENSION");
    }

    @Override
    public void beforeEach(TestExtensionContext testExtensionContext) throws Exception {
        System.out.println("BeforeEach EXTENSION");
    }

    @Override
    public void beforeTestExecution(TestExtensionContext testExtensionContext) throws Exception {
        System.out.println("BeforeTest EXTENSION");
    }
}
