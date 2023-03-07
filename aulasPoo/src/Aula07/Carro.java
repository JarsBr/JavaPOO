package Aula07;

public class Carro {
	private String tipo;
	private String cor;
	private String placa;
	private int numPortas;
	private Pessoa dono;
	private int cambio;

	public int getCambio() {
		System.out.println("Marcha "+ this.cambio);
		return cambio;
	}
	public void setCambio(int cambio) {
		this.cambio = cambio;
	}
	public Pessoa getDono() {
		return dono;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public Carro() {

	}
	public Carro(String tipo, String cor, String placa, int numPortas) {
		this.tipo=tipo;
		this.cor=cor;
		this.placa=placa;
		this.numPortas=numPortas;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	void ligar() {
		System.out.println("Carro ligado");
	}
	void desligar() {
		System.out.println("Carro desligado");
	}
	void acelerar() {
		System.out.println("VRUMM VRUMM");
	}
	void frear() {
		System.out.println("Carro Freando");
	}
	@Override
	public String toString() {
		return "Carro ---- tipo: " + tipo + " // cor: " + cor + " // placa: " + placa + " // numPortas: " + numPortas+ dono.toString();
	}
}
