
public class Method2 {

	public static void main(String[] args) {
		//default package�� ���� �ش� class���� ȣ���ϸ��
		/*	//�� package�� �������� ��� ���� ��ܿ� package�� �����ؾ���
		tests ts = new tests();
		ts.a2++;
		System.out.println(ts.a2 );
		*/
		info i = new info();
		/* error */
		//System.out.println(i.data1(20));
		//System.out.println(i.data2(20));
		
		/* success */
		System.out.println(i.data3(20));
		String result = i.data4("ȫ�浿");
		/* data4 �޼ҵ� return ���� result ������ �޾Ƽ� ó�� */
		System.out.println(result);
	}

}
class info {
	/* static �Ǵ� void �޼ҵ忡�� return�̶�� ��ɾ ������� ����*/
	public static void data1(int ii) {
		int z = ii+20;
		//System.out.println(z);
		//return z;
	}
	public void data2(int ii) {
		int z = ii+20;
		//System.out.println(z);
		//return z;
	}
	public int data3(int ii) {	
		/* �ڷ��� �޼ҵ��� ���ϸ�, ������ return ��� �ؾ��մϴ�. 
	 		��, sysout�� ������� ���մϴ�.*/
		int z = ii+20;
		return z;
		//�ڷ� ������ return �޼ҵ�
	}
	public String data4(String ii) {
		String z = ii + "�� ȯ���մϴ�.";
		return z;
	}
}