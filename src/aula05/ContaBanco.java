package aula05;

public class ContaBanco {
	public Integer numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco() {
		this.status = false;
		this.saldo = 0f;
	}
	
	public void abrirConta(Integer numConta, String tipo, String dono, double depositoInicial) {
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		if (tipo == "cc") {
			this.saldo = 50 + depositoInicial;
		}
		else {
			this.saldo = 150 + depositoInicial;
		}
		this.status = true;
	}
	
	public void fecharConta() {
		if (this.saldo == 0) {
			this.numConta = null;
			this.tipo = null;
			this.dono = null;
			this.status = false;
		}
		else {
			System.out.println("Para fechar uma conta ela precisa estar com um saldo igual a zero!");
		}
	}
	
	public void depositar(double deposito) {
		this.saldo = saldo + deposito;
	}
	
	public void saque(double saque) {
		this.saldo = saldo - saque;		
	}
	
	public void pagarMensal() {
		if (this.tipo == "cc") {
			this.saldo = saldo - 12;
		}
		else {
			this.saldo = saldo - 20;
		}
	}
	
	public void infoConta() {
		if ( this.status == true) {
			System.out.println("Nome: " + getDono());
			System.out.println("Número da conta: " + getNumConta());
			System.out.println("Tipo da conta: " + getTipo());
			System.out.println("Saldo da conta: R$" + getSaldo());
		}	
		else {
			System.out.println("Essa conta está fechada!");
		}
		
	}	
	
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}
	
	public Integer getNumConta() {
		return this.numConta;
	}
	
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setDono (String dono) {
		this.dono = dono;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setStatus (boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
		return this.status;
	}
}
