package Ab2;

public class app {

	public static void main(String[] args) {
		/*
		//(�ڽ�) = (�ڽ�)
		members mb = new members();	//�ڽ� Ŭ���� ����
		mb.oop();
		mb.oop3();
		//(�θ�) = (�ڽ�) => �������̽� �������� ����� �������̵常 ȣ���� (����ȯ)
		app_data2 ap = new members();	//�������̽� ����
		ap.oop2();
		//ap.oop3();	
		*/
		
		members mb = new members();	//�ڽ� Ŭ���� ����
		app_data2 ap = mb; //�������̽� ���� (Ŭ���� -> �������̽� ����)
		
		members mb2 = (members)ap;	//(�������̽� -> Ŭ���� ��ȯ)
	
	}

}
/*
class members implements app_data1 {
	app_data1�� ������ �ڷ��� �����ϴ� ���
}
*/

class members implements app_data2 {
	@Override
	public void oop() {
		System.out.println("test");
	}
	@Override
	public void oop2() {
		System.out.println("test2");		
	}
	public void oop3() {
		System.out.println("test3");
	}
	
}
