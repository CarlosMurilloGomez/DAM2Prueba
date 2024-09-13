package com.ifpvg.pruebainicial;

public class Par {

	public static void main(String[] args) {
		generarPares(49);
	}
	public static void generarPares(int limite) {
		for (int num = 0; num<=limite; num=num+2) {
			if (num != limite && num != limite-1) {
				System.out.print(num +", ");

			}
			else {
				System.out.print(num);

			}
		}
	}

}
