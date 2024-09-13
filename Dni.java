package com.ifpvg.pruebainicial;
import java.util.HashMap;

public class Dni {

	public static void main(String[] args) {
		HashMap<Integer, String> letrasDni = new HashMap<Integer, String>();
		letrasDni.put(0, "T"); letrasDni.put(1, "R");	letrasDni.put(2, "W");	letrasDni.put(3, "A");	letrasDni.put(4, "G");
		letrasDni.put(5, "M");	letrasDni.put(6, "Y");	letrasDni.put(7, "F");	letrasDni.put(8, "P");	letrasDni.put(9, "D");
		letrasDni.put(10, "X");	letrasDni.put(11, "B");	letrasDni.put(12, "N");	letrasDni.put(13, "J");	letrasDni.put(14, "Z");
		letrasDni.put(15, "S");	letrasDni.put(16, "Q");	letrasDni.put(17, "V");	letrasDni.put(18, "H");	letrasDni.put(19, "L");
		letrasDni.put(20, "C");	letrasDni.put(21, "K");	letrasDni.put(22, "E");
		
		int resto = Integer.parseInt(args[0]) % 23;
		String letra = letrasDni.get(resto);
		
		System.out.println(args[0] + letra);
	}
}

