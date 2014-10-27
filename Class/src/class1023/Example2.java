package class1023;

import java.util.Scanner;
/*
문제2-1) 문제2에서 @과 .co.kr 또는 .com 사이에 문자가 없으면 오류추가
*/
public class Example2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String email="";
		System.out.println("email : ");
		email = in.next();
		if(email.indexOf('@') == -1 || (email.indexOf("co.kr") == -1 && email.indexOf(".com") == -1)){
			System.out.println("email error!!");
		}else {
			System.out.println("okay!!");
		}
		in.close();
	}

}
