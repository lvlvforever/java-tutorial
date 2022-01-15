package site.daipeng.java.tutorial.chapter23;

import java.lang.annotation.*;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/14 10:57 下午
 **/
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Login {

    String value() default "login";

}
