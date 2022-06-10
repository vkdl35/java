import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 숫자를 하나 입력해주세요.");
		int user = sc.nextInt();
		sc.close();
		
		int total = 1;
		int w = 1;
		
		if(user < 0) {
			System.out.println("음수값은 구구단을 이용할 수 없습니다.");
		}
		else {
			do {
				total = w * user;
				System.out.printf("%d*%d=%d ",user,w,total);
				w++;
			}while(w < 10);
			
		}

	}

}
