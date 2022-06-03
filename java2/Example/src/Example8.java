import java.util.Arrays;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 다음 사용자가 복권 관련 프로그램을 요청하였습니다.
		 * 사용자가 총 다섯개의 숫자를 입력하게 됩니다.
		 * "1~46 번 사이의 숫자를 입력해 주세요."
		 * 사용자가 입력한 다섯개의 숫자를 배열로 생성합니다. (main처리)
		 * 
		 * 외부 클래스를 이용하여 pc가 직접 당첨번호 다섯개를 랜덤하게 뽑아냅니다.
		 * pc가 뽑은 다섯개의 숫자를 배열로 생성합니다. (외부 class 메소드 처리)
		 * 
		 * 별도의 결과 메소드를 하나 더 생성하여
		 * 사용자가 입력한 다섯개의 배열 데이터와 pc가 뽑은 배열 데이터를 
		 * 해당 메소드로 전달하여 출력하세요. 
		 * 단, 모든 사용하는 반복문은 무조건 do while문으로 작성하세요.
		 * 
		 * [결과]
		 * 유저가 뽑은 숫자 다섯개
		 * pc가 뽑은 숫자 다섯개
		 */
		
		Scanner sc = new Scanner(System.in);
		int box[] = new int[5];
		int a = 0;
		int user;
		do {
			System.out.println("1~46번 사이의 숫자를 입력해 주세요.");
			user = sc.nextInt();		
			box[a] = user;
			a++;
		}while(a < 5);
		//System.out.println(Arrays.toString(box));
		data2 dt = new data2();
		dt.datas(box);
		

	}

}

class data2 {
	public void datas(int user1[]) {	//user1 = 사용자 입력값
										//user2 = 값
		int box2[] = new int[5];
		int b;
		int w = 0;
		do {
			b = (int)(Math.random()*5)+1;
			box2[w] = b;
			w++;
		}while(w < 5);
		
		datas2(user1,box2);
	}
	public static void datas2(int user2[], int pc[]) {	//사용자 5, pc 5
		System.out.println(Arrays.toString(user2));
		System.out.println(Arrays.toString(pc));
	}
}






