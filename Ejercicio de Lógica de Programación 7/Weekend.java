package weekend;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Weekend {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String inputDay, inputTime;
		
		do {
			System.out.println("Introduce  un dia de la semana");
			inputDay = input.nextLine().toLowerCase();
		} while (!inputDay.matches("[a-z]+"));
		
		DayOfWeek day;
		day = DayOfWeek.valueOf(inputDay);
		
		do {
			System.out.println("Introduce una hora en formato HH:MM");
			inputTime = input.nextLine();
		} while (!inputTime.matches("[0-9]+"));
		
		LocalTime time;
		time = LocalTime.parse(inputTime,DateTimeFormatter.ofPattern("HH:MM"));
		
        LocalDateTime nextFriday = LocalDateTime.now().with(TemporalAdjusters.next(day)).with(LocalTime.of(15, 0));
        
        Duration duration = Duration.between(LocalDateTime.now(), nextFriday);
        long minutes = duration.toMinutes();

        // Imprimir el resultado
        System.out.println("Faltan: " + minutes + " para el fin de semana");

		
        
		input.close();
	}
}
