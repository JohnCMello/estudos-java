package construtores;

public class Construtores {

	public static void main(String[] args) {
		Conta john = new Conta(123, 100.0, 500.0);
//		john.numero = 123;
		john.setLimite(100.0);

		john.deposita(500.0);

		System.out.println("Saldo depois do deposito com " + john.getLimite() + " de limite : " +(john.getSaldo() + john.getLimite()));
		double valorDoSaque = 600.0;
//		double valorDoSaque = 200.0;

		john.saca(valorDoSaque);

//		john.saldo -= 100;

		System.out.println("Saldo depois do saque com " +  + john.getLimite() + " de limite : " +(john.getSaldo() + john.getLimite()));

	}

}
