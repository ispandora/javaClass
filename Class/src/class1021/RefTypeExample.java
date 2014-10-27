package class1021;

public class RefTypeExample {

	public static void main(String[] args) {
		Point obj = null;
		if (obj == null){
			System.out.println("obj 변수가 가리키는 객체가 없습니");
			return;
			
		}
		System.out.println(obj.x);
		System.out.println(obj.y);
	}

}
