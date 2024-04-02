package modificadoresDeAcesso;

public class Exercicio3 {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("John Mello");
		funcionario1.setCpf("123.321.123-12");
		funcionario1.setRg("123456-7");
		funcionario1.setIdade(37);
		funcionario1.setDepartamento("Desenvolvimento");
		funcionario1.setCargo("Desenvolvedor Full-Stack");
		funcionario1.setSalario(4500.00);
		funcionario1.setDataAdmissao(2, 4, 2024); 
		
		System.out.println("Modificadores de acesso - Exercicio 3");
		
		funcionario1.mostra();
			
	
	}

}
