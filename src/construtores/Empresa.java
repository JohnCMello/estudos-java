package construtores;

class Filial {
	private String endereco;
	private String telefone;
	private int quantidadeFuncionarios;

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public int getQuantidadeFuncionarios() {
		return this.quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

}

class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private Filial[] filiais;
	private int posicaoFuncionario = 0;
	private int posicaoFilial = 0;

	public Empresa(int numeroFuncionarios) {
		this.funcionarios = new Funcionario[numeroFuncionarios];

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

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		if (this.cnpj == null) {
			return "CNPJ não foi definido";
		}
		return this.cnpj;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionarios[this.posicaoFuncionario] = funcionario;
		this.posicaoFuncionario++;

	}

	public Funcionario[] getFuncionarios() {
		if (this.funcionarios == null) {
			return new Funcionario[0];
		}
		return this.funcionarios;

	}

	public Funcionario getFuncionario(int posicao) {
		if (this.funcionarios == null || posicao < 0 || posicao >= this.posicaoFuncionario) {
			return null;
		}
		return this.funcionarios[posicao];
	}

	public void setFilial(Filial filial) {
		this.filiais[this.posicaoFilial] = filial;
		this.posicaoFilial++;
	}

	public Filial[] getFiliais(Filial filial) {
		if (this.filiais == null) {
			return new Filial[0];
		}
		return this.filiais;
	}

	public Filial getFilial(int posicao) {
		if (this.filiais == null || posicao < 0 || posicao >= this.posicaoFilial) {
			return null;
		}
		return this.filiais[posicao];
	}

	void mostraFuncionarios() {
		for (int i = 0; i < this.funcionarios.length; i++) {
			if (this.funcionarios[i] == null)
				continue;
			this.funcionarios[i].mostra();
		}

	}

	boolean contemFuncionario(Funcionario funcionario) {
		for (int i = 0; i < this.funcionarios.length; i++) {
			if (this.funcionarios[i] == funcionario) {
				return true;
			}
		}
		return false;

	}

}
