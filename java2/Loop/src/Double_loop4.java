
public class Double_loop4 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * ���չݺ��� for , do~while
		 */
		
		int f;
		
		for(f=2;f<=3;f++) {
			int w=1;
			do {
				//System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(w<=9);
		}
		
		/*
		 * [���빮��]
		 * ������ 7�ܺ��� 9�ܱ���
		 * ��, �� ������ �������� 5������ �������� �մϴ�.
		 * ��) 7*1=7 ~ 9*5=45
		 * ����) do while , while
		 */
		
		int a = 7;
		int total;
		
		do {
			int b = 1;
			while(b<=5) {
				total = (a*b);
				//System.out.printf("%d*%d=%d / ",a,b,total);
				b++;
			}
			a++;
		}while(a <= 9);
		
		/*
		 * [���빮��]
		 * ���� ������� Ȯ���Ͽ� �ڵ带 �ۼ��ϼ���.
		 * ��, for������ �����Ͽ� while������ �����ϵ��� �ϼ���.
		 * 1*1=1
		 * 2*2=4
		 * 3*3=9
		 * ...
		 * 9*9=81*/
		
//		int c;
//		int total2;
//		
//		for(c=1;c<=9;c++) {
//			int c = x;
//			while(c==x) {
////				total2=c*x;
//				System.out.printf("%d*%d=%d ",c,x,total2);
//				x++;
//			}
//		}
		
		int c;
		int total3;
		for(c=1;c<=9;c++) {
			int cc=c;	
			while(cc<=c) {	
				total3=c*cc;
				//System.out.printf("%d*%d=%d / ",c,cc,total3);
				cc++;
			}
		}
		
		/*
		 * [���빮��]
		 * ���� �ش� �����ó�� ����� �ǵ��� ���� �ݺ����� ����ϼ���.
		 * ��, �ۿ��� while��, �ȿ��� do~whils������ �ۼ��ϼ���.
		 * 1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+4=8
		 */
		

	}

}
