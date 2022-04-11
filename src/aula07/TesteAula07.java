package aula07;

public class TesteAula07 {
	public static void main(String[] args) {
		Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
		Lutador l2 = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		Lutador l3 = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		Lutador l4 = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
		Lutador l5 = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
		Lutador l6 = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);
		
		l1.apresentar();
		l2.apresentar();
		l2.ganharLuta();
		l1.perderLuta();
		
		l3.apresentar();
		l4.apresentar();
		l3.empatarLuta();
		l4.empatarLuta();
		
		l5.apresentar();
		l6.apresentar();
		l5.ganharLuta();
		l6.perderLuta();
		
		l1.status();
		l2.status();
		l3.status();
		l4.status();
		l5.status();
		l6.status();
	}
}
