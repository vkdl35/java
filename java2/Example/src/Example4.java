import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제] 배열 생성 + 기본(클래스) 메소드 문제
		 * 사용자가 다음 질문에 값을 입력하게 됩니다. 
		 * "학급 학생 이름을 입력해주세요."
		 * 총 배열 데이터는 5개가 생성됩니다. **무조건 다섯번 질문
		 * 별도의 메소드에서 해당 사용자가 입력한 값을 리스트로 구성하여 출력하세요.
		 * 예시) 사용자가 입력한 형태 : hong, kim, park, lee, jang
		 * 결과) hong, kim, park, lee, jang
		 */
		
		Scanner sc = new Scanner(System.in);
		int f = 0;
		String list = "";
		while(f < 5) {
			System.out.println("학급 학생 이름을 입력해주세요.");
			String num = sc.next();
			list += (num+" ");
			f++;
			}
			data(list);
			sc.close();
			
		
		
	}

			
	public static void data(String a) {
		//System.out.println(a);
		//a = a.trim();
		String userin[] = a.split(" ");	
		//split : 문자열 또는 숫자열 특정 문자 기준으로 배열을 생성할 수 있는 명령어
		System.out.println(Arrays.toString(userin));
		
		}

}
