package pokemongoeggs;

public class PrintFormatter {

	static void formatNumbers(double number) {
		if ((number * 10) % 5 == 0) {
			System.out.print((int) number);
		} else {
			System.out.printf("%.1f", number);
		}
	}
	
}
