package estudosAlura;

public class VariavelsEFluxo {

	public static void main(String[] args) {
//		Variáveis
		int idadeJoao = 18;
		int idadeMaria = 20;
		
		int somaDasIdades = idadeJoao + idadeMaria;
		
		int idade = 70;
		
		double pi = 3.1415;
		double dobroPi = pi * 2;
	

		boolean verdadeiro = true;
		boolean falso = false;
		boolean inverteBoolean = !false;
		
		boolean idoso = idade >= 60;
		
		char letra = 'Y';
		
		String nomeCompleto = "John Mello";
		
		
		int numeroPequeno = 32000;
		long numeroGrande = 9999999999999999L;
		
		float outroPi = 3.14F;
		
		long numero = 314;
		int copiaDeNumero = (int) numero;
		
		float grande = 10.8F;
		double copiaGrande = (double) grande;
		
//		Fluxos
		
		int idadeVisitante = 15;
		
		if(idadeVisitante >= 18) {
			System.out.println("Entre");
		} else {
			System.out.println("Volte para casa");
		}
	
	}

}
