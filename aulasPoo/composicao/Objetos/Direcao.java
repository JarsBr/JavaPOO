package Objetos;

public class Direcao {
	private String cor, tamanhoRaio;
	private boolean kitMultimidida;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTamanhoRaio() {
		return tamanhoRaio;
	}
	public void setTamanhoRaio(String tamanhoRaio) {
		this.tamanhoRaio = tamanhoRaio;
	}
	
	public boolean isKitMultimidida() {
		return kitMultimidida;
	}
	public void setKitMultimidida(boolean kitMultimidida) {
		this.kitMultimidida = kitMultimidida;
	}
	public Direcao(String cor, String tamanhoRaio, boolean kitMultimidida) {
		super();
		this.cor = cor;
		this.tamanhoRaio = tamanhoRaio;
		this.kitMultimidida = kitMultimidida;
	}
	public Direcao() {
	}
	@Override
	public String toString() {
		return "Direcao [cor=" + cor + ", tamanhoRaio=" + tamanhoRaio + ", kitMultimidida=" + kitMultimidida + "]";
	}
	

}
