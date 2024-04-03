package atributosMetodosEstaticos;

class DataAdmissao {
	private int dia;
	private int mes;
	private int ano;

	public void setDataAdmissao(int dia, int mes, int ano) {
		if (mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
			System.out.println("Data de admissão inválida.");
			return;
		}

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getDataFormatada() {
		return "" + this.dia + '/' + this.mes + '/' + this.ano;
	}

	private int diasNoMes(int mes, int ano) {
		switch (mes) {
		case 2:
			if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
				return 29; // Fevereiro em ano bissexto
			} else {
				return 28; // Fevereiro em ano não bissexto
			}
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}
}

class Funcionario {

	private String nome;
	private String cpf;
	private String rg;
	private int idade = 0;
	private String departamento;
	private String cargo;
	private double salario = 0;
	private DataAdmissao dataAdmissao;
	private int idFuncionario;
	private static int identificador = 0;

	public Funcionario(String nome) {
		this.nome = nome;
		this.idFuncionario = ++identificador;

	}

	public int getIdFuncionario() {
		return this.idFuncionario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		if (this.nome == null) {
			return "Nome não foi definido";
		}
		return this.nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		if (this.cpf == null) {
			return "CPF não foi definido";
		}
		return this.cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		if (this.rg == null) {
			return "RG não foi definido";
		}
		return this.rg;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getIdade() {
		if (this.idade == 0) {
			return "Idade não foi definida";
		}
		return Integer.toString(this.idade);
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDepartamento() {
		if (this.departamento == null) {
			return "Departamento não foi definido";
		}
		return this.departamento;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		if (this.cargo == null) {
			return "Cargo não foi definido";
		}
		return this.cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSalario() {
		if (this.salario == 0) {
			return "O salário não foi definido";
		}
		return Double.toString(this.salario);
	}

	public void setDataAdmissao(int dia, int mes, int ano) {
		if (this.dataAdmissao == null) {
			this.dataAdmissao = new DataAdmissao();
		}
		this.dataAdmissao.setDataAdmissao(dia, mes, ano);
	}

	public String getDataAdmissaoFormatada() {
		if (this.dataAdmissao == null) {
			return "Data de admissão não definida";
		}
		return this.dataAdmissao.getDataFormatada();
	}

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;

	}

	public void mostra() {
		System.out.println("#########################");
		System.out.println();
		System.out.println("Informações do funcionario: " + this.getNome());
		System.out.println("-------------------------");
		System.out.println("CPF: " + this.getCpf());
		System.out.println("RG: " + this.getRg());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Cargo: " + this.getCargo());
		System.out.println("Data da admissão: " + this.getDataAdmissaoFormatada());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Ganhos anuais: " + this.calculaGanhoAnual());
		System.out.println();

	}
}