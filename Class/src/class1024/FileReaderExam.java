package class1024;
import java.io.*;

public class FileReaderExam {

	public static void main(String[] args) {
		FileReader reader = null;
		try{
			String desktop = System.getProperty ("user.home") + "/Desktop/";
			reader = new FileReader(desktop + "screen.txt");
			
			while(true){
				int data = reader.read();
				if(data == -1){
					break;
				}
				char ch = (char)data;
				System.out.print(ch);
			}
		}catch(FileNotFoundException e){
			System.out.println("not found");
		}catch(IOException e){
			System.out.println("io Exception");
		}finally{
			try{
				reader.close();
			}catch(Exception e){
				
			}
		}
		
		
		
		
	}
	
}
