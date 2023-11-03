package certificacionJava11.principal;

import certificacionJava11.principal.question3.Person;

public class Question9 {
	/*REspuesta correcta A. Joe-null*/
	
	public static void main(String[] args) {

		Person p= new Person("Joe");
		checkPerson(p);
		System.out.print(p);
		p=null;
		checkPerson(p);
		System.out.println(p);

		}
	
	public static Person checkPerson(Person p) {
		if(p==null) {
		p= new Person("Mary");
		}else {p= null;}

		return p;
		}

}
