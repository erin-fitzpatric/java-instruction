package ui;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import util.Console;

public class CountriesIOApp {

	public static void main(String[] args) throws IOException {
		// pg.463 create directory
		String dirString = "c:/repos/java-instruction/ch15_prj1_CountryListManager/src/ui";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
		}

		// p. 463 Create a File
		String fileString = "countries.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
		System.out.println("Welcome to Country List Manager");

		int input = 0;
		while (input != 3) {
			System.out.println("\nCOMMAND MENU\n" + "1 - List Countries\n" + "2 - Add a Country\n" + "3 - Exit\n");
			input = Console.getInt("Enter menu number: ", 0, 4);
			if (input == 1) {
				ArrayList<String> list = getCountries();
				for (String country : list) {
					System.out.println(country);
				}
			} else if (input == 2) {
				ArrayList<String> list = getCountries();
				String newCountry = Console.getString("Enter Country: ");
				list.add(newCountry);
				saveCountries(list);
				System.out.println("This country has been saved.");
			}
		}

		System.out.println("Bye!");
	}

	// TODO get
	public static ArrayList<String> getCountries() throws IOException {
		ArrayList<String> countryArray = new ArrayList<String>();
		
		// establish a file path
		Path countriesPath = Paths.get("countries.txt");
		if (Files.notExists(countriesPath)) {
			Files.createFile(countriesPath); // added throws exception // refresh project after running
			return countryArray;
		}
		// create an instance of a file
		File countriesFile = countriesPath.toFile();

		
		BufferedReader fileIn = new BufferedReader(new FileReader(countriesFile));
		
		String country = fileIn.readLine();
		while (country != null) {
			countryArray.add(country);
			country = fileIn.readLine();
		}
		fileIn.close();
		return countryArray;
	}

	// TODO save
	public static void saveCountries(ArrayList<String> countries) throws IOException {
		// create an instance of a file
		Path countriesPath = Paths.get("countries.txt");
		File countriesFile = countriesPath.toFile();
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile)));

		// write to file
		for (String country : countries) {
			out.println(country);
		}
		// flush data
		out.close();
	}
}
