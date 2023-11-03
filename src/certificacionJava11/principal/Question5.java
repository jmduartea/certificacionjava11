package certificacionJava11.principal;

public class Question5 {
	public static void main(String[] args) {
		/*Respuesta correcta E. 08*/
		for (var i=0; i<10;i++) {
		switch (i%5) {	
		case 2:
				i *=2*i;
				break;
		case 3:
			i++;
			break;
		case 1:
		case 4:
		i++;
		continue;
		default:
		break;
		
		}
		System.out.print(i+"");
		i++;
		}
		
	}

}
