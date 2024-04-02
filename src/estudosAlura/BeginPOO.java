package estudosAlura;

class Pessoa {
	String nome;
	String cpf;
	String nascimento;
	
}

class Conta {
	int numero;
	double saldo;
	int agencia;
	Pessoa titular;
	

	void deposita(double valor) {
//		this.saldo += valor - 0.1;
		this.saldo += valor;
	}

	void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}

	}
	
	void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
}

public class BeginPOO {

	public static void main(String[] args) {
		Conta john = new Conta();
		john.numero = 123;
		john.saldo = 500.0;
		john.agencia = 456;
		
//		john.titular = "John Mello";
		john.titular = new Pessoa();
		john.titular.nome = "John Mello";
		john.titular.cpf = "123.321.123-12";
		john.titular.nascimento = "28-12-1986";
		
		

//		john.saldo += 100.0;
		john.deposita(100.0);
		john.saca(50.0);
		

		Conta julia = new Conta();
		julia.numero = 124;
		julia.saldo = 600.0;
		julia.agencia = 456;
		
//		julia.titular = "Julia Ramos";
		julia.titular = new Pessoa();
		
		julia.titular.nome = "Julia Ramos";
		julia.titular.cpf = "321.123.321-21";
		julia.titular.nascimento = "12-07-1995";

//		julia.saldo += 200.0;
		julia.deposita(200.0);
		julia.saca(40.5);
		
		john.transfere(35.0, julia);

		System.out.println("#####################");
		System.out.println("Titular da conta: " + john.titular.nome);
		System.out.println("Agencia: " + john.agencia);
		System.out.println("Saldo: " + john.saldo);
		System.out.println("#####################");
		System.out.println("Titular da conta: " + julia.titular.nome);
		System.out.println("Agencia: " + julia.agencia);
		System.out.println("Saldo: " + julia.saldo);
		System.out.println("#####################");
		

	}

}
