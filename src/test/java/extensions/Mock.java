package extensions;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.mockito.Answers;

@Target({FIELD, PARAMETER}) // @Mock als Parameter
@Retention(RUNTIME)
@Documented
public @interface Mock {

    Answers answer() default Answers.RETURNS_DEFAULTS;

    String name() default "";

    Class<?>[] extraInterfaces() default {};
    
    boolean serializable() default false;
}