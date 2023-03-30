package guessWords;
import java.util.HashMap;
import java.util.Scanner;

public class GuessWords {

	public static void main(String[] args) {
		
		// Creacion del diccionario
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("gato", "cat");
        dictionary.put("perro", "dog");
        dictionary.put("casa", "house");
        dictionary.put("coche", "car");
        dictionary.put("hola", "hello");
        dictionary.put("adiós", "goodbye");
        dictionary.put("comida", "food");
        dictionary.put("bebida", "drink");
        dictionary.put("manzana", "apple");
        dictionary.put("naranja", "orange");
        dictionary.put("azul", "blue");
        dictionary.put("verde", "green");
        dictionary.put("rojo", "red");
        dictionary.put("amarillo", "yellow");
        dictionary.put("blanco", "white");
        dictionary.put("negro", "black");
        dictionary.put("mesa", "table");
        dictionary.put("silla", "chair");
        dictionary.put("libro", "book");
        dictionary.put("ordenador", "computer");

        // Seleccionar 5 palabras al azar
        String [] words = {"gato", "perro", "casa", "coche", "hola"}; // Implementar que sea un arreglo aleatorio
        Scanner input = new Scanner(System.in);
        
        int numWords = words.length;
        int rightAnswers = 0;
        int wrongAnswers = 0;

        for (int i = 0; i < numWords; i++) {
            String word = words[i];
            String translate = dictionary.get(word);
            
            // Pide al usuario que ingrese la traducción de cada palabra
            
            System.out.println("¿Cuál es la traducción en inglés de \"" + word + "\"?");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase(translate)) {
                System.out.println("Respuesta correcta!");
                rightAnswers ++;
            } else {
                System.out.println("Respuesta incorrecta :/ .La traducción correcta es: " + translate);
                wrongAnswers++;
            }
        }

        // Mostrar el resultado
        System.out.println("\nTU PUNTAJE ES:");
        System.out.println("Respuestas correctas: " + rightAnswers);
        System.out.println("Respuestas incorrectas: " + wrongAnswers);
        
        input.close();
	}
}
