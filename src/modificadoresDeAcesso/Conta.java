package modificadoresDeAcesso;

class Conta {
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;

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
	
	public void setLimite(double valor) {
		this.limite = valor;
	}

}

class Cliente {
	String nome;
	String endereco;
}
