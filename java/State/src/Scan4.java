import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("입력할 내용을 적어주세요.");
		//String memo = a.next();
		String memo = a.nextLine(); 
		//next() : 스페이스바 입력까지만 적용
		//nextLin() : 스페이스바 포함 모두 입력적용
		System.out.println(memo);
		
		a.close(); //Scanner 종료를 기본으로 적용해주어야 합니다, 메모리가 잡혀있기 때문에 종료해주는 것이 좋음.
		/*
		 * 문자 : park
		 * 숫자 : 25
		 * */
		
		String a1="park"; 	//String 또는 String + 숫자 = %s
		int a2=25; 			//숫자 = %d
		/*
		 [중요사항]
		 %f : float, double
		 %t : date, time 시간, 날짜
		 %b : boolean (true, false)
		 */
		
		//System.out.println(a1+"님의 나이는"+a2+"입니다.");
		//printf : f라는 뜻이 format을 뜻합니다.
		System.out.printf("%s님의 나이는 %d입니다.",a1, a2);
		
	}

}
