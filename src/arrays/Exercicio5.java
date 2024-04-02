package arrays;


class DataAdmissaoEx5 {
	int dia;
	int mes;
	int ano;

	void setDataAdmissao(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String getDataFormatada() {
		return "" + this.dia + '/' + this.mes + '/' + this.ano;
	}
}

class FuncionarioEx5 {

	String nome;
	String cpf;
	String rg;
	int idade;
	String departamento;
	String cargo;
	DataAdmissaoEx5 dataAdmissão;
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
		System.out.println("Data da admissão: " + this.dataAdmissão.getDataFormatada());
		System.out.println("Salário: " + this.salario);
		System.out.println("Ganhos anuais: " + this.calculaGanhoAnual());
		System.out.println();

	}
}

class FilialEx5 {
	String endereco;
	String telefone;
	int quantidadeFuncionarios;

}

class EmpresaEx5 {
	String nome;
	String cnpj;
	FuncionarioEx5[] funcionarios;
	FilialEx5[] filiais;
	int idFuncionario = 0;
	int idFilial = 0;

	void adicionaFuncionario(FuncionarioEx5 funcionario) {
		this.funcionarios[this.idFuncionario] = funcionario;
		this.idFuncionario++;

	}

	void adicionaFilial(FilialEx5 filial) {
		this.filiais[this.idFilial] = filial;
		this.idFilial++;
	}

	void mostraFuncionarios() {
		for (int i = 0; i < this.funcionarios.length; i++) {
			if (this.funcionarios[i] == null)
				continue;
			this.funcionarios[i].mostra();
		}

	}

}

public class Exercicio5 {

	public static void main(String[] args) {

		EmpresaEx5 empresa = new EmpresaEx5();

		empresa.funcionarios = new FuncionarioEx5[10];

		FuncionarioEx5 funcionario1 = new FuncionarioEx5();
		FuncionarioEx5 funcionario2 = new FuncionarioEx5();
		FuncionarioEx5 funcionario3 = new FuncionarioEx5();

		funcionario1.nome = "John Mello";
		funcionario1.cpf = "123.321.123-12";
		funcionario1.rg = "123456-7";
		funcionario1.idade = 37;
		funcionario1.departamento = "Desenvolvimento";
		funcionario1.cargo = "Desenvolvedor Full-Stack";
		funcionario1.salario = 4500.00;
		funcionario1.dataAdmissão = new DataAdmissaoEx5();
		funcionario1.dataAdmissão.setDataAdmissao(2, 4, 2024);

		funcionario2.nome = "Julia Ramos";
		funcionario2.cpf = "321.123.321-21";
		funcionario2.rg = "765432-1";
		funcionario2.idade = 28;
		funcionario2.departamento = "Desenvolvimento";
		funcionario2.cargo = "Desenvolvedora Front-end";
		funcionario2.salario = 5500.00;
		funcionario2.dataAdmissão = new DataAdmissaoEx5();
		funcionario2.dataAdmissão.setDataAdmissao(4, 2, 2024);

		funcionario3.nome = "Cacau";
		funcionario3.cpf = "987.789.987-89";
		funcionario3.rg = "987654-5";
		funcionario3.idade = 5;
		funcionario3.departamento = "Canino";
		funcionario3.cargo = "Desenvolvedora Canina";
		funcionario3.salario = 3000.00;
		funcionario3.dataAdmissão = new DataAdmissaoEx5();
		funcionario3.dataAdmissão.setDataAdmissao(20, 12, 2021);


		empresa.adicionaFuncionario(funcionario1);
		empresa.adicionaFuncionario(funcionario2);
		empresa.adicionaFuncionario(funcionario3);

		empresa.mostraFuncionarios();
	}

}

