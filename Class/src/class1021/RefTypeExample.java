package class1021;

public class RefTypeExample {

	public static void main(String[] args) {
		Point obj = null;
		if (obj == null){
			System.out.println("obj ������ ����Ű�� ��ü�� ������");
			return;
			
		}
		System.out.println(obj.x);
		System.out.println(obj.y);
	}

}
