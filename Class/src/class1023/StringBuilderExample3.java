package class1023;
/*
 ����5)  StringBuilder data1 =
new StringBuilder("�̼���;100;ȫ�浿;90;������;95");
    insert�� �̿��ؼ� 'ȫ�浿;90' �ڿ�  '�豸;100' �߰��� �� ���

����6)  StringBuilder data1 =
new StringBuilder("�̼���;100;ȫ�浿;90;������;95");
    delete�� �̿��ؼ� 'ȫ�浿;90' �� ����� ���
 */
public class StringBuilderExample3 {
	public static void main(String[] args){
		StringBuilder data1 = new StringBuilder("�̼���;100;ȫ�浿;90;������;95");
		data1.insert(14, ";�豸;100");
		System.out.println(data1);
		data1.delete(7, 14);
		System.out.println(data1);
	}
}
