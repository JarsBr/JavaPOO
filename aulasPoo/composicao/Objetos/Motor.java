package Objetos;

public class Motor extends Direcao{
	private String chassi;
	private int potencia, combustivel;

	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	public Motor(String chassi, int potencia, int combustivel) {
		super();
		this.chassi = chassi;
		this.potencia = potencia;
		this.combustivel = combustivel;
	}
	public Motor() {

	}
	@Override
	public String toString() {
		return "Motor [chassi=" + chassi + ", potencia=" + potencia + ", combustivel=" + combustivel + "]";
	}
	

}
