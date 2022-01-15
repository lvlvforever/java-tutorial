package site.daipeng.java.tutorial.chapter23;

import java.lang.annotation.*;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/14 10:25 下午
 **/
@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Test {

    int score() default 10;

    String name() default "name";

    String value() default "value";

    Login login() default @Login;

    Login login2() default @Login("in test");

}
