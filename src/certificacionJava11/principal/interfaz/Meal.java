package certificacionJava11.principal.interfaz;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Repeatable(Meals.class)
@Target(ElementType.TYPE)
public @interface Meal {
	String starter() default"";
	String mainCourse();
	String dessert() default"";
	

}
