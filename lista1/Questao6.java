package lista1;

public class Questao6 {

	public static void main(String[] args) {
	
		int A = 10;
		int B = 19;

		if (A > 10) {
			System.out.println("A > 10");
			
			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("A + B != 20");
			}
		} else {
			System.out.println("A <= 10");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("A + B != 20");
			}
		}
	}
}
