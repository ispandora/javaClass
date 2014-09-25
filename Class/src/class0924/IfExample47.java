package class0924;
import java.util.Scanner;
public class IfExample47 {

	public static void main(String[] args) {
		int dan;
		Scanner key = new Scanner(System.in);
		System.out.print("dan?");
		dan = key.nextInt();
		
		for(int i =1 ; i < 10 ; i++){
			System.out.println(dan +" X "+ i + " = " +(dan * i));
		}
		System.out.print("done!");
	}

}
