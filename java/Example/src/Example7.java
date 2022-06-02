import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		  [응용문제7] 
		  
		  사용자가 다음 질문에 확인하여 값을 입력 후 해당 결과를 돌출하는 프로세서를 제작합니다.
		  "첫번째 입력값 단(1~10까지) 입니다."
		  "두번째 입력값 단(1~10까지) 입니다."
		  "세번째 입력값 단(1~10까지) 입니다."
		  "마지막 질문입니다. 해당 세가지 값에 대한 산술기호를 적으시오."
		  
		  해당 산술기호에 맞게 산술식을 적용하여 최종값을 출력시키시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 입력값 단, (1~10까지)입니다.");
		int no1 = sc.nextInt();
		System.out.println("두번째 입력값 단, (1~10까지)입니다.");
		int no2 = sc.nextInt();
		System.out.println("세번째 입력값 단, (1~10까지)입니다.");
		int no3 = sc.nextInt();
		System.out.println("마지막 질문입니다. 해당 세가지 값에 대한 산술기호를 적으시오.");
		String ms = sc.next();
		
		if(ms.equals("+")) {
			System.out.println(no1+no2+no3);
		}
		else if(ms.equals("-")) {
			System.out.println(no1-no2-no3);
		}
		else if(ms.equals("*")) {
			System.out.println(no1*no2*no3);
		}
		else {
			System.out.println(no1/no2/no3);	//소수점까지 나오려면 받는 변수를 하나 만들어야함
		}
		
		sc.close();
		
		

		
		
	}

}
