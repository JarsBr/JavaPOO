package classe;

public class ProfDE extends Professor{
private double salario;

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public ProfDE(String nome, int matricula, double salario) {
	super(nome, matricula, 40);
	setSalario(salario);
}


}
