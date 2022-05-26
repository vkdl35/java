import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/* 
		  [응용문제]
		  
		  사용자가 총 3번의 숫자를 입력합니다.
		  3개 숫자를 모두 곱하여 총 합계 수를 출력하시오.
		  
		  123456789 * 123456789 * 123456789
		 */
		
//		Scanner aa = new Scanner(System.in);
//		int kk=1;
//		long hh=1;
//		do {
//			System.out.println(kk+"번째 숫자를 입력하세요.");
//			int vv=aa.nextInt();
//			hh*=vv;
//			kk++;
//		}while(kk<4);
//		System.out.println("합계 : "+hh);
		
		Scanner sc = new Scanner(System.in);
		int w=1;
		int user;
		long total=1;		//long을 입력시 최종결과에서 -음수 발생함
		do {
			System.out.println(w+"번째 숫자를 입력하세요.");
			user=sc.nextInt();
			total=total*user;
			w++;
		}while(w<=3);
		
		System.out.println("총 합계:"+total);
		sc.close();
		

	}

}
