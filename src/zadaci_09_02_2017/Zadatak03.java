package zadaci_09_02_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zadatak03 {

	public static void main(String[] args) throws IOException {

		/*
		 * Napišite program koji æe brojati broj karaktera, rijeèi i linija
		 * teksta u nekom fileu. Rijeèi trebaju biti odvojene jednim spaceom.
		 * Ime file proslijediti kao argument u vaš program.
		 */

		String fileName = args[0];
		Path path = Paths.get(fileName);
		
		// provjeravamo da li postoji fajl, ako ne, kreiramo novi fajl
		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		int countLine = 0, countChar = 0, countWord = 0;
		
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line = "";
			
			// prolazimo petljom kroz fajl
			while ((line = reader.readLine()) != null) {
				// podijelimo svaki red u fajlu u niz rijeci
				String[] array = line.split(" ");
				
				// brojac rijeci povecavamo za velicinu niza koji sadrzi broj rijeci
				// u svakoj liniji
				countWord += array.length;
				
				// brojac karaktera povecavamo za duzinu linije
				countChar += line.length();
				
				// brojac linija povecavamo za 1
				countLine++;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// ispisujemo broj linija, broj karaktera i broj rijeci u fajlu
		System.out.println("Broj linija u fajlu: " + countLine);
		System.out.println("Broj karaktera u fajlu: " + countChar);
		System.out.println("Broj rijeèi u fajlu: " + countWord);

	}

}
