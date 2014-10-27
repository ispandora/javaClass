package class1024;

import java.util.Random;

class mathExam {

	public static void main(String[] args) {
		double a = 3.5;
		System.out.println(Math.round(a));
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println("==========================");
		System.out.println("2의 3승은?"+Math.pow(2, 3));
		System.out.println("16의 제곱근은? "+ Math.sqrt(16));
		System.out.println("4와 7중 큰수는 ?"+Math.max(4,7));
		System.out.println("4와 7중 작은수는? "+Math.min(4, 7));
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
