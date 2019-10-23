package ui;

import java.io.*; // added wild card *;
import java.nio.file.*; //added wild card *;
import java.util.ArrayList;
import java.util.List;

import business.Product;
import util.Console;

public class ProductFileManagerApp {
	private static List<Product> products = new ArrayList<>();
	private static File productsFile;
	
	public static void main(String[] args) throws IOException {

		// establish a file path
		Path productsPath = Paths.get("products.txt");
		if (Files.notExists(productsPath)) {
			Files.createFile(productsPath); // added throws exception // refresh project after running
		}
		// create an instance of a file
		productsFile = productsPath.toFile();

		// read data from an input file

		BufferedReader in = new BufferedReader(new FileReader(productsFile));
		// read data from the stream and print to console
		String line = in.readLine();
		while (line != null) {
			String[] fields = line.split("\t");
			String code = fields[0];
			String desc = fields[1];
			String price = fields[2];

			double priceDb1 = Double.parseDouble(price);
			Product p = new Product(code, desc, priceDb1);

			System.out.println(p);
			products.add(p);
			line = in.readLine();
		}

		in.close();

		// Add a new product
		System.out.println("Add a new product:");
		String code = Console.getString("Enter code: ");
		String desc = Console.getString("Enter description: ");
		double price = Console.getDouble("Enter price: ");
		Product pdt = new Product(code, desc, price);
		products.add(pdt);
		// Save all products to file
		saveAll();

		System.out.println("New List of Products: ");
		for (Product p : products) {
			System.out.println(p);
		}

	}

	// Save All Method 
	private static boolean saveAll() {
		try (PrintWriter out = new PrintWriter(
							   new BufferedWriter(
							   new FileWriter(productsFile)))) {
			for (Product p: products) {
				out.print(p.getCode()+"\t");
				out.print(p.getDescription()+"\t");
				out.println(p.getPrice());  /// MAKE SURE YOU HAVE println and not print
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
	}
}
