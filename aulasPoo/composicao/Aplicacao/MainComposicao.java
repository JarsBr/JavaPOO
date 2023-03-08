package Aplicacao;

import Objetos.Automovel;
import Objetos.Motor;

public class MainComposicao {
	public static void main(String[] args) {
		Automovel carro01 = new Automovel();
		carro01.setChassi("123ABC");
		carro01.setCombustivel(100);
		carro01.setCor("Azul");
		carro01.setKitMultimidida(true);
		carro01.setPotencia(150);
		carro01.setTamanhoRaio("27");
		carro01.setTipo("Passeio");
		System.out.println(carro01.toString());
	}

}
