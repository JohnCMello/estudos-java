package variaveisFluxo;

public class MultiplesOfThree {

	public static void main(String[] args) {
		int finish = 100;
		
		for(int index = 1; index <= finish; index++) {
			if(index % 3 == 0) {
				System.out.println(index);
			}
		}

	}

}
