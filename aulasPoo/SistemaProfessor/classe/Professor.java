package classe;

public class Professor {
	private String nome;
	private int matricula, cargaHorario;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getCargaHorario() {
		return cargaHorario;
	}
	public void setCargaHorario(int cargaHorario) {
		this.cargaHorario = cargaHorario;
	}
	public Professor(String nome, int matricula, int cargaHorario) {
		this.nome = nome;
		this.matricula = matricula;
		this.cargaHorario = cargaHorario;
	}
	public Professor() {

	}



}


