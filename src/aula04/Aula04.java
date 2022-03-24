package aula04;

public class Aula04 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("BIC", 0.5f);
		c1.status();
		
		Caneta c2 = new Caneta("BIC", 0.5f);
		c2.setModelo("Outra");
		c2.setPonta(.9f);
		c2.destampar();
		c2.status();
		
		
	}
}
