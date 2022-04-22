package aula09;

public class TesteAula09 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", 21, "M");
		Livro l1 = new Livro("Moby Dick", "Herman Melville", 648, p1);
		
		p1.fazerAniver();
		System.out.println(l1.detalhes());
		
	}
}
