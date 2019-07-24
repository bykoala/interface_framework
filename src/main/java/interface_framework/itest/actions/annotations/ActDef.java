package interface_framework.itest.actions.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import interface_framework.itest.actions.interfaces.ActDefType;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface ActDef {
    String author() default "";
    String creDate() default "";
    String des() default "";
    String modDate() default "";
    String id();
    String name();
    ActDefType type();
    String repairer() default "";
    @Deprecated
    String template() default "";
}
