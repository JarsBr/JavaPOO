package classe;

public class ProfHorista extends Professor{
	private double salarioHora;
	
	public double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	public ProfHorista(String nome, int matricula, int cargaHorario, double salarioHora) {
		super(nome, matricula, cargaHorario);
		this.salarioHora = salarioHora;
	}
	public double getSalario() {
		return (salarioHora * getCargaHorario() * 4.5);
		
	}

}
