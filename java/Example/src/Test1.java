import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 [응용문제]

			사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
			첫번째 숫자값을 입력하세요.
			두번째 숫자값을 입력하세요.
			
			첫번째 숫자값 * 두번째 숫자값 에 대한 결과를 출력하세요.
			단, 해당 결과값이 100 이하일 경우 
			출력 메세지 "100이하의 결과값입니다." 라고 설정하시고
			100 이상일 경우 "해당값은 100이상 결과값 입니다." 라고 출력합니다.
		 */
		
		
		Scanner h = new Scanner(System.in);
		System.out.println("첫번째 숫자값을 입력하세요.");
		short num1 = h.nextShort();
		
		Scanner i = new Scanner(System.in);
		System.out.println("두번째 숫자값을 입력하세요.");
		short num2 = i.nextShort();
		
		// short num3 = (num1*num2);
		
		if((num1*num2) <= 100) {
			System.out.println("100이하의 결과값입니다.");
		}
		else if((num1*num2) > 100) {
			System.out.println("해당값은 100이상 결과값 입니다.");
		}
			
		h.close();
		i.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
