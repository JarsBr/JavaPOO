package Aula08;

public class Pessoa {
	private String pessoa;

	public String getPessoa() {
		return (pessoa);
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Pessoa [pessoa=" + pessoa + "]";
	}

	public Pessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	public Pessoa() {
	}


}
