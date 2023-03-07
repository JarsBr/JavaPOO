package sobrecarga;

public class teste2 {


	public void calculo() {
		System.out.println("Deu certo");
	}
	public int calculo(int x, int y) {
		return x + y;
	}
	public float calculo(float x, float y) {
		return x + y;
	}

}
