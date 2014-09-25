package Class;
import java.util.Scanner;
public class inclass03 {

	public static void main(String[] args) {
		
		int qnt=0, rate=0, price=1000;
		Scanner sn = new Scanner(System.in);
		System.out.println("수량 ");
		qnt = sn.nextInt();
		if(11 <= qnt && qnt <= 20){
			rate = 5;
		}else if(qnt >= 21){
			rate = 10;
		}else {
			rate = 0;
		}
		System.out.print("할인율 " + rate + "%");
		System.out.print(" 판매가 " + (price*qnt));
		System.out.println(" 할인가 " + (price*qnt*(1.0-rate/100.0)));
	}	
}
