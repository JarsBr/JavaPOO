package sistemabanco;

public class Conta {
	private int numero;
	private double saldo, limite;
	private String nome;

////////////////////////////////////////////////////////////////////
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero ;
	}

		public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;	
}

	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;	
}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;	
		}
	
///////////////////////////////////////////////////////////////////
	
public void Sacar(double valor) {
	double saque = valor;
	if (saque <= saldo) {
		saldo = (saldo - saque);
		System.out.println("Você fez um saque de " + saque + " e seu saldo é de " + saldo);
	} else {
		System.out.println("Seu saldo é insuficiente");
  }
}	


	public void Deposita(double valor) {
		double deposito = valor;
		saldo = deposito + saldo;
		System.out.println("Você efetuou um deposito de " + deposito + " e seu saldo é de " + saldo);
	 }
			
	public void Transfere(int numero, double valor ) {
		this.numero = numero;
		
		
		double trans = valor;
		saldo =  saldo - trans;
		System.out.println("Você efetuou um deposito de " + trans + " na conta " + numero + " e seu saldo é de " + saldo);
	}
	
	public String mostrar() {
		return numero + " // " + nome + " // " + saldo + " // " + limite;
	}

}
