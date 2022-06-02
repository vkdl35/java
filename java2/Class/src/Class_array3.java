import java.util.Arrays;
import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 * [응용문제]
		 * 다음 문자 배열 데이터값이 있습니다.
		 * a1 : 홍길동 이순신 강감찬 유관순 김유신
		 * a2 : 100 80 39 60 55
		 * "검색하고자 하는 이름을 적어주세요." 출력하게 됩니다.
		 * 검색어에 이순신이라고 검색을 하게 되면
		 * "이순신님은 80점입니다." 라고 출력이 되어야 합니다.
		 */
		
//		Scanner ac = new Scanner(System.in);
//		String su [][] = {
//				{"홍길동","이순신","강감찬","유관순","김유신"},
//				{"100","80","39","60","55"}
//		};
//		
//		System.out.println("검색하고자 하는 이름을 적어주세요.");
//		String user = ac.next();
//		data.data(su,user);
		String a1[] = {"홍길동","이순신","강감찬","유관순","김유신"};	//a1 배열
//		int a2[] = {100,80,39,60,55};
		String a2[] = {"100","80","39","60","55"};	//a2 배열
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요.");
		String usernm = sc.next();	//사용자가 입력한 데이터 usernm
		
		jumsu j = new jumsu();
		j.ck(a1,a2,usernm);	//ck라는 메소드에 위의 데이터 정보를 보냄
	}

}

class jumsu {
	public void ck(String data1[],String data2[],String user) {	//main 메소드에 있는 정보를 받음 (j.ck(a1,a2,usernm))
		//System.out.println(Arrays.toString(data1));
		System.out.println(user);
	}
}



//class data {
//	public static void data(String aa[], String b) {
//		int ea = aa.length;
//		String newdata[] = new String[su[0].length];
//		int w = 0;
//		while(w == 0) {
//			int ww = 0;
//			while (ww < ea) {
//				newdata[w] = su[0][ww] + "님은 " + su[1][ww] + "점 입니다.";
//				w++;
//			}
//			w++;
//		}
//		System.out.println(Arrays.toString(newdata));
//		
//	}
//}






