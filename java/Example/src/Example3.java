import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		 [응용문제3] 
		 
		 사용자가 해당 값을 입력합니다. 
		 단, 사용자가 두개의 숫자를 입력하되 첫번째 숫자와 두번째 숫자 범위 안에 있는
		 모든 숫자를 더해서 결과값이 나오도록 제작하시오.
		 단, 해당 코드는 do~while문으로 작성합니다.
		 
		 예시) 
		 첫번째 범위 숫자는? 5
		 두번째 범위 숫자는? 10
		 범위 숫자 모든 합계는 45입니다.
		 */
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("첫번째 범위 숫자는?");
//		int user = scan.nextInt();	//유저의 첫번째 숫자 입력값
//		
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("두번째 범위 숫자는?");
//		int user2 = scan.nextInt();	//유저의 두번째 숫자 입력값
//		
//		int c = 0;
//		
//		do {
//			c += user;
//			user++;
//		}while(user<=user2);
//		
//		System.out.println(c);
//		
//		scan.close();
//		scan2.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 범위 숫자는?");
		int a = sc.nextInt();
		System.out.println("두번째 범위 숫자는?");
		int b = sc.nextInt();
		int total = 0;
		
		do {
			total = total + a;
			a++;
		}while(a<=b);
		
		System.out.println("범위 숫자 모든 합계는 "+total+"입니다.");
		
		sc.close();
		
		
		
		

	}

}
