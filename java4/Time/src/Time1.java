
public class Time1 {

	public static void main(String[] args) {
		/* try-catch�� : ����ó����� ���� */
		int w = 1;
		while(w < 11) {
			
			try {	//���� �߻��� �ڵ带 ����
				Thread.sleep(1000);	//1000 = 1��
				//Thread.sleep : �Ͻ����� ���¸� ���մϴ�.
			}
			catch(InterruptedException e){	//Exception�� ����ص� ��
				//InterruptedException : �ش� ���ܹ߻��� �Ǿ��� ��� ó���ϱ� ���� ����
				/*  */
			}
			
			System.out.println(w);
			w++;
		}

	}

}
