package arrays;

class Aluno {
	String nome;
	int nota;
}

class Turma {
//	int[] notas;
	Aluno[] alunos;

	void imprimeNotas() {
		for (int i = 0; i < this.alunos.length; i++) {
			Aluno aluno = this.alunos[i];
			if(aluno == null) continue;
			System.out.println(aluno.nome );
			System.out.println("Nota: " + aluno.nota);
			System.out.println();
		}
	}
}

public class Arrays {

	public static void main(String[] args) {
//		int[] notas = new int[10];
//		notas[0] = 9;
//		notas[5]= 2;
//		notas[12] = 10;

		Turma turma = new Turma();
//		turma.notas = new int[10];
		
//		cria um array de 10 posições
		turma.alunos = new Aluno[10];
//		
//		turma.notas[0] = 9;
//		turma.notas[1] = 8;

//		cria o objeto de aluno para cada posição
		turma.alunos[0] = new Aluno();
		turma.alunos[1] = new Aluno();
		turma.alunos[2] = new Aluno();
		turma.alunos[3] = new Aluno();
	
//		atribui balores aos objetos
		turma.alunos[0].nome = "John Mello";
		turma.alunos[0].nota = 10;
		turma.alunos[1].nome = "John Mello";
		turma.alunos[1].nota = 9;
		turma.alunos[2].nome = "John Mello";
		turma.alunos[2].nota = 8;
		turma.alunos[3].nome = "John Mello";
		turma.alunos[3].nota = 7;
	
		turma.imprimeNotas();

	}

}
