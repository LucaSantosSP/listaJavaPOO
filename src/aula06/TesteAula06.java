package aula06;

public class TesteAula06 {
	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.abrirMenu();
		
		c.maisVolume();
		c.maisVolume();
		c.maisVolume();
		c.play();
		c.abrirMenu();
		
		c.ligarMudo();
		c.abrirMenu();
	}
}
