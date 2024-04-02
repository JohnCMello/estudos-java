package modificadoresDeAcesso;

public class modificadoresDeAcesso {

	public static void main(String[] args) {
		Conta john = new Conta();
		john.numero = 123;
		john.setLimite(100.0);

		john.deposita(500.0);

		double valorDoSaque = 600.0;
//		double valorDoSaque = 200.0;

		john.saca(valorDoSaque);
		
//		john.saldo -= 100;

		System.out.println(john.getSaldo());

	}

}
