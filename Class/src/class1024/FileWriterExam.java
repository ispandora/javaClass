package class1024;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class FileWriterExam {

	public static void main(String[] args) {
		// FileWriter writer = null;
		BufferedWriter writer = null;
		try{
			String desktop = System.getProperty ("user.home") + "/Desktop/";
			
			writer = new BufferedWriter(new FileWriter(desktop + "outfoot.dat"));
			char arr[] = {'S','h','i','t'};
			for(int i =0; i <arr.length;i++){
				writer.write(arr[i]);
			}
			
		}catch(IOException e){
			System.out.print("cant do that!");
		}finally{
			try{
				writer.close();
			}catch(Exception e){
				
			}
		}

	}

}
