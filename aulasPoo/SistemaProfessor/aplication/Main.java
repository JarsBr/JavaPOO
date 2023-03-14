package aplication;

import java.util.ArrayList;

import classe.ProfDE;
import classe.ProfHorista;
import classe.Professor;

public class Main {
public static void main(String[] args) {
	
	ArrayList<ProfDE> cadDE = new ArrayList<ProfDE>();
	ArrayList<ProfHorista> cadHorista = new ArrayList<ProfHorista>();
	
	cadDE.add(new ProfDE("Joao", 1, 1123.56));
	cadDE.add(new ProfDE("Maria", 2, 1200.00));
	cadHorista.add(new ProfHorista("Jose", 3, 14, 14.5));
	cadHorista.add(new ProfHorista("Fernado", 4, 12, 12.5));
	cadHorista.add(new ProfHorista("Ana", 5, 20, 12.5));
	
	System.out.println("Nome dos Professores DE:");
	for(ProfDE p: cadDE) {
		System.out.println(p.getNome());
	}
	System.out.println("Salatrio/hora dos Professores Horistas:");
	for(ProfHorista p: cadHorista) {
		System.out.println(p.getNome() + "" + p.getSalarioHora());
	}
	
}
}
