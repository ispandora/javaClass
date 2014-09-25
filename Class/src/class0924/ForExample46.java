package class0924;
import java.util.Scanner;
public class ForExample46 {

	public static void main(String[] args) {
		int num1, num2;
		int tab=0;
		int tot;
		Scanner key = new Scanner(System.in);
		
		System.out.print("num1= ");
		num1 = key.nextInt();
		System.out.print("num2= ");
		num2 = key.nextInt();
		
		if (num1 > num2){
			tab = num1 - num2;
			}else {
			tab = num1 + num2;
		}
		
		tot = tab + tab;
		System.out.println("Sum= "+tot);
		
	}

}
