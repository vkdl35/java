import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		// 클래스 + 메소드 + 배열
		
		
		/*
		 * [응용문제]
		 * 사용자가 자신의 이름을 입력합니다. 
		 * 사용자 이름을 해당 Class로 보내서 등록된 사용자인지 
		 * 미 가입자 사용자인지 확인하는 코드를 작성하세요.
		 * 등록된 사용자일 경우 "가입이 되어있습니다." 라고 출력하고,
		 * 확인이 되지 않을 경우 "미가입자 입니다." 라고 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 이름을 입력하세요.");
		String user_name = sc.next();
		String users[] = {"홍길동","이순신","김유신"};
		arrays.lists(users,user_name);
		sc.close();
		
	}

}

class arrays {
	public static void lists(String a[],String data) {
		int w = 0;
		int ea = a.length;
		String msg = null;	//메소드로 해당값을 전달할 때는 비어있는 값을 명확하게 적용해야 합니다.
		//string : "" or null, int : 0
		boolean ck = false; 
		while(w<ea) {
			if(data.equals(a[w])) {
				msg = "가입이 되어있습니다.";
				ck = true;
			}
			w++;
		}
		if(ck==false) {
			msg = "미가입자 입니다.";
		}
		arrays ar = new arrays();
		ar.message(msg);
	}
	public void message(String m) {
		System.out.println(m);
		}
}
