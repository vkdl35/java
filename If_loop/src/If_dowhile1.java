
public class If_dowhile1 {

	public static void main(String[] args) {
		/* [���빮��] : ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�. */
		
		// [���� § �ڵ�]
		
//		int a=6;
//		int b=6;
//		int c;
//		do {
//			c=a*b;
//			System.out.print(c+" ");
//			a++;
//		}while(a<=9);
		
		// [�������� § �ڵ�]
		
//		int dw = 1;
//		int total;
//		do {
//			total = 6 * dw;
//			if(total > 35) {
//			System.out.print(total+" ");
//			}
//			dw++;
//		}while(dw < 10);
		
		/* [���빮��] : 14~27���� ������ ¦������ ��� ���Ͽ� ���� ������� ����Ͻÿ�. 
		 	�� ������� 140�Դϴ�.
		 */
		
		int a=14;
		int b=0;
		do {
			if(a%2==0) {
				b+=a;
			}
			a++;
		}while(a<=27);
		System.out.print(b);
		
		
		
		
		
		
	}

}
