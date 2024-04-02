package poo;

class FuncionarioEx4 {

	String nome;
	String cpf;
	String rg;
	int idade;
	String departamento;
	String cargo;
	String dataAdmissão;
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
		System.out.println("Data da admissão: " + this.dataAdmissão);
		System.out.println("Salário: " + this.salario);
		System.out.println("Ganhos anuais: " + this.calculaGanhoAnual());
		System.out.println();
		System.out.println("#########################");
	}
}

public class Exercicio4 {

	public static void main(String[] args) {
		FuncionarioEx4 funcionario1 = new FuncionarioEx4();
		FuncionarioEx4 funcionario2 = new FuncionarioEx4();

		funcionario1.nome = "John Mello";
		funcionario1.cpf = "123.321.123-12";
		funcionario1.rg = "123456-7";
		funcionario1.idade = 37;
		funcionario1.departamento = "Desenvolvimento";
		funcionario1.cargo = "Desenvolvedor Full-Stack";
		funcionario1.dataAdmissão = "02-04-2024";
		funcionario1.salario = 4500.00;

		funcionario2.nome = "Julia Ramos";
		funcionario2.cpf = "321.123.321-21";
		funcionario2.rg = "765432-1";
		funcionario2.idade = 28;
		funcionario2.departamento = "Desenvolvimento";
		funcionario2.cargo = "Desenvolvedora Front-End";
		funcionario2.dataAdmissão = "04-02-2024";
		funcionario2.salario = 5800.00;

		if (funcionario1 == funcionario2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

	}

}
