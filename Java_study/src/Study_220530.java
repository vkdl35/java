import java.util.Scanner;

public class Study_220530 {

	public static void main(String[] args) {
		
		//더블 반복문 while
		
		int a = 1;
		while(a <= 3) {
			int aa = 1;
			while (aa <= 4) {
				System.out.print(a+"+"+aa+" ");
				aa++;
			}
			a++;
		}
		
		//더블 반복문 do while문
		
		int a1 = 1;
		do {
			int aa1 = 1;
			do {
				System.out.print(a1+"+"+aa1+" ");
				aa1++;
			}while(aa1 < 5);
			a1++;
		}while(a1 < 4);
		
		//복합 반복문 for, do~while
		
		int a2;
		
		for(a2=2;a2<=3;a2++) {
			int aa2 = 1;
			do {
				System.out.print(a2+"*"+aa2+"="+(a2*aa2)+" ");
				aa2++;
			}while(aa2 < 10);
		}
		
		//switch~case 선택문
		
		int a3 = 3;
		switch(a3) {
		case 1 :
			System.out.println("옵션 1을 선택하셨습니다.");
			break;
		case 2 :
			System.out.println("옵션 2을 선택하셨습니다.");
			break;
		case 3 :
			System.out.println("옵션 3을 선택하셨습니다.");
			break;
		default :
			System.out.println("선택한 값이 없습니다.");
			break;
		}
		
		//복합 case 형태
		
		String a4 = "이경민";
		switch(a4) {
		case "이경민" :
		case "이 경민" :
		case "이 경 민" :
			System.out.println("A조 입니다.");
			break;
		case "이하율" :
			System.out.println("B조 입니다.");
			break;
		case "이성재" :
			System.out.println("C조 입니다.");
			break;
		default :
			System.out.println("나머지는 D조 입니다.");
			break;
		}
		
		//switch version 형태
		
		String mag  = "5%할인 쿠폰 당첨";
		int a5 = 5;
		switch(a5) {
		case 1 -> {
			mag  = "5%할인 쿠폰 당첨";
		}
		case 2 -> {
			mag  = "10%할인 쿠폰 당첨";
		}
		case 3,4 -> {
			mag  = "택배비 무료 쿠폰 당첨";
		}
		default -> {
			mag  = "다음 기회에...";
		}	
		}
		System.out.println(mag);
		
		//선택문과 반복문
		
		String a6 = "*";
		int tt;
		
		switch(a6) {
		case "+" -> {
			int a7;
			tt = 0;
			for(a7=1;a7<+5;a7++) {
				tt+=a7;
			}
			System.out.printf("총 1~5까지 계산된 값은 %d입니다.",tt);
		}
		case "-" -> {
			tt = 0;
			System.out.println("음수값은 출력되지 않습니다.");
		}
		case "*" -> {
			int a7 = 1;
			tt = 1;
			do {
				tt*=a7;
				a7++;
			}while(a7 <= 5);
			System.out.printf("총 1~5까지 계산된 값은 %d입니다.",tt);
		}
		case "/" -> {
			tt = 0;
		}
		}

		
		/*
		 * [응용문제1]
		 * 다음 결과값이 출력되도록 for문으로 작성하세요.
		 * 5+2=7 ~ 9+5=14
		 */
		
		int b,bb;
		int total;
		
		for(b=5;b<=9;b++) {
			for(bb=2;bb<=5;bb++) {
				total=b+bb;
				System.out.printf("%d+%d=%d ",b,bb,total);
			}
		}
		
		/*
		 * [응용문제2]
		 * 다음 결과값이 출력되도록 while문으로 작성하세요
		 * 9*7=63 ~ 7*5=35
		 */
		
		int b1 = 9;
		int total2;
		
		while(b1 >= 7) {
			int bb1 = 7;
			while(bb1 >= 5) {
				total2=(b1*bb1);
				System.out.printf("%d*%d=%d ",b1,bb1,total2);
				bb1--;
			}
			b1--;
		}
		
		/*
		 * [응용문제3]
		 * 다음 결과값을 보고 dowhile문으로 제작하세요.
		 * 5+4=9 ~ 3+7=10
		 */
		
		int b2 = 5;
		int total3;
		
		do {
			int bb2 = 4;
			do {
				total3=b2+bb2;
				System.out.printf("%d+%d=%d ",b2,bb2,total3);
				bb2++;
			}while(bb2 <= 7);
			b2--;
		}while(b2 >= 3);
		
		/*
		 * [응용문제4]
		 * 구구단 7단부터 9단까지 구하세요.
		 * 단, 각 구구단 곱셈값은 5까지만 나오도록 하며, 
		 * do~while문 안에 while문을 넣어 작성하세요.
		 * 예) 7*1=7 ~ 9*5=45
		 */
		
		int b3 = 7;
		int total4;
		
		do {
			int bb3 = 1;
			while(bb3 <= 5) {
				total4=b3*bb3;
				System.out.printf("%d*%d=%d ",b3,bb3,total4);
				bb3++;
			}
			b3++;
		}while(b3 <= 9);
		
		/*
		 * [응용문제5]
		 * 다음 결과값을 확인하여 코드를 작성하세요.
		 * 단, for문으로 시작하여 while문으로 제작하도록 하세요.
		 * 1*1=1 , 2*2=4 , 3*3=9 , … 9*9=81
		 */
		
		int b4;
		int total5;
		
		for(b4=1;b4<=9;b4++) {
			int bb4=b4;
			while(bb4 <= b4) {
				total5=b4*bb4;
				System.out.printf("%d*%d=%d ",b4,bb4,total5);
				bb4++;
			}
		}
		
		/*
		 * [응용문제6]
		 * 다음 해당 결과값처럼 출력이 되도록 더블 반복문을 사용하세요.
		 * 단, 밖에는 while문, 안에는 do~while문으로 작성하세요.
		 * 1+1=2, 2+1=3, 2+2=4, 3+1=4, 3+2=5, 3+3=6, 4+1=5, 4+2=6, 4+3=7, 4+4=8
		 */
		
		/*
		 * [응용문제7]
		 * 사용자가 다음과 같은 질문을 받습니다.
		 * Q. "1~5번까지 숫자를 하나 입력해주세요."
		 * 결과내용
		 * 1 : 5%할인쿠폰
		 * 2 : 10%할인쿠폰
		 * 3~4 : 택배비 무료 쿠폰
		 * 5 : 다음 기회에...
		 */
		
		
		Scanner as = new Scanner(System.in);
		System.out.println("Q.1~5번까지 숫자를 하나 입력해주세요.");
		int u = as.nextInt();
		String mag2 = "5%할인쿠폰";
		
		switch(u) {
		case 1 :
			mag2 = "5%할인쿠폰";
			break;
		case 2 :
			mag2 = "10%할인쿠폰";
			break;
		case 3,4 :
			mag2 = "택배비 무료 쿠폰";
			break;
		default :
			mag2 = "다음 기회에...";
			break;
		}
		System.out.println(mag2);
		as.close();
		
	}

}
