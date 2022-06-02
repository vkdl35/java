import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		/*
		 * Scanner와 함께 do~while문으로 사용자가 입력하는
		 * 값으로 구구단 결과가 출력되는 프로그램을 제작하시오.
		 */
		
		Scanner a = new Scanner(System.in);
		System.out.println("원하시는 구구단 숫자를 입력하세요.");
		int b = a.nextInt();
		
		int c = 1;
		int d;
		do {
			d = b * c;
			System.out.printf("%d ",d);
			c++;
		}while(c < 10);
		
		a.close();

	}

}
