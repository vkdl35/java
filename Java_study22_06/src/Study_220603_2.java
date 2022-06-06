import java.util.Arrays;
import java.util.Scanner;

public class Study_220603_2 {

	public static void main(String[] args) {
		/*
		 * [응용문제5] 2차 배열 + 기본(클래스) 메소드 문제		//▶101
		 * 등록된 고객중 VIP 고객만 리스트를 출력하세요.
		 * user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 * user_level : gold vip guest gold vip vip guest
		 * 결과출력 : 이순신, 세종대왕, 김유신
		 */
		
		String user2[][] = {
				{ "홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신" },
				{ "gold", "vip", "guest", "gold", "vip", "vip" } 
		};
		Edata_2 ed = new Edata_2();
		ed.vip(user2);
		ed = null;
		
		/*
		 * [응용문제6] 2차 배열		//▶116
		 * 데이터는 다음과 같습니다.
		 * user_list : 홍길동 이순신 강감찬 유관순 세종대왕 김유신 계백장군
		 * user_point : 3000 1000 25000 19800 5750 3630 0
		 * 프로그램 시작과 동시에 "포인트를 검색할 고객명을 입력하세요." 가 출력됩니다.
		 * 입력한 값은 별도의 class를 제작하여 해당 메소드 값으로 
		 * 매개변수를 이용하여 전달 후 해당 결과값을 출력하세요.
		 */
		
		String user3[][] = { 
				{ "홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군" },
				{ "3000", "1000", "25000", "19800", "5750", "3630", "0" } 
		};
		Scanner sc1 = new Scanner(System.in);
		System.out.println("포인트를 검색할 고객명을 입력하세요.");
		String name2 = sc1.next();
		Fdata_2 fd = new Fdata_2();
		fd.list(user3, name2);
		sc1.close();
		fd = null;

		/*
		 * [응용문제7] 다차원 배열로 생성 + 외부 class 및 메소드 사용		//▶133
		 * [data]
		 * {"홍길동","합격"}
		 * {"이순신","합격"}
		 * {"강감찬","불합격"}
		 * {"김유신","합격"}
		 * {"유관순","불합격"}
		 * {"장보고","불합격"}
		 * 다차원 배열 형태이며, 해당 값중 합격자만 출력되도록 합니다.
		 * 단, 배열값을 외부 클래스 안에 메소드에서 처리가 되도록 합니다.
		 * 결과 : 홍길동 이순신 김유신
		 */
		
		String user4[][] = {
	            {"홍길동","합격"},
	            {"이순신","합격"},
	            {"강감찬","불합격"},
	            {"김유신","합격"},
	            {"유관순","불합격"},
	            {"장보고","불합격"}
	      };
		Gdata_2 gd = new Gdata_2();
	    gd.list(user4);
	    gd = null;
	      
		/*
		 * [응용문제8]		//▶147
		 * 다음 사용자가 복권 관련 프로그램을 요청하였습니다. 
		 * 사용자가 총 다섯개의 숫자를 입력하게 됩니다.
		 * "1~46 번 사이의 숫자를 입력해 주세요." 사용자가 입력한 다섯개의 숫자를 배열로 생성합니다. (main처리)
		 * 외부 클래스를 이용하여 pc가 직접 당첨번호 다섯개를 랜덤하게 뽑아냅니다. 
		 * pc가 뽑은 다섯개의 숫자를 배열로 생성합니다. (외부 class 메소드 처리)
		 * 별도의 결과 메소드를 하나 더 생성하여 사용자가 입력한 다섯개의 배열 데이터와 pc가 뽑은 배열 데이터를 해당 메소드로 전달하여 출력하세요. 
		 * 단, 모든 사용하는 반복문은 무조건 do while문으로 작성하세요.
		 * [결과] 유저가 뽑은 숫자 다섯개, pc가 뽑은 숫자 다섯개
		 */
	      
		Scanner sc2 = new Scanner(System.in);
		int user_num[] = new int[5];
		int w2 = 1;
		int ct = 0;
		while (w2 < 6) {
			System.out.println("1~46번 사이의 숫자를 입력해주세요.");
			int user5 = sc2.nextInt();
			user_num[ct] += user5;
			ct++;
			w2++;
		}
		Hdata_2 hd = new Hdata_2();
		hd.pc_random(user_num);
		sc2.close();
		hd = null;
	      
	}	
}
class Edata_2 {		//▶8
	public void vip(String list[][]) {
		int w = 0;
		int ea = list[0].length;
		String list_vip = " ";
		while (w < ea) {
			if (list[1][w].equals("vip")) {
				list_vip += list[0][w] + " ";

			}
			w++;
		}
		System.out.println(list_vip);
	}
}
class Fdata_2 {		//▶24
	public void list(String user_2[][], String name_2) {
		int ea = user_2[0].length;
		int w = 0;
		boolean ok = false;
		while (w < ea) {
			if (name_2.equals(user_2[0][w])) {
				System.out.printf("%s님의 포인트는 %s원입니다.", name_2, user_2[1][w]);
				ok = true;
			}
			w++;
		}
		if (ok == false) {
			System.out.println("고객이 존재하지 않습니다.");
		}
	}
}
class Gdata_2 {		//▶43
public void list(String user_2[][]) {
      int ea = user_2.length;
      int w = 0;
      String user_list = " ";
      while(w < ea) {
    	  if(user_2[w][1].equals("합격")) {
    		  user_list = user_2[w][0]+" ";
    		  System.out.print(user_list);
         }
         w++;
      }
   }
}
class Hdata_2 {		//▶72
	public void pc_random(int user_list[]) {
		int pc_num[] = new int[5];
		int total = 0;
		int w = 1;
		while (w < 6) {
			int num = (int) (Math.random() * 46) + 1;
			pc_num[total] += num;
			total++;
			w++;
		}
		total_random(user_list, pc_num);
	}
	public void total_random(int user_1[], int pc_1[]) {
		System.out.println(Arrays.toString(user_1));
		System.out.println(Arrays.toString(pc_1));
	}
}