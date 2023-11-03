package certificacionJava11.principal;

import java.util.Optional;
import java.util.ServiceLoader;

public class Principal {
	
	 
	public static void main(String[] args) {
		//System.out.println(Question5.getFirstLetter());
       
		/*Question 8*/
//		Thread t1 = new Thread(new Question8());
//       Thread t2 = new Thread (new Question8());
//       Thread t3 = new Thread (new Question8());
//       
//       t1.start();
//       t2.run();
//       t3.start();
      /*Question 8 esto es lo que provoca la excepción*/ 
//       t1.start();
		
		/*Question 11*/
		Optional<String> value = createValues();
		String str = value.orElse("Duke");
		System.out.print(str);
 	
		
    }
	/*Question 11*/
	static Optional<String> createValues(){
		String s= null;
		return Optional.ofNullable(s);
	}
}
