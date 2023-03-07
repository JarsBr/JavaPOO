package sistemabanco;
import java.util.Scanner;

public class Banco {public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	Conta dadosConta  = new Conta();
	
	System.out.println("Qual conta?");
	dadosConta.setNumero(ler.nextInt());
	dadosConta.getNumero();
	
	System.out.println("Qual nome?");
	dadosConta.setNome(ler.next());
	dadosConta.getNome();
	
	System.out.println("Qual saldo?");
	dadosConta.setSaldo(ler.nextDouble());
	dadosConta.getSaldo();

	System.out.println("Qual limite?");
	dadosConta.setLimite(ler.nextDouble());
	dadosConta.getLimite();
	
	System.out.println(dadosConta.mostrar());
	
	System.out.println("Deseja Sacar, Depositar ou Transferir?");
	int acao = ler.nextInt(); 
	if (acao == 1) {
		
		System.out.println("Qual valor deseja sacar?");
		dadosConta.Sacar(ler.nextDouble());

		
	}else if (acao == 2) {
		
		System.out.println("Qual valor deseja depositar?");
		dadosConta.Deposita(ler.nextDouble());
		
	} else if (acao == 3) {

		System.out.println("Para qual conta deseja tranferir?");
		int conta = ler.nextInt();
		
		System.out.println("Qual valor deseja tranferir?");
		double valor = ler.nextDouble(); 
		dadosConta.Transfere(conta, valor);
		
	} else {
		System.out.println("Nenhuma das opcoes!!!");
}
}}

