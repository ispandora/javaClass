package class1023;

import java.util.Scanner;
/*
����2-1) ����2���� @�� .co.kr �Ǵ� .com ���̿� ���ڰ� ������ �����߰�
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
