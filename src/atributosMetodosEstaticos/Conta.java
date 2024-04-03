package atributosMetodosEstaticos;

class Conta {
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;
	private static int numeroIncremental = 1;

	public static int getNumeroIncremental() {
		return numeroIncremental;
	}

	public Conta() {
		this.numero = numeroIncremental;
		numeroIncremental++;

	}

	public Conta(int numero, double limite) {
		this.numero = numero;
		this.limite = limite;

	}

	public Conta(int numero, double limite, double saldoInicial) {
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldoInicial;

	}

	public void saca(double valor) {

		if (valor > this.saldo + this.limite) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo -= valor;
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setLimite(double valor) {
		this.limite = valor;
	}

	public double getLimite() {
		return this.limite;
	}

}

class Cliente {
	String nome;
	String endereco;
}
