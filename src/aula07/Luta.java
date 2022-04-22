package aula07;
import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	//Métodos
	public void marcarLuta(Lutador desafiante, Lutador desafiado) {
		if(desafiado.getCategoria().equals(desafiado.getCategoria()) && desafiado != desafiante) {
			this.setAprovado(true);
			this.setDesafiado(desafiado);
			this.setDesafiante(desafiante);
		}
		else {
			this.setAprovado(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar() {
		if(this.getAprovado()) {
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
				case 0:
					System.out.println("### EMPATE ###");
					this.getDesafiado().empatarLuta();
					this.getDesafiante().empatarLuta();
					break;
				case 1:
					System.out.println("### VITÓRIA DE " + this.getDesafiante().getNome() + " ###");
					this.getDesafiado().perderLuta();
					this.getDesafiante().ganharLuta();
					break;
				case 2:
					System.out.println("### VITÓRIA DE " + this.getDesafiado().getNome() + " ###");
					this.getDesafiado().ganharLuta();
					this.getDesafiante().perderLuta();
					break;
			}	
		}
		else {
			System.out.println("A luta não pode acontecer!");
		}
	}
	
	//Métodos Especiais
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public int getRounds() {
		return this.rounds;
	}
	
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	public boolean getAprovado() {
		return this.aprovado;
	}
}
