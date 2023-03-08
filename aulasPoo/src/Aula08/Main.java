package Aula08;

public class Main {
	public static void main(String[] args) {
		
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setPessoa("Ricadorson");
		System.out.println(pessoa01.toString());
		
		PessoaFisica pessoa02 = new PessoaFisica();
		pessoa02.setPessoa("Maria");
		pessoa02.setRg("90123454-2");
		System.out.println(pessoa02.toString());
	}

}
