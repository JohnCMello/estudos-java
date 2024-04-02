package variaveisFluxo;

public class Fatorial {

	public static void main(String[] args) {
		int finish = 30;
		for (int i = 0; i <= finish; i++) {
            long fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println("O fatorial de " + i + " é: " + fatorial);
        }
	}

}
