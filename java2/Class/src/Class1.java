
public class Class1 {

	public static void main(String[] args) {	//�Ϲ� main�Լ�

		Adata a = new Adata();	//Adata Class���� �ε�
		Bdata b = new Bdata();	//Bdata Class���� �ε�
		System.out.println(a.aa);	//Adata Class �ȿ� aa��� ���� �ڷ��� ��ü���� ������
		System.out.println(b.aa);	//Bdata Class �ȿ� aa��� ���� �ڷ��� ��ü���� ������

		Cdata c = new Cdata();
		/* Cdata �ȿ� ���� �ڷ����� ������ -> 
		 * ���� �⺻�Լ��� ���� �Է��� �� ��ü���� �޾� ��������� ��� (�ν��Ͻ� ����) */
		c.aa = 10;
		c.bb = 30;
		c.cc = c.aa + c.bb;
		System.out.println(c.cc);

	}

}

//aa�� ������ �ٸ� Ŭ������ �ֱ� ������ �ߺ����� �ʽ��ϴ�.
class Adata {
	String aa = "ȫ�浿";
}
// Adata���� ���� ���� aa, ������ Bdata �� �Ȱ��� aa�� �־ ���� �۵��ȴ�. 
// ��, class �ȿ� �ִ� ������ �ٸ� class�� �ű�� ������ ��.
class Bdata {
	String aa = "�̼���";
}
class Cdata {	//�ܵ� class �ȿ����� sysout ����� �����. public ���� �⺻ main �Լ��� ���� ����
	//�ش� Cdata�� �ִ� Ŭ�������� �ڷ����� ���� ������ �����մϴ�.
	//��, ��� ������ �Լ��� ���� ��Ȳ�̹Ƿ� ���� �Ǵ� sysout�� ������� ���մϴ�.
	int aa;	
	int bb;
	int cc;
}