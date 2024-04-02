package poo;

class DataAdmissaoEx8 {
	int dia;
	int mes;
	int ano;

	void setDataAdmissao(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}

class FuncionarioEx8 {

	String nome;
	String cpf;
	String rg;
	int idade;
	String departamento;
	String cargo;
	DataAdmissaoEx8 dataAdmissão;
	double salario;

	void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;

	}

	void mostra() {
		System.out.println("#########################");
		System.out.println();
		System.out.println("Informações do funcionario: " + this.nome);
		System.out.println("-------------------------");
		System.out.println("CPF: " + this.cpf);
		System.out.println("RG: " + this.rg);
		System.out.println("Idade: " + this.idade);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Data da admissão: " + this.dataAdmissão.dia + '-'+ this.dataAdmissão.mes + '-' +  this.dataAdmissão.ano);
		System.out.println("Salário: " + this.salario);
		System.out.println("Ganhos anuais: " + this.calculaGanhoAnual());
		System.out.println();
		System.out.println("#########################");
	}
}

public class Exercicio8 {

	public static void main(String[] args) {
		FuncionarioEx8.salario = 3000.00;
		FuncionarioEx8.calculaGanhoAnual();

	}

}
