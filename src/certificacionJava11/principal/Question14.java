package certificacionJava11.principal;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Question14 {
	public static void main(String[] args) {
		try {
			doA();
			doB();
		}catch (IOException e){
			System.out.print("c");
			return;
		}finally {
			System.out.print("d");
		}
		System.out.print("f");
		
	}
	private static void doA() {
		System.out.print("a");
		if (false) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	private static void doB() throws FileNotFoundException {
		System.out.print("b");
		if (true) {
			throw new FileNotFoundException();
		}
	}

}
