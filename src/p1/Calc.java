package p1;

public class Calc {

	/**
	 * Going to 20. Skriver lite till f�r att se om commits �r numrerade Jag g�r
	 * en �ndring
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Calc c = new Calc();

		for (int i = 0; i <= 20; i++) {
			System.out.println("" + i + " " + c.calculate(i));
		}
	}

	/**
	 * Lite kommentarer
	 * 
	 * @param i
	 * @return
	 */
	private int calculate(int i) {
		return tripple(i);
	}

	private int tripple(int i) {
		return 3 * i;
	}

}
