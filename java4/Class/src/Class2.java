
public class Class2 {

	public static void main(String[] args) {
		/*
		 * [���빮��]
		 * ���� Ŭ������ �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����ϼ���.
		 * Ŭ������ �ΰ����� �ֽ��ϴ�. 
		 * �θ� Ŭ������ : mother
		 * �ڽ� Ŭ������ : child
		 * ���� Ŭ�������� mother Ŭ������ ���� �����մϴ�.
		 * 30 50 ���ڰ��� �����մϴ�.
		 * child���� �θ� Ŭ������ �ִ� ���� �޾�, �ΰ��� ���ڸ� ���� ������� ����ϼ���.*/
		
		mother m = new mother(30,50);
		mother.child mc = m.new child();
		mc.cd();
	}

}

class mother {
	int a;
	int b;
	public mother(int a1, int b1) {
		this.a = a1;
		this.b = b1;
	}
	class child {
		public void cd() {
			System.out.println(mother.this.a*mother.this.b);	//�ٸ� �޼ҵ� ������ ����ؼ� �ڽ� class �ʵ忡 �����ص� ��
			
		}
	}
}