package interface_framework.itest.actions.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TestObjectDefine {
    String author();
    String creDate();
    String des();
    String id();
    String modDate() default "";
    String serviceName() default "";
}
