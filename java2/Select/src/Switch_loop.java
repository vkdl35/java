
public class Switch_loop {

	public static void main(String[] args) {
		
		String sign = "*";
		int total;
		/* case�ȿ� ������ �ݺ����� ����� �� �ֽ��ϴ�.
		 * ���� ������ �������� ����ص� �����ϸ�, case�� ���� �ٸ��� �۵��ϱ� ������ �������� �ʽ��ϴ�.
		 * ��, case�� �ϳ��� ������ ���� ��� ������ case�� ���� �۵����� ���� 
		 * switch�ȿ� ���ǹ� �ݺ��� ��� ����*/
		
		switch(sign) {
		case "+" -> {
			int f;
			total = 0;
			for(f=1;f<=5;f++) {
				total+=f;
			}
			System.out.printf("�� 1~5���� ���� ���� %d�Դϴ�.",total);
			//switch�� �ۿ� ���� ����, ���� �ۿ��� ������ ó�� total���� 0���� ����(�������� ����)
			//
		}
		case "-" -> {
			total = 0;
			System.out.println("�������� ��µ��� �ʽ��ϴ�.");
		}
		case "*" -> {
			int f = 1; 	//������ �� �������� �� ����ص� �������. case�ȿ��� �ܵ����� ����
			total = 1;
			do {
				total*=f;
				f++;
			}while(f <= 5);
			System.out.printf("�� 1~5���� ���� ���� %d�Դϴ�.",total);
		}
		case "/" -> {
			total = 0;
		}
		
		}
		
		
		
		
		
		
	}

}
