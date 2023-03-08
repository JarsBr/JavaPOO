package Objetos;

public class Automovel extends Motor{
	private String tipo;
	Motor motor = new Motor();
	Direcao direcao = new Direcao();

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Automovel(String tipo, Motor motor, Direcao direcao) {
		super();
		this.tipo = tipo;
		this.motor = motor;
		this.direcao = direcao;
	}
	public Automovel(){
		
	}
	@Override
	public String toString() {
		return "Automovel [tipo=" + tipo + "]" +
				"\nMotor [chassi=" + getChassi() + ", potencia=" + getPotencia() + ", combustivel=" + getCombustivel() + "%]" +
				"\nDirecao [cor=" + getCor() + ", tamanhoRaio=" + getTamanhoRaio() + ", kitMultimidida=" + isKitMultimidida() + "]";
	}
	
}
