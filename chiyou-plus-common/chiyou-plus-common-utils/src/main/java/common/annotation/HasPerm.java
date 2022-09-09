package common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: 写一个自定义注解 使其在按钮执行之前执行这个注解,是否有权CRUD
 * @author: daiyifan
 * @create: 2022/9/5 10:19
 */
@Retention(RetentionPolicy.RUNTIME) //运行时异常
@Target(ElementType.METHOD) //放在类上
public @interface HasPerm {

    String perm() default "";
}
