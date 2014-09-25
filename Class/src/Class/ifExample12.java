package Class;
import java.util.Scanner;
public class ifExample12 {

	public static void main(String[] args) {
			int userTime;
			int price = 10000;
			int disPrice; // time disc
			int disPriceAge; // age disc
			int userAge;
			String priceName;
			String priceAge;
			
			Scanner key = new Scanner(System.in);
			
			System.out.print("Time : ");
			userTime = key.nextInt();
			System.out.print("Age : ");
			userAge = key.nextInt();
			
			
			if (userTime >= 1 && userTime < 9) {
				disPrice = 0;
				priceName = "No Discount";
			} else if (userTime >= 9 && userTime >= 12) {
				disPrice = 5000;
				priceName = "Early Morning Discount";
			} else if (userTime < 18) {
				disPrice = 2000;
				priceName ="Afternoon Discount";
			} else if (userTime < 24){
				disPrice = 0;
				priceName ="No Discount";
			} else { 
				priceName = "Error!!!!! ";
				disPrice = 0;
			}
			
			if (userAge >= 1 && userAge <= 5){
				disPriceAge = 2000;
				priceAge ="Baby Discount";
				
			} else if (userAge >= 6 && userAge <= 12){
				disPriceAge = 1000;
				priceAge ="Kid Discount";
			} else if (userAge < 150){
				disPriceAge= 0;
				priceAge = "No Discount";
			} else {
				disPriceAge = 0;
				priceAge ="Error!!!";
			}
			
			
			System.out.println("Price : "+price +" won");
			System.out.println(priceName + " : -"+disPrice +"");
			System.out.println(priceAge +" : -"+disPriceAge);
			System.out.println("Ticket Price : " + ((price - disPrice)-disPriceAge) + " won");
	}

}
