import java.util.Scanner;
import java.util.Random;

public class Study_220602_2 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제1] ▶86
		 * for_in이라는 일반 메소드가 있습니다. (메모리를 사용하는) 
		 * 프로그램 사용시 다음과 같이 질문을 합니다.
		 * "사용하실 구구단 숫자를 하나 입력해주세요." 
		 * [결과] - 해당 메소드에서 결과를 출력해야 합니다. 
		 * 만약 사용자가 3단을 입력시 3*1=3 ... 3*9=27 출력이 되어야 합니다.
		 */

		System.out.println("사용하실 구구단 숫자를 하나 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		Study_220602_2 st = new Study_220602_2();
		int user = sc.nextInt();
		int total = 1;
		int w;
		for (w = 1; w < 10; w++) {
			total = w * user;
			st.for_in(user, w, total);
		}
		sc.close();
		st = null;

		/*
		 * [응용문제2] ▶91
		 * 전체 해당 로드할 class명은 agrees라는 이름을 가지고 있습니다. 
		 * main 메소드에서 사용자가 "동의함 또는 동의안함을 선택해주세요." 
		 * 동의함으로 입력 되었을 경우 "회원가입이 진행됩니다." 라는 메세지를 출력하고, 
		 * 동의안함을 입력시 "동의를 하셔야 진행됩니다." 라고 출력됩니다. 
		 * 단, agrees 클래스 안에 void 메소드 한개 또는 두개를 선택하여 코드를 제작하세요.
		 */

		Scanner sc1 = new Scanner(System.in);
		System.out.println("동의함 또는 동의 안함을 입력해주세요.");
		String user2 = sc1.nextLine();
		agrees ag = new agrees();
		ag.datas(user2);
		sc1.close();
		ag = null;
		
		/*
		 * [응용문제3] 클래스+메소드+배열 ▶102
		 * 사용자가 자신의 이름을 입력합니다. 
		 * 사용자 이름을 해당 Class로 보내서 등록된 사용자인지 미가입자 사용자인지 확인하는 코드를 작성하세요. 
		 * 등록된 사용자일 경우 "가입이 되어있습니다." 라고 출력하고, 
		 * 확인이 되지 않을 경우 "미가입자 입니다." 라고 출력하세요.
		 */
		
		String names[] = { "이경민", "이하율", "이성재" };
		System.out.println("사용자 이름을 입력해주세요.");
		Scanner sc2 = new Scanner(System.in);
		String user3 = sc2.next();
		Adata_1 ad_1 = new Adata_1();
		ad_1.user_name(names, user3);
		sc2.close();
		ad_1 = null;
		
		/*
		 * [응용문제4] ▶131
		 * 다음 문자 배열 데이터값이 있습니다. 
		 * a1 : 홍길동 이순신 강감찬 유관순 김유신 
		 * a2 : 100 80 39 60 55
		 * "검색하고자 하는 이름을 적어주세요." 출력하게 됩니다. 
		 * 검색어에 이순신이라고 검색을 하게 되면 "이순신님은 80점입니다." 라고 출력이 되어야 합니다.
		 */
		
		String name1[][] = { 
				{ "홍길동", "이순신", "강감찬", "유관순", "김유신" }, 
				{ "100", "80", "39", "60", "55" } 
			};
		Scanner sc3 = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요.");
		String user4 = sc3.next();
		Bdata_1 bd_1 = new Bdata_1();
		bd_1.jumsu(name1, user4);
		sc3.close();
		bd_1 = null;

	}
	public void for_in(int a, int b, int c) { //▶응용문제1, ▶9
		System.out.printf("%d*%d=%d\n ", a, b, c);
	}
}

class agrees {	//▶응용문제2, ▶31
	public void datas(String a) {
		if (a.equals("동의함")) {
			System.out.println("회원가입이 완료 되었습니다.");
		} else if (a.equals("동의 안함")) {
			System.out.println("동의를 하셔야 진행됩니다.");
		} else {
			System.out.println("동의함 또는 동의 안함을 입력하셔야 합니다.");
		}
	}
}
class Adata_1 {	//▶응용문제3, ▶48
	public void user_name(String names_2[], String user_2) {
		int names_num = names_2.length;
		int a = 0;
		String mag = null;
		boolean ck = false;
		while (a < names_num) {
			if (user_2.equals(names_2[a])) {
				mag = "가입이 되어있습니다.";
				ck = true;
			}
			a++;
		}
		if (ck == false) {
			mag = "미가입자 입니다.";
		}
		System.out.println(mag);
	}
	public void rotto2() {
		Random r = new Random(); // random객체 생성 및 인스턴스 적용이라는데 무슨 소린지 잘 모르겠따
		int w = 0;
		while (w <= 6) {
			System.out.print((r.nextInt(45) + 1) + " ");
			// 0~9까지 nextInt를 사용한다는데 이것역시 무슨 소린지 모르겠서요
			w++;
		}
		r = null;
	}
}
class Bdata_1 {	//▶응용문제4, ▶65
	public void jumsu(String name_3[][], String user_3) {
		int num2 = name_3[0].length;
		int w = 0;
		boolean ok = false;
		while (w < num2) {
			if (user_3.equals(name_3[0][w])) {
				System.out.println(user_3 + "님은 " + name_3[1][w] + "점입니다.");
				ok = true;
			}
			w++;
		}
		if (ok == false) {
			System.out.println("등록된 사용자가 없습니다.");
		}
	}
}