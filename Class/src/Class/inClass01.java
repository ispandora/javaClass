package Class;
import java.util.Scanner;
public class inClass01 {

	public static void main(String[] args) {
		
		
						/* 
						  	문제1) 키보드로 국어, 수학 점수를 입력 받고 총점과 평균을 
							출력하시오 (평균은 소수점 이하도 출력)
					
							문제3) 상품의 수량을 입력 받고 수량에 따른 할인률과 정상가 할인가를 출력하시오.(단가는 1000이다)
							11~20 : 5%
							21~ : 10% 
					        수량:11
					        할인률 5% 정상가 11000 할인가 10450   
					        
					        */

		
		int kor;
		int mat;
		int tot;
		double avg;
		
		Scanner sn = new Scanner(System.in);
		System.out.println("korean Score = ");
		kor = sn.nextInt();
		System.out.println("Math Score = ");
		mat = sn.nextInt();
		
		tot = kor + mat;
		avg = tot / 2 ;
		
		System.out.println("total = " + tot + " / avg." + avg);
		

	}

}
