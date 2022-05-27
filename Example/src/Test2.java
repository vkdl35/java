import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 [응용문제. 조건문 코드를 작성 하시오.]
		 
		  고객이 자신의 통장에서 입,출금을 하는 프로세서를 제작해야 합니다.
		  고객의 기본 자산 금액은 : 100,000원
		  
		  "1번 입력시 입금, 2번 입력시 출금입니다." 라는 메세지가 제일 먼저 실행 되어야 합니다.
		  
		  1번을 입력시 "해당 금액을 입력하세요."
		  사용자가 입력한 금액 + 기본 자산 금액을 합한 총 자산 금액을 출력하시면 됩니다.
		  
		  2번을 입력시 "출금할 금액을 입력하세요."
		  사용자가 입력한 금액 - 기본 자산 금액을 계산하여 총 자산 금액을 출력하시면 됩니다.
		 */
		
//		Scanner a = new Scanner(System.in);
//		Scanner a1 = new Scanner(System.in);
//		
//		int b=100000;
//		int d;
//		int e;
//		System.out.println("1번 입력시 입금, 2번 입력시 출금입니다.");
//		int c = a.nextInt();
//		
//		if(c==1) {
//			System.out.println("해당 금액을 입력하세요.");
//			int c1 = a1.nextInt(); //사용자가 입력한 금액
//			d=c1+b;
//			System.out.println("총 금액은 "+d+"원입니다.");
//			}
//		else if(c==2) {
//			System.out.println("해당 금액을 입력하세요.");
//			int c1 = a1.nextInt(); //사용자가 입력한 금액
//			e=b-c1;
//			System.out.println("총 금액은 "+e+"원입니다.");
//		}
//		else {
//			System.out.println("1번 또는 2번을 입력해주세요.");
//		}
		
		int money = 100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 입력시 입금, 2번 입력시 출금입니다.");
		int work = sc.nextInt();
		int total;
		Scanner cal = new Scanner(System.in);
		
		if(work==1) {
			System.out.println("입금 금액을 입력하세요.");
			total=cal.nextInt();
			money = money + total;
		}
		else if (work==2) {
			System.out.println("출금 금액을 입력하세요.");
			total=cal.nextInt();
			money = money - total;
		}
		else {
			System.out.println("정상적인 코드가 아닙니다.");
			sc.close();
		}
		System.out.println("처리된 내용은 다음과 같습니다. "+money+"원");
		
		cal.close();

	}

}
