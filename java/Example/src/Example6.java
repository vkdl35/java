
public class Example6 {

	public static void main(String[] args) {
		/*
		 [���빮��6]
		 
		  1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�.
		  ��, 1~5������ ��簪�� ���ϰ�, 6~10������ ��簪�� ���մϴ�.
		  �ش� �ΰ��� ���� ���Ͽ� ���Ѱ��� ū��, ���Ѱ��� ū����
		  ����� ����Ͻÿ�.
		 */
		
		//[���� § �ڵ�]
		
//		int a=1;
//		int b=1;
//		int c=0;
//		while(a<=10) {
//			if(a<6) {				
//				b*=a;
//			}
//			else if (a > 5 && a <= 10) {
//				c+=a;
//			}
//			a++;
//		}
//		if(b>c) {
//			System.out.println("1~5���� ���Ѱ��� �� Ů�ϴ�");
//		}
//		else {
//			System.out.println("6~10���� ���Ѱ��� �� Ů�ϴ�");
//		}
		
		//[�������� § �ڵ�]
		
		int w=1;
		int total=0; //���Ұ�
		int total2=1; //���Ұ�
		
		while(w<=10) {
			if(w<=5) {
				total2*=w;
			}
			else {
				total+=w;
			}
			w++;
		}
		if(total2<total) {
			System.out.println("���Ѱ��� Ů�ϴ�.");
		}
		else if(total2>total) {
			System.out.println("���Ѱ��� Ů�ϴ�.");
		}
		else {
			System.out.println("�� �񱳰��� �����ϴ�.");
		}
		
		
		
		
		
		

	}

}
