
public class Method13 {

	public static void main(String[] args) {
		//extends : inherit(���)
		/*
		  ���� �θ� class�� constructor �κп� �μ����� ������ �� ����
		  �ڽ� Ŭ�������� �ε带 ���ϴ� ��Ȳ�� �߻���
		  ��, �ڽ� Ŭ�������� �μ����� �����Ͽ� constructor�� ����� ���� ���� 
		 */
		mth1 m1 = new mth1();
		mth2 m2 = new mth2(0);

	}
	
}

class mth1 {	
	public int no;
	public mth1() {	//constructor�� �μ����� ������ main���� ��� class�� �ε��� �� ����
		//constructor�� ����Ϸ��� �μ����� ������ �������
		this.no = 20;
		System.out.println("mth1");
	}
}
class mth2 extends mth1 {
	public mth2(int a) {
		this.no = 50;
		System.out.println(this.no);
		System.out.println("mth2");
	}
}