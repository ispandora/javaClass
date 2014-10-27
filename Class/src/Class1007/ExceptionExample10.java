package Class1007;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample10 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("input error!!");
		}
		catch (IOException e){
			System.err.println("File not Found!!");
		}

	}

}
