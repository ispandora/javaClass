package class1023;

public class StringBufferExample2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder ("Ǫ�� �����");
		printStringBuilder(sb);
		sb.append("��ġ�� ���� ���� �ɾ ���� ��ġ�� �����ϴ�");
		printStringBuilder(sb);

	}

	private static void printStringBuilder(StringBuilder sb) {
		String str = sb.toString();
		int len = sb.length();
		int bufSize = sb.capacity();
		System.out.printf("%s(%d): %d %n",str,len,bufSize);
		
		
	}
	

}
