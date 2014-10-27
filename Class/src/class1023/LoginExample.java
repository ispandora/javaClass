package class1023;

import java.util.Scanner;

/*
  
  문제3)로그인
       
       아이디 암호  이름
       sman  134   슈퍼맨
       aman  120  개미맨
       tester  111  테스터

       키보드로 아이디와 암호를 입력 받고 아이디가 존재하지 않으면 
       '아이디 없음' , 아이디가 있고 암호가 틀리면 '암호가 틀림니다'
       라고 메세지를 출력하고 아이디 암호가 맞을 경우 
       '(이름)님 로그인 됐습니다' 라고 메세지 출력 (equals)


  문제4)상품
        A-100  냉장고 10000
	B-100   컴퓨터 15000
	C-100  세탁기   9000

	위와 같이 상품이 준비되어 있다 키보드로 상품 코드와 수량을
	입력 받고 없는 상품코드를 입력하면 '없는 상품코드입니다'라고 
	출력하고 존재하는 상품코드이면 입력 받은 수량을 이용해서 
	판매가를 출력하시오(equals)

 * */

public class LoginExample {

	public static void main(String[] args) {
		String id[]={"aman", "sman", "tester"};
		String pass[]={"aman", "sman", "tester"};
		String name[]={"insung", "sookyung", "yeji"};
		String inId,inPass;
		int cnt = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your id and password");
		prn();
		System.out.printf("id\t : ");
		inId = in.next();
		System.out.printf("password : ");
		inPass = in.next();
		
		for(int i = 0; i < id.length; i++){
			if (id[i].equals(inId)){
				cnt = 1;
				if(pass[i].equals(inPass)){
					cnt = 2;
					prn();
					System.out.println("Hello "+name[i]+", welcome back!");
				}else{
					prn();
					System.out.println("Wrong Password!!!");
				}
			}
		}
		if (cnt == 0){
			prn();
			System.out.println("invald id!!!");
		}
		in.close();
		
		
	}

	private static void prn() {
			System.out.println("=======================================");
		}
		
	

}
