import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {
		
		/*
		byte a = 10;
		if(a < 10) {
			System.out.println("입력한 값은 10이상 숫자를 입력하세요.");
		}
		else if(a >= 10 || a <= 22 ) {	//조건문의 범위를 설정하여 적용함
			System.out.println("당첨입니다.");
		}
		else {
			System.out.println("범위 밖의 숫자입니다.");
		}
		*/
		
		/*
		 [응용문제]
		 Q. 1~45까지 숫자 하나를 입력하세요.
		 
		 error문구
		 0을 입력 : 숫자입력이 잘못 되었습니다.
		 45보다 큰 숫자를 입력 : 숫자는 1~45까지만 입력 가능합니다.
		 
		 1~45숫자를 입력하였을 경우
		 7, 12, 14 세가지 숫자 입력시 당첨입니다. 라고 출력
		 그 외에 숫자시 다음 기회에 참여하세요. 라고 출력 
		 */
		
		Scanner a1 = new Scanner(System.in);
		
		System.out.println("Q. 1~45까지 숫자 하나를 입력하세요.");
		
		int a2 = a1.nextInt(); //사용자 입력 부분 값
		
		/* int z = 7, 12, 14; */
		if(a2 == 0) {
			System.out.println("숫자 입력이 잘못 되었습니다.");
		}
		else if(a2 > 45) {
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		}
		else {
			if(a2==41) {
				System.out.println("당첨입니다.");
			}
			else if(a2==41) {
				System.out.println("50퍼 센트 쿠폰 당첨입니다.");
			}
			else {
				System.out.println("다음 기회에...");
			}
		}
		
		a1.close();
		
		
		
		
		/*
		if(a2==7 || a2==12 || a2==14) {
			System.out.println("당첨입니다.");
		}
		else {
			System.out.println("다음 기회에 참여하세요.");

			if(a2 == 0) {
				System.out.println("숫자 입력이 잘못 되었습니다.");
			}
			else if(a2 > 45) {
				System.out.println("숫자는 1~45까지만 입력 가능합니다.");
			}
		}
		*/
		
		
			
		
		
		
		
		
			
		
		


	}

}
