import java.math.BigInteger;
// import ������ ������ ����
public class Big_loop {

	public static void main(String[] args) {
		/*
		int a;
		int b=0;
		for(a=1;a<=100;a++) {
			b*=a;
		}
		System.out.print(b);
		*/
		
		// 1~100���� ���� �������?
		
		int f;
		// BigInteger : java���� ��� ������ ���� ������ �� �ִ� ������ �ڷ���
		BigInteger aa = new BigInteger("1"); 		// �հ�ġ�� ����� �ڷ��� ���� 1�� ���� ������ ����
		for(f=1;f<=10;f++) {						// ��, ""�� ������ ����ؾ��մϴ�.
			// multiply : ��Ģ���� �߿� ���ϱ⸦ �����
			// add : ��Ģ���� �߿� ���ϱ⸦ �����
			// subtract : ��Ģ���� �߿� ���⸦ �����
			// dicde : ��Ģ���� �߿� �����⸦ �����
			aa = aa.multiply(BigInteger.valueOf(f));
		}
		System.out.println(aa);
		
		
		
	}

}
