package dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Crear diccionario con algunas palabras en español y su traducción en inglés
        Map <String, String> dictionary = new HashMap<>();
        dictionary.put("gato", "cat");
        dictionary.put("perro", "dog");
        dictionary.put("casa", "house");
        dictionary.put("coche", "car");
        dictionary.put("jardin", "garden");
        dictionary.put("comida", "food");
        dictionary.put("agua", "water");
        dictionary.put("amigo", "friend");
        dictionary.put("familia", "family");
        dictionary.put("juego", "game");
        dictionary.put("trabajo", "work");
        dictionary.put("escuela", "school");
        dictionary.put("cama", "bed");
        dictionary.put("libro", "book");
        dictionary.put("telefono", "phone");
        dictionary.put("ordenador", "computer");
        dictionary.put("ciudad", "city");
        dictionary.put("pais", "country");
        dictionary.put("musica", "musidiccionarioc");
        dictionary.put("arte", "art");

        // Pedir al usuario que ingrese una palabra en español
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa una palabra en español sin acentos ni otros simbolos: ");
        String palabra = input.nextLine().toLowerCase();

        // Buscar la traducción de la palabra en el diccionario
        String word = dictionary.get(palabra);

        // Mostrar la traducción o un mensaje en caso de no encontrarla
        if (word != null) {
            System.out.println("La traducción de \"" + palabra + "\" es \"" + word + "\"");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no se encuentra en el diccionario");
        }
        
        input.close();
	}
}
