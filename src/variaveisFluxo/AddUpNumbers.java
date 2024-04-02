package variaveisFluxo;

public class AddUpNumbers {

	public static void main(String[] args) {
		int sum = 0;
		int index = 0;
		int finish = 1000;
		
		while (index <= finish) {
			sum += index;
			index++;
		}
		
		System.out.println(sum);
	}

}
