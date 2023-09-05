package lista1;

public class Questao17 {

	public static void main(String[] args) {

		int A = 8;
		int B = 10;

		if (A > 10 || A + B == 20) {
			System.out.println("número válido");
			
		} else if (A == B) {
			System.out.println("A é igual a B");
			
		} else if (A !=10 && B!=10 && A < 10) {
			System.out.println("A é menor que 10");
			
		} else {
			System.out.println("número não válido");
		}
	}

}
