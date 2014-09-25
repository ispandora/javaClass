package Class;
import java.util.Scanner;

public class inClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		문제2)아래 상품을 선택하고 수량을 입력하면 판매가를 출력하시오 
		1:새우뽕1000 
		2:맛뒷산1500
		3:감자집2000
		                   상품:1
		                   수량:2
		                    2000원 */
		int sewoo = 1000 ;
		int mat = 1500 ;
		int gamja = 2000 ; 
		int prod;
		int count;
		int tot = 0;
		
		System.out.println("1.새우깡:"+sewoo);
		System.out.println("2.맛동산:"+mat);
		System.out.println("3.감자침"+gamja);
		
		Scanner cn = new Scanner(System.in);
		
		System.out.print("product = ");
		prod = cn.nextInt();
		System.out.print("count = ");
		count = cn.nextInt();
		
		
		if ( prod == 1 ) {
			tot = sewoo * count;
		} else if (prod == 2){
			tot = mat * count;
		} else if (prod == 3){
			tot = gamja * count;
		} else {
			System.out.println("Error!!");
		}
		

		System.out.print(tot + " won");

	}

}
