package poo;


class Funcionario {
	String nome;
	String cpf;
	String rg;
	int idade;
	String departamento;
	String cargo;
	String dataAdmissão;
	double salario;
	
	void recebeAumento(double valorAumento) {
		this.salario += valorAumento;
	}
	
	double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
}


