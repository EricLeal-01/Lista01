package lista1;

public class Questao3 {

	public static void main(String[] args) {
	
		int A = 10;
		int B = 10;

		if (A == 10) {
			System.out.println("A == 10");
			if (A + B == 20)
				System.out.println("A + B == 20");
			if (B == 10)
				System.out.println("B == 10");

		} else if (A + B == 20) {
			System.out.println("A + B == 20");

		} else if (B == 10) {
			System.out.println("B == 10");
		}

	}

}
