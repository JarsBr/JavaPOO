package Aula08;

public class PessoaFisica extends Pessoa{
	private String rg;

	public String getRg() {
		return (rg);
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "PessoaFisica [rg=" + rg + "]" + " Pessoa [pessoa=" + getPessoa() + "]";
	}

	public PessoaFisica(String pessoa, String rg) {
		super(pessoa);
		this.rg = rg;
	}
	public PessoaFisica() {

	}
}
