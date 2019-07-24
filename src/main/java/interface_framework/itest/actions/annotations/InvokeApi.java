package interface_framework.itest.actions.annotations;

import java.lang.annotation.*;

@Repeatable(InvokeApis.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface InvokeApi {
    String method();
    String serviceName() default "";
    String url();
}
