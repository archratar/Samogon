package Annotations;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Position {

    public String value() default "a hz";
}
