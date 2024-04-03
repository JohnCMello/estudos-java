package atributosMetodosEstaticos;

public class AtributosMetodosEstaticos {

	public static void main(String[] args) {
//		Conta john = new Conta(123456, 1000.0);
		
		Conta contaJohn = new Conta();
		System.out.println("Numero da conta do John: "+ contaJohn.getNumero());
		
		Conta contaJulia = new Conta();
		System.out.println("Numero da conta do Julia: "+ contaJulia.getNumero());
		
		System.out.println("Proxima conta criada com construtor padrão terá número: " + Conta.getNumeroIncremental());
		
		
		Funcionario funcionarioJohn = new Funcionario("John Mello");
		Funcionario funcionarioJulia = new Funcionario("Julia Ramos");

		System.out.println("O id de " + funcionarioJohn.getNome() +" é " + funcionarioJohn.getIdFuncionario());
		
		System.out.println("O id de " + funcionarioJulia.getNome() +" é " + funcionarioJulia.getIdFuncionario());

	}

}
