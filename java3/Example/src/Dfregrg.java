public class Dfregrg {

	public static void main(String[] args) {

		/*
				[���빮��6] > ����!   ��229
			���� �ش� �����ó�� ����� �ǵ��� ���� �ݺ����� ����ϼ���.
			��, �ۿ��� while��, �ȿ��� do~while������ �ۼ��ϼ���.
			1+1=2, 2+1=3, 2+2=4, 3+1=4, 3+2=5, 3+3=6, 4+1=5, 4+2=6, 4+3=7, 4+4=8

		 */
		
		
		int w = 1;
		int total=0;
		while(w < 5) {
			int d = w;
			do {
				total=w+d;
				System.out.println(total);
				d++;
			}while(d < 5);
			w++;
		}
		
		

	}

}
