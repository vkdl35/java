
public class Double_loop2 {

	public static void main(String[] args) {
		//while
		//while���� ������ �̸� �����߱� ������ ���� �ݺ����� ���� ���� ����. ���� �ݺ����� �� ������ ū �ݺ��� �ȿ� �־��־�� ��.
		//������ ��ġ�� �߿�.
		
		int w=1;
		while(w<=3) {
			int ww=1;	//���� while���� �ʱⰪ�� ū �ݺ��� �ȿ� ���� 
			while(ww<=4) {
				//System.out.print(w + "+" + ww + " ");
				ww++;
			}
			w++;
		}

		//do while
		//do while���� while���� �����ϰ� �ʱⰪ�� ū �ݺ��� �ȿ� �־���� ��. 
		
		int dw = 1;
		do {
			int ddw = 1;
			do {
				//System.out.print(dw+"+"+ddw+" ");
				ddw++;
			}while(ddw<=4);	//���� �ݺ��� ����
			dw++;
		}while(dw<=3);	//ū �ݺ��� ����
		
		//
		
		
		
	}

}
