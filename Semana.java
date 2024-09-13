package com.ifpvg.pruebainicial;
import java.util.ArrayList;

public class Semana {

	public static void main(String[] args) {
		
		ArrayList<String> dias = new ArrayList<String>();
		dias.add("Lunes");
		dias.add("Martes");
		dias.add("Miércoles");
		dias.add("Jueves");
		dias.add("Viernes");
		dias.add("Sábado");
		dias.add("Domingo");
		
		int cont = 0;
		while (cont <= dias.size()-1) {
			System.out.println(dias.get(cont));
			cont++;
		}
	}
}
