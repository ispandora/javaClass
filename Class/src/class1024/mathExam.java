package class1024;

import java.util.Random;

class mathExam {

	public static void main(String[] args) {
		double a = 3.5;
		System.out.println(Math.round(a));
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println("==========================");
		System.out.println("2�� 3����?"+Math.pow(2, 3));
		System.out.println("16�� ��������? "+ Math.sqrt(16));
		System.out.println("4�� 7�� ū���� ?"+Math.max(4,7));
		System.out.println("4�� 7�� ��������? "+Math.min(4, 7));
		System.out.println("==========================");
		System.out.println("sin(pi) = "+Math.sin(Math.PI));
		System.out.println("cos(pi) = "+Math.cos(Math.PI));
		System.out.println("tan(pi) = "+Math.tan(Math.PI));
		System.out.println("==========================");
		Random random = new Random();
		System.out.println(Math.random());
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
	}

}
