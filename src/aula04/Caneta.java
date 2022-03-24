package aula04;

public class Caneta {
	private String modelo;
	private float ponta;
	private boolean tampada;
	
	public Caneta(String modelo, float ponta) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Está tâmpada?: " + tampada);
		System.out.println();
	}
}
