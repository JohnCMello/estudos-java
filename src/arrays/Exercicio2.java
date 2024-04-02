package arrays;

class DataAdmissaoEx2 {
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

class FuncionarioEx2 {

	String nome;
	String cpf;
	String rg;
	int idade;
	String departamento;
	String cargo;
	DataAdmissaoEx1 dataAdmissão;
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
		System.out.println("#########################");
	}
}

class FilialEx2 {
	String endereco;
	String telefone;
	int quantidadeFuncionarios;

}

class EmpresaEx2 {
	String nome;
	String cnpj;
	FuncionarioEx2[] funcionarios;
	FilialEx2[] filiais;
	int idFuncionario = 0;
	int idFilial = 0;

	void adicionaFuncionario(FuncionarioEx2 funcionario) {
		this.funcionarios[this.idFuncionario] = funcionario;
		this.idFuncionario++;

	}

	void adicionaFilial(FilialEx2 filial) {
		this.filiais[this.idFilial] = filial;
		this.idFilial++;
	}

}

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
