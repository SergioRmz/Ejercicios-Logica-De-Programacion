package primeNumbers;
import java.util.Scanner;

public class PrimeNumbers {
	
	public static boolean isPrime(int inputNumber){
		boolean isItPrime = true;
		 
		if(inputNumber <= 1) {
			isItPrime = false;
			
		}else{
		for (int i = 2; i<= inputNumber/2; i++) {
			if ((inputNumber % i) == 0){
				isItPrime = false;
			}
		}	
	}
		return isItPrime;
}
	
	public static void getNumbers(Scanner input, int[] numbers) {
		int counter = 0;
		int reverseCounter = 9;
		int i = 1;
		
		for(int number : numbers) {
			number = input.nextInt();
			if(isPrime(number)== true) {
				
				numbers[counter] = number;
				counter++;

			}else if(isPrime(number) == false){
				numbers[reverseCounter] = number;
				reverseCounter --;
			}
			
		}
		
		for(int element : numbers) {
			
			System.out.println(i + "-" + element + ".");
			i++;
			}
		}
	


	public static void main(String[] args) {
		
		int [] numbersArray = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa 10 numeros a guardar:");
		getNumbers(input, numbersArray);	
		
		input.close();
		}
}