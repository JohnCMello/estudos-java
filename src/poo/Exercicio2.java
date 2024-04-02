package poo;

class FuncionarioEx2 {

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
}

public class Exercicio2 {

	public static void main(String[] args) {
		FuncionarioEx2 funcionario1 = new FuncionarioEx2();

		funcionario1.nome = "John Mello";
		funcionario1.cpf = "123.321.123-12";
		funcionario1.rg = "123456-7";
		funcionario1.idade = 37;
		funcionario1.departamento = "Desenvolvimento";
		funcionario1.cargo = "Desenvolvedor Full-Stack";
		funcionario1.dataAdmissão = "02-04-2024";
		funcionario1.salario = 4500.00;

		System.out.println("#########################");
		System.out.println();
		System.out.println("Informações do funcionario: " + funcionario1.nome);
		System.out.println("-------------------------");
		System.out.println("CPF: " + funcionario1.cpf);
		System.out.println("RG: " + funcionario1.rg);
		System.out.println("Idade: " + funcionario1.idade);
		System.out.println("Departamento: " + funcionario1.departamento);
		System.out.println("Cargo: " + funcionario1.cargo);
		System.out.println("Data da admissão: " + funcionario1.dataAdmissão);
		System.out.println("Salário: " + funcionario1.salario);
		System.out.println("Ganhos anuais: " + funcionario1.calculaGanhoAnual());
		System.out.println();
		System.out.println("#########################");

		funcionario1.recebeAumento(450.0);
		System.out.println("Funcionario recebeu um aumento");
		System.out.println();
		System.out.println("Salário: " + funcionario1.salario);
		System.out.println("Ganhos anuais: " + funcionario1.calculaGanhoAnual());
		System.out.println();
		System.out.println("#########################");

	}

}
