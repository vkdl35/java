
public class Example3 {

	public static void main(String[] args) {
		ingerit2 in2 = new ingerit2();
		in2.it("ȫ�浿", "aaa5");
		in2.print();
		
		
		

	}

}

class ingerit1 {
	
	private String nm;	//�ش� Ŭ���� �ȿ����� ��� ����
	protected String pw;	//�ܺο��� ���� ���� �������� �ڽ� Ŭ�������� ���� ������ �� ����
	public String pw2;	//public���� ������ ���� Ŭ�������� ��� ���� ������
	//public String aa = this.nm;	//�ʵ尪�� ���� ����Ǳ� ������ �Ʒ� �޼ҵ忡�� ���� �Ѱ��ִ��� �޾ƿ� �� ����
	static String aa;	//private���� ���� �κ��� �ڽ� Ŭ���������� ����� �� �ֵ��� ���İ��� ��θ� �������
	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		this.aa = this.nm;	
	}
}
class ingerit2 extends ingerit1 {
	public void print() {
		System.out.println(this.aa + " " + this.pw);
	}
}
