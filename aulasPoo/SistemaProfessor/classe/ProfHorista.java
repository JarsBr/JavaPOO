package classe;

public class ProfHorista extends Professor{
	private int hora;
	private double salarioHora;
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	public ProfHorista(String nome, int matricula, int cargaHorario, int hora, double salarioHora) {
		super(nome, matricula, cargaHorario);
		this.hora = hora;
		this.salarioHora = salarioHora;
	}
	

}
