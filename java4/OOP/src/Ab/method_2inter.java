package Ab;
//interface : ���� ����� �޼ҵ常 ����, �߰��� ������ ó���ϴ� ������ default�� �߰���(java14)
public interface method_2inter {
	//�������̽��� �޼ҵ�� �ʵ忡 �ڷ����� ������ �� ����
	public String names();	//String names() return �޼ҵ� ����
	default void setbox(String name) { //setter
		System.out.println(name);
	}
	
	default String box3() {	//getter
		//�������̽��� ����Ʈ�� �����ϸ� ���� �޼ҵ带 �����
		return null;
	}
}
interface method_2re extends method_2inter{	
	//�������̽��� extends�� �θ� �������̽��� �ε��� �� �ֽ��ϴ�.
	public String names();
}