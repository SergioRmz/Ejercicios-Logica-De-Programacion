package stringReversed;

import java.util.Scanner;

public class StringReversed {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce una cadena a invertir: ");
		String inputUser = input.nextLine();
		
		String cadenaInvertida = "";
		if (inputUser.matches("\\d+")) {
			System.out.println("Intenta nuevamente");
		} else {
			char [] arrayInput = inputUser.toCharArray();
			for (int i = arrayInput.length - 1; i >= 0; i--) {
				cadenaInvertida += arrayInput[i];
			}
		}
		
		System.out.println(cadenaInvertida);
		
		input.close();
	}

}
