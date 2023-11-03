package certificacionJava11.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question10 {
	/*Respuesta C. [A, B, C]
[A, B, C]*/
	public static void main(String[] args) {
	List<String> list1 = new ArrayList<>();
	list1.add("A");
	list1.add("B");
	List<String> list2 = Collections.unmodifiableList(list1);
	list1.add("C");
	System.out.println(list1);
	System.out.println(list2);
	}

}
