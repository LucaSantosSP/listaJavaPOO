package aula07;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, 
			double peso, int vitorias, int derrotas, int empates) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}
	
	public void apresentar() {
		System.out.println("------------------------------------------");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos");
		System.out.println(this.getAltura() + " m de altura");
		System.out.println("Pesando: " + this.getPeso() + " Kg");
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
	}
	
	public void status() {
		System.out.println();
		System.out.print(this.getNome());
		System.out.print(" é um peso " + this.getCategoria() + ", ");
		System.out.print(this.getVitorias() + " vitórias, ");
		System.out.print(this.getDerrotas() + " derrotas e ");
		System.out.print(this.getEmpates() + " empates");
	}
	
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}
	
	// Métodos get e set
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		}
		else if (this.getPeso() < 70.3) {
			this.categoria = "Leve";
		}
		else if (this.getPeso() < 83.9) {
			this.categoria = "Médio";
		}
		else if (this.getPeso() < 120.2) {
			this.categoria = "Pesado";
		}
		else {
			this.categoria = "Inválido";
		}
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getVitorias() {
		return this.vitorias;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getDerrotas() {
		return this.derrotas;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public int getEmpates() {
		return this.empates;
	}
	
}
