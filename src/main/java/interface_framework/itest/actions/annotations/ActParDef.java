package interface_framework.itest.actions.annotations;

import java.lang.annotation.*;
import interface_framework.itest.actions.interfaces.ActParaDefType;

@Repeatable(ActParDefs.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ActParDef {
   String name();
   String defVal() default "";
   String des() default "";
   ActParaDefType type() default ActParaDefType.OUTINPUT;
   String valRange() default "";
}
