package aula05;

public class Teste {
	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		c1.infoConta();
		System.out.println();
		
		c1.abrirConta(2340009, "cc", "Roberto Armando Silva", 25f);
		c1.infoConta();
		System.out.println();
		
		c1.depositar(65);
		c1.infoConta();
		System.out.println();
		
		c1.pagarMensal();
		c1.infoConta();
		System.out.println();
		
		c1.saque(100);
		c1.infoConta();
		System.out.println();
		
		c1.fecharConta();
		c1.infoConta();
		System.out.println();
		
		c1.saque(28);
		c1.saque(28);
		c1.saque(28);
		c1.infoConta();
		System.out.println();
		
		c1.fecharConta();
		c1.infoConta();
		System.out.println();
	}
}
