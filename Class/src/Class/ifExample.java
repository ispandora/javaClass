package Class;
import java.util.Scanner;
public class ifExample {

	public static void main(String[] args) {
		
		String time; 
		int userTime;
		
		Scanner sn = new Scanner(System.in);
		System.out.print("time = ");
		userTime = sn.nextInt();
		
		if (userTime >= 0 && userTime <= 5) {
			time = "Dawn";
		} else if (userTime < 12) {
			time ="AM";
		} else if (userTime == 12) {
			time ="Midday";
		} else if (userTime < 20) {
			time ="PM";
		} else if (userTime < 23 ) {
			time = "Night";
		} else {
			time = "Error!!!";
		}

		System.out.println(time);
		System.out.println("Done!");
	}

}
