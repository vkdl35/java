package Ab2;

public interface app_data1 {	
	String a = null;	//�ʵ忡 �ִ� �ڷ����� ���� ������� ��� ��� �Ұ�(������ �� ����)
	int b = 0;
	public void user_join();	//���� ������ �޼ҵ�� this ��� �Ұ�
	default void aaa() {	//default���� this ����� ������(���� ���� ��쿡�� �ش�)
		System.out.println(this.a);
	}
}
