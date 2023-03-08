package Aula08;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public String getCnpj() {
		return (cnpj);
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + "]" + " Pessoa [pessoa=" + getPessoa() + "]";
	}

}
