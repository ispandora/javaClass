package class1023;
/*
 문제5)  StringBuilder data1 =
new StringBuilder("이순신;100;홍길동;90;강감찬;95");
    insert를 이용해서 '홍길동;90' 뒤에  '김구;100' 추가한 뒤 출력

문제6)  StringBuilder data1 =
new StringBuilder("이순신;100;홍길동;90;강감찬;95");
    delete를 이용해서 '홍길동;90' 를 지우고 출력
 */
public class StringBuilderExample3 {
	public static void main(String[] args){
		StringBuilder data1 = new StringBuilder("이순신;100;홍길동;90;강감찬;95");
		data1.insert(14, ";김구;100");
		System.out.println(data1);
		data1.delete(7, 14);
		System.out.println(data1);
	}
}
