import java.util.Arrays;
import java.util.Scanner;

public class Study_220607_2 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제1]
		 * 인수값 2개의 숫자를 적용하여 계산되도록 합니다.
		 * 최종 계산을 받아서 결과를 출력하세요.
		 * 157, 45
		 * 157*45
		 * 최종 결과값 출력 : 
		 */
		
		ak5 aa = new ak5();
		System.out.println(aa.num(157,45));
		
		/*
		 * [응용문제2]
		 * 다음 숫자 하나를 해당 메소드로 전달하게 됩니다.
		 * 해당 메소드에서는 다음과 같이 처리합니다.
		 * 숫자 3을 전달하면 3*1 ~ 3*9까지의 모든 결과값을 더하여
		 * sysout으로 출력되도록 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("구구단 합계치를 구할 숫자를 입력하세요.");
		//int user = sc.nextInt();
		//int r = aa.num2(user);
	//	System.out.println(r);
		sc.close();
		aa = null;
		
		/*
		 * [응용문제4] -> 숙제
		 * 관리자에서 메뉴를 활성화하는 프로세서입니다.
		 * 해당 메뉴 활성화는 2차 배열이며, 메뉴명과 활성화하는 (Y,N)으로 구분합니다.
		 * 해당 활성화 값을 대입하여 Y로 적용되는 인덱스 번호에 맞는 메뉴명을 1차 배열로 재구성 후 메인에서 출려되도록 합니다.
		 * 겨로가 : ["로켓배송","로켓프레시","골드박스","이벤트","추석"]
		 * 단 private 및 return을 활용하여 프로그램을 작성합니다.
		 * **배열 생성해야함
		 */
		
		menus m1 = new menus();
		String ap[] = m1.aaa();
		System.out.println(Arrays.toString(ap));

	}

}

class ak5 {
	public int num(int z, int x) {
		int total = z * x;
		return total;
	}
	public int num2(int a) {
		//반복문과 조건문 안에 리턴 사용 불가, 더블 반복문이어도 권고하지 않음
		int w = 1;
		int total = 0;
		while(w < 10) {
			total += w * a;
			w++;
		}
		return total;
	}
}
class menus {
	   private String[][] m;
	   public menus() {
	      String ms[][] = {
	            {"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
	            {"Y","Y","N","Y","Y","N","Y"}
	      };
	      this.m = ms;
	   }
	   public String[] aaa() {
	      int ea = this.m[0].length;
	      String box[] = new String[5];
	      int w = 0;
	      int ct = 0;
	      while(w < ea) {
	         if(this.m[1][w].equals("Y")) {
	            box[ct]=m[0][w];
	            ct++;
	         }
	         w++;
	      }
	      return box;
	   }

	}