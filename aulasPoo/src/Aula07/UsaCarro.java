package Aula07;

public class UsaCarro {
public static void main(String[] args) {
	Pessoa dono1 = new Pessoa();
	dono1.setBiotipo("Mesomorfo");
	dono1.setCorDoCabelo("Preto");
	dono1.setIdade(37);
	dono1.setNome("Jancinto");
	
	Carro carro1 = new Carro();
	carro1.setDono(dono1);
	carro1.setCor("ROSA");
	carro1.setNumPortas(4);
	carro1.setPlaca("3GX");
	carro1.setTipo("Quarto Rodas");
	
	System.out.println(carro1.toString());
}
}
