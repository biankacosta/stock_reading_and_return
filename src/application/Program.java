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
		
		new File(path_parent + "\\subdir").mkdir();
		
		String exit_path = path_parent+"\\subdir"+"\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(exit_path));
			
			while (line != null) {
				String[] product_info = line.split(",");
				
				Product p = new Product(product_info[0], Double.parseDouble(product_info[1]), Integer.parseInt(product_info[2]));
				
				bw.write(p.getName()+","+p.totalPrice());
				bw.newLine();
				
				line = br.readLine();
			}
			
			bw.close();
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
