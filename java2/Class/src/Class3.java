
public class Class3 {
	//package�� ������� ���� (default��)
	public static void main(String[] args) {
		//�ڷ���(��������) ��ȯ
		
		//doubel -> int�� ��ȯ
		double a = 137.5;
		int b = (int)a;
		
		//int -> double�� ��ȯ
		int c = 35;
		double d = (double)c;
		
		//���ڿ��� ���� ���¸� �ٲٴ� �� �����ϳ�, ���ڿ��� ����, ���ڿ��� ���������� �ٲٴ� �� �ȵ�
		
		//String -> int
		String x = "35";
		String x2 = "156";
		int z = Integer.parseInt(x);	//parseInt (int���� ����ϴ� ������� �����)
		//int z = Integer.valueOf(x);	//valueOf Ŭ���� �޼ҵ�(�޼ҵ��Լ�) => parseInt ����
		//int total = Integer.parseInt(x + x2);
		int total = Integer.parseInt(x) + Integer.parseInt(x2);	//�������� ���ڷ� ��ȯ�Ͽ� �������� ó����
		//System.out.println(total);
		
		//�ܼ��ϰ� ���ڸ� ���ڷ� �ٲ� ���� parseInt
		//parseInt�� ��ȯ�Ϸ��� �ڷ����� ���ڰ� ���ԵǾ� ������ ������
		//valueOf �Լ� �ȿ� parseInt ���ԵǾ� �ֱ� ������ �ӵ��� ����
		// = valueOf ��ȯ�Ϸ��� �ڷ����� ���ڰ� ���ԵǾ� �־ �߰� �۾��� ���� ���ڿ� ���ڸ� �з���
		
		//Long ���� Long.parseLong ���
		String j = "923456789";
		String j2 = "9234567892";	//10���� �Ѿ�� int ��� �Ұ�
		//int total2 = Integer.parseInt(j) + Integer.parseInt(j2);
		Long total2 = Long.parseLong(j) + Long.parseLong(j2);	//Long�� ���� Integer.parseInt�� �ٲ� �� ����
		double total3 = (double)total2;
		//System.out.println(total3);	
		
		//����(char) -> ����(string) : �⺻ ���ĸ� ����
		char p = 'M';	
		//char�� ""(�ֵ���ǥ) ��� ''(����ǥ)�� ����ؾ���
		//char�� ���ڸ� �̻� ���� ����
		String f = String.valueOf(p);	//String�� ���� ��ȯ�̱� ������ parse�� ����
		System.out.println(f);
		//����� ���� ���� ����
		
		
		
		
		

	}

}
