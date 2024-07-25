package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		String path = "D:\\DOCUMENTOS\\sum.csv";
		File path_file = new File(path);
		
		String path_parent = path_file.getParent();
		//System.out.println(path_parent);
		
		String exit_path = path_parent+"\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] product_info = line.split(",");
				
				Product p = new Product(product_info[0], Double.parseDouble(product_info[1]), Integer.parseInt(product_info[2]));
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(exit_path));
				bw.write("oi");
				bw.write(p.getName()+","+p.getUnitary_price());
				bw.newLine();
				
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	
		

	}

}
