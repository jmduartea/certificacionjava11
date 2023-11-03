package certificacionJava11.principal.interfaz;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target (ElementType.TYPE)
public @interface Meals {
Meal[] value();
	
}
