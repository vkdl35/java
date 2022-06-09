import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		 * [UP & DOWN 게임]
		 * 
		 * A파트 : PC 랜덤 , Scanner(5번)
		 * B파트 : PC 랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과처리
		 * 
		 * 기회는 총 다섯번
		 * 1. PC가 숫자를 하나 선택 (힌트 random) 1 ~ 10까지
		 * 2. 총 기회는 5번 남았습니다. 1 ~ 10까지 번호 중 하나의 번호를 입력
		 * 3. 만약에 PC가 숫자 7을 선택한 기준에서 사용자 숫자와 비교
		 * -PC : 7 / 사용자 : 2 => 결과 : UP입니다
		 * 4. 총 기회는 4번 남았습니다. 1 ~ 10까지 번호 중 하나의 번호를 입력
		 * 5. PC : 7 / 사용자 : 4 => 결과 : UP입니다
		 * 6. 총 기회는 3번 남았습니다. 1 ~ 10까지 번호 중 하나의 번호를 입력
		 * PC : 7 / 사용자 : 7 => 결과 : 정답입니다. (모든 프로세서 정지)
		 * 
		 */
		
		System.out.println("UP & DOWN 게임을 시작합니다.");

		int num = (int) (Math.random() * 10) + 1;
		// System.out.println(num);

		Scanner sc = new Scanner(System.in);
		int total = 5;
		int user;

		while (total > 0) {
			System.out.printf("총 기회는 %d번 남았습니다.", total);
			user = sc.nextInt();
			if(user < 0 || user > 10) {
				System.out.println("잘못된 숫자");
				total++;
			}
			else {				
				Example2 ex2 = new Example2();
				String msg = ex2.mt(num, user);
				System.out.println(msg);
				if (msg.equals("정답입니다.")) {
					System.exit(0);
				}
			}
			total--;
		}
		if (total == 0) {
			System.out.println("게임오버");
		}

	}

}