package aula05;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco() {
		this.status = false;
		this.saldo = 0f;
	}
	
	public void abrirConta(int numConta, String tipo, String dono, double depositoInicial) {
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
		System.out.println("Conta aberta com sucesso!");
		System.out.println();
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Essa conta não pode ser fechada pois ainda possui saldo!");
			System.out.println();
		}
		else if (this.getSaldo() < 0){
			System.out.println("Essa conta não pode ser fechada pois possui débito!");
			System.out.println();
		}
		else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
			System.out.println();
		}
	}
	
	public void depositar(double deposito) {
		if (this.getStatus()) {
			this.saldo = saldo + deposito;
		}
		else {
			System.out.println("A conta não está ativa!");
		}
	}
	
	public void saque(double saque) {
		if (this.getStatus()) {
			if (this.getSaldo() >= saque) {
				this.saldo = saldo - saque;	
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		else {
			System.out.println("A conta não está ativa!");
		}
			
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
			System.out.println("Nome: " + this.getDono());
			System.out.println("Número da conta: " + this.getNumConta());
			System.out.println("Tipo da conta: " + this.getTipo());
			System.out.println("Saldo da conta: R$" + this.getSaldo());
		}	
		else {
			System.out.println("Essa conta está fechada!");
		}
		
	}	
	
	public void setNumConta(int numConta) {
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
