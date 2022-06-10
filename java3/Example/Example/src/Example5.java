import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

		/*
		 * [응용문제]
		 * extends를 사용하여 다음 결과에 대한 코드를 작성하세요.
		 * 숫자 두 개를 입력합니다.
		 * 두 개의 숫자를 확인하여 다음과 같이 체크합니다.
		 * 첫번째 숫자가 두번째 숫자보다 작을 경우 
		 * 첫번째 숫자가 두번째 숫자보다 클 경우 
		 * 첫번째 숫자와 두번째 숫자가 같을 경우 
		 * 
		 * 첫번째 숫자가 작을 경우 : 해당 두 개의 값을 합친 결과값 출력
		 * 두번째 숫자가 작을 경우 : 해당 범위만큼 숫자를 모두 더한 결과 값을 출력
		 * 첫번째와 두번째 숫자가 같을 경우 : "해당 값이 같습니다." 라는 메시지 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int user1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int user2 = sc.nextInt();
		sc.close();
		
		BD b = new BD();
		b.ad1(user1,user2);
		b.ad2();
		System.exit(0);
		
		

	}

}

class AD {
	
	protected int a;
	protected int b;
	
	public void ad1(int u1, int u2) {
		
		this.a = u1;
		this.b = u2;
		
	}
}
class BD extends AD{
	
	public void ad2() {
		
		int total = 0;
		
		if(this.a < this.b) {
			total=a+b;
			System.out.println(total);
		}
		else if(this.b < this.a) {
			while(b <= a) {
				total+=b;
				b++;
			}
			System.out.println(total);
		}
		else {
			System.out.println("해당 값이 같습니다.");
		}
		
	}
	
}