import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		
		//intern() : equals�� ������� �ʰ� ==(�ε��ȣ)�� ��밡��
		String data[] = new String[] {"ȫ�浿","�̼���"};	//�迭�� new �����ص� == ��밡��
		//String h = new String(data[0]); //�̰� == ��� �Ұ���
		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String("ȫ�浿").intern();
		String d = new String("ȫ�浿");
		String e = data[0];
		//new ���� �ݽ� ������ �ܵ����� ��� �����͸� ���� �߰����شٴ� �� (�Ҽ��� ���� ������ == ��� �Ұ�, pool�ȿ� �� �ڷ������� == ��� �����ϴ�)
		Scanner sc = new Scanner(System.in);
		String f = sc.next().intern();
		//��ĳ�� �Է½� new String�� ���� ���̱� ������ == ���Ұ� (�ڿ� intern�� �ٿ��ָ� ��밡��)
		
		System.out.println(a==f);
		
		//new String : �Ҽ��� ���� �����й��� �ڷ��� (����,�迭��)

	}

}
