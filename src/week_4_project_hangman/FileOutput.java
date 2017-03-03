package week_4_project_hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileOutput {

	// metoda koja cita podatke sa fajla i ubacuje ih u arraylist wordList
	public static void copyFileToWordList(ArrayList<String> wordList)
			throws IOException {

		Path path = Paths.get("src/week_4_project_hangman/hangman words.txt");

		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedReader reader = Files.newBufferedReader(path);

		String line = "";

		while ((line = reader.readLine()) != null) {
			wordList.add(line);
		}

		reader.close();
	}

}
