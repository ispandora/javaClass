package class1023;

import java.util.Scanner;

/*
  
  ����3)�α���
       
       ���̵� ��ȣ  �̸�
       sman  134   ���۸�
       aman  120  ���̸�
       tester  111  �׽���

       Ű����� ���̵�� ��ȣ�� �Է� �ް� ���̵� �������� ������ 
       '���̵� ����' , ���̵� �ְ� ��ȣ�� Ʋ���� '��ȣ�� Ʋ���ϴ�'
       ��� �޼����� ����ϰ� ���̵� ��ȣ�� ���� ��� 
       '(�̸�)�� �α��� �ƽ��ϴ�' ��� �޼��� ��� (equals)


  ����4)��ǰ
        A-100  ����� 10000
	B-100   ��ǻ�� 15000
	C-100  ��Ź��   9000

	���� ���� ��ǰ�� �غ�Ǿ� �ִ� Ű����� ��ǰ �ڵ�� ������
	�Է� �ް� ���� ��ǰ�ڵ带 �Է��ϸ� '���� ��ǰ�ڵ��Դϴ�'��� 
	����ϰ� �����ϴ� ��ǰ�ڵ��̸� �Է� ���� ������ �̿��ؼ� 
	�ǸŰ��� ����Ͻÿ�(equals)

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
