import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 [응용문제]
		 
		 사용자가 입력한 숫자에 맞춰서 구구단이 작동되며,
		 구구단 결과를 계산하여 짝수인지 홀수인지를 출력하시오.
		 "구구단에 대한 숫자를 입력하세요." 라고 메세지가 출력되면
		 해당 숫자에 맞춰서 모든 결과를 더하며,
		 더한 값에 따라 짝수인지 홀수인지를 출력하시면 됩니다.
		 단, 해당 반복문은 for ~ dowhile문까지
		 한가지를 선택해서 작성하시오.
		 
		 **조건문은 반복문 안에 있으면 안됩니다.
		 */
		
		//[내가 짠 코드]
		
//		Scanner asc = new Scanner(System.in);
//		
//		int a=1;
//		int b=1;
//		int total=0;
//		
//		System.out.println("구구단에 대한 숫자를 입력하세요.");
//		int user = asc.nextInt();
//		
//		while(a<=9) {
//			b=a*user;
//			total+=b;
//			a++;
//		}
//			if(total%2==1) {
//			System.out.println("구구단 "+user+"단을 모두 더한 값은 "+total+"이며 홀수입니다.");
//		}
//			else {
//			System.out.println("구구단 "+user+"단을 모두 더한 값은 "+total+"이며 짝수입니다.");
//		}
//		
//		asc.close();
		
		
		//if() : < > <= >= == != (|| &&)
		//반복문() : = < > <= >= (++ --)
		//반복문{} : += -= /= *=
		
		//[선생님이 짠 코드]
		
		Scanner sc = new Scanner(System.in);
		String msg = "구구단에 대한 숫자를 입력하세요.";
		String msg2;
		System.out.println(msg);
		int user = sc.nextInt();
		int f = 1;
		int total=0;
		do {
			total = total + (user * f);
			//totla+=user*f;
			f++;
		}while(f < 10);
		//System.out.println(total);
		if(total % 2 == 0) {
			msg2 = "짝수";
		}
		else {
			msg2 = "홀수";
		}
		System.out.printf("결과값은 %s입니다.",msg2);
		sc.close();
		
		

	}

}
