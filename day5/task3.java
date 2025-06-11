package program;// file write String
import java.io.*;
public class task3 {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("C:\\\\Users\\\\TEMP\\\\Documents\\\\sample.txt");
			fw.write("hi this is somachandran bca 2");
			fw.close();
			System.out.println("the information is added in sample file");
		}catch(IOException e) {
			System.out.println("file not found");
		}
		

	}

}
