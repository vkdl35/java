
public class If_for2 {

	public static void main(String[] args) {
		/* 1~100���� ���� �� 80�̻��� ���ڸ� ��� */
		
//		int f;
//		for(f=1;f<=100;f++) {
//			if(f>=80) {
//				System.out.print(f+" ");
//			}
//		}

		/* 200~300������ ���� �� 240������ ���ڸ� ��� */
		
//		int ff;
//		for(ff=300;ff>=200;ff--) {		//��������
//			if(ff<=240) {
//				System.out.print(ff+" ");
//			}
//		}
		
//		int ff;
//		for(ff=200;ff<=300;ff++) {
//			if(ff<=240) {
//				System.out.print(ff+" ");
//			}
//		}
		
//		final int a = 3;	//a�� ���ڸ� �ٲٸ� a�� ������� ����� �� ����.
//		int w;
//		for(w=1;w<11;w++) {
//			if(w%a == 0) {
//				System.out.print(w+" ");
//			}
//		}
		
		
		/* ���빮�� : ������ �� 2���� �ݺ��մϴ�. 
		   ��, 2�� ����� �� 10�̻� ���ڸ� ��µ˴ϴ�. */
		
		//[���� § �ڵ�]
		
//		final int a = 2;
//		int b;
//		for(b=1;b<20;b++) {
//			if(b%a == 0) {
//				System.out.print(b+" ");
//			}
//		}
		
		//[�������� § �ڵ�]
		
//		final int g = 2;
//		int ww;
//		int total;
//		for(ww=1;ww<=9;ww++) {
//			total = g * ww;
//			if(total >= 10) {				
//				System.out.print(total+" ");
//			}
//		}
		
		/* [���빮��] 
		 
		   ���� ������� ���� �ش簪�� ��µǵ��� �ڵ带 �����Ͻÿ�.
		   18 36 54 72
		 */
		
		//[���� § �ڵ�]
		/*
		int a;
		int b=9;
		int t;
		for(a=2;a<9;a++) {
			t = b*a;
			if(t%2 == 0) {
				System.out.print(t+" ");
			}
		}
		*/
		
		//[�������� § �ڵ�]
		
		/*
		int bk;
		int dk;
		for(bk=1;bk<10;bk++) {
			dk=9*bk;
			if(bk%2==0) {
				System.out.print(dk+" ");
			}
		}
		*/
		
		/* ���빮��
		 	���� ������� ���� �ش簪�� ��µǵ��� �ڵ带 �����Ͻÿ�.
		 	1���� 20������ �����Դϴ�.
		 	6 14 17 19
		 */
		
		int k;
		for(k=1;k<=20;k++) {
			if(k==6||k==14||k==17||k==19) {
				System.out.print(k+" ");
			}
		}
		
	
		
		
		
		
	}

}
