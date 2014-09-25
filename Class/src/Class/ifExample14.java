package Class;
import java.util.Scanner;
public class ifExample14 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		
		int userTime;
		int pay;
		int payhour=6000; // basic pay
		int payOver = 0; // overtime 
		int payOvertot = 0 ;
		int tex=0; 
		int tot;
		int payTot;
		int payTotal =0; //  total pay
		
		
		System.out.print("hour ");
		userTime = key.nextInt();
		
		if (userTime >= 80) {
			payOver = userTime - 80;
			payOvertot = payOver * 7000;
			} 
		
		pay = (userTime - payOver) * payhour;
		payTotal = pay + payOvertot;
		tex = (int) (payTotal * 0.033);
		tot= payTotal-tex;
		payTot =((tot /100)*100); // 10단위 이하 절삭 
		
		
		System.out.println("Work hour :" + (userTime -payOver) +" hour > " + pay +" won");
		System.out.println("Over time :" + payOver +" hour > " +payOvertot+" won");
		System.out.println("Work pay : "+payTotal+" won");
		System.out.println("Tax : "+tex+" won");
		System.out.println("Total pay : "+ payTot + "won (10단위이하 절삭)") ; 

	}

}
