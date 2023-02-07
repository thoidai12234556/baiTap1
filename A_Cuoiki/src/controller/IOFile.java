package controller;

//import java.awt.image.BufferStrategy;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model.DanhMuc;

public class IOFile {
	public static void writeFile(String fname, ArrayList<DanhMuc> arr) {
		try {
			BufferedWriter write = new BufferedWriter(new FileWriter(fname));
			for (DanhMuc o : arr) {
				write.write("\n" + o);
			}
			write.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void readFile(String fname) {
		String line;
		try {
			BufferedReader read = new BufferedReader(new FileReader(fname));
			while ((line = read.readLine()) != null) {
				System.out.println(line);
			}
			read.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
