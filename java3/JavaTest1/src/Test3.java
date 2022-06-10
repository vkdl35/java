import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요.");
		int user = sc.nextInt();
		sc.close();
		
		if(user>60) {
			System.out.println("해당 숫자는 60까지만 입력이 되어야 합니다.");
		}
		else if(user<=60 && user % 2 == 1){
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("짝수입니다.");
		}
		
	}

}
