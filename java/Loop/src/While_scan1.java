import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {

		/*
		  [응용문제]
		  총 2번의 질문을 하게 됩니다.
		  사용자가 숫자를 입력하여 두 수의 합을 구하는 scanner를 제작하시오.
		 */
		Scanner ca = new Scanner(System.in);
		
		int a=1;
		int c=0;
		while(a<3) {
			System.out.println(a+"번째 숫자를 입력해주세요.");
			int b=ca.nextInt();
			c+=b;
			a++;
		}
		System.out.println("합계 "+c);
		ca.close();

	}

}
