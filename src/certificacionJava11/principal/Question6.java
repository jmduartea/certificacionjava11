package certificacionJava11.principal;

import java.text.NumberFormat;
import java.util.Locale;

public class Question6 {
	public static void main(String[] args) {
		Locale locale=Locale.US;
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		double currency=1_00.00;
		System.out.println(formatter.format(currency));
		
		
	}

}
