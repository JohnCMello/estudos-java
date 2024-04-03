package atributosMetodosEstaticos;

public class AtributosMetodosEstaticos {

	public static void main(String[] args) {
//		Conta john = new Conta(123456, 1000.0);
		
		Conta john = new Conta();
		System.out.println("Numero da conta do John: "+ john.getNumero());
		
		Conta julia = new Conta();
		System.out.println("Numero da conta do Julia: "+ julia.getNumero());
		
		System.out.println("Proxima conta criada com construtor padrão terá número: " + Conta.getNumeroIncremental());

	}

}
