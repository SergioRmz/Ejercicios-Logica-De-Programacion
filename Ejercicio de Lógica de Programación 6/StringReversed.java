package stringReversed;

import java.util.Scanner;

public class StringReversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce una cadena a invertir: ");
		Scanner input = new Scanner(System.in);
		
		String inputUser = input.nextLine();
		char [] arrayInput = inputUser.toCharArray();
		String cadenaInvertida = "";
		
		for (int i = arrayInput.length - 1; i >= 0; i--) {
			cadenaInvertida += arrayInput[i];
		}
		
		System.out.println(cadenaInvertida);
	}

}
