package class0924;
import java.util.Scanner;
public class ForExample46 {

	public static void main(String[] args) {
		int num1, num2;
		int tot=0;
		Scanner key = new Scanner(System.in);
		
		System.out.print("num1= ");
		num1 = key.nextInt();
		System.out.print("num2= ");
		num2 = key.nextInt();
		
		if (num2 < num1) {
			for(int i = num2 ; i <= num1 ; i++){
				tot = tot + i;
			}
			
		} else {
				for(int i = num1 ; i <= num2 ; i ++ ) {
					tot = tot + i;
			}
			
		}
		

		System.out.println("Sum= "+tot);
		
	}

}
