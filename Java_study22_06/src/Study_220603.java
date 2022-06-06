import java.util.Arrays;
import java.util.Scanner;

public class Study_220603 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제1] 배열 + 메소드		//▶77
		 * 1차 배열에 다음과 같이 값이 있습니다. 
		 * 배열리스트 11 22 33 44 55 66 77 88 99 이며
		 * 해당 전체값을 모두 더한 총합계 값을 별도의 메소드로 처리 되도록 합니다. 
		 * 단, 반복문은 무조건 do~while문으로 작성합니다.
		 */

		int num[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Adata_2 ad = new Adata_2();
		ad.datas(num);
		ad = null;
		
		/*
		 * [응용문제2] 배열 + 기본(클래스) 메소드 문제		//▶88
		 * product : 수박, 참외, 사과, 배, 딸기, 키위, 바나나, 망고 중
		 * 참외, 배, 키위를 삭제 했습니다.
		 * 해당 삭제 후 배열을 다시 재 리스트 하는 코드를 작성하세요.
		 * 단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야하며 반복문은 자유입니다.
		 * 결과 : 수박, 사과, 딸기, 바나나, 망고
		 */
		
		String fruit[] = { "수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고" };
		Bdata_2 bd = new Bdata_2();
		bd.list(fruit);
		bd = null;
		
		/*
		 * [응용문제3] 배열 + 기본(클래스) 메소드 문제		//▶104
		 * product : 수박,참외,사과,배,딸기,키위,바나나,망고
		 * moneys : 35000,8000,4000,5500,3800,4400,11000,18900
		 * 장바구니에 해당 상품을 모두 담았습니다.
		 * 단, 그 중 사과와 바나나는 제외하고 총 결제 금액을 출력하세요.
		 */
		
		String fruit2[] = { "수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고" };
		int money[] = { 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900 };
		Cdata_2 cd = new Cdata_2();
		cd.data(fruit2, money);
		cd = null;

		/*
		 * [응용문제4] 배열 생성 + 기본(클래스) 메소드 문제		//▶118
		 * 사용자가 다음 질문에 값을 입력하게 됩니다. 
		 * "학급 학생 이름을 입력해주세요."
		 * 총 배열 데이터는 5개가 생성됩니다. **무조건 다섯번 질문
		 * 별도의 메소드에서 해당 사용자가 입력한 값을 리스트로 구성하여 출력하세요.
		 * 예시) 사용자가 입력한 형태 : hong, kim, park, lee, jang
		 * 결과) hong, kim, park, lee, jang
		 */
		
		Scanner sc = new Scanner(System.in);
		int w = 1;
		String name = "";
		while (w < 6) {
			System.out.println("학급 학생 이름을 입력해주세요.");
			String user = sc.next();
			name += (user + " ");
			w++;
		}
		Ddata_2 dd = new Ddata_2();
		dd.list(name);
		sc.close();
		dd = null;
      
	}	
}

class Adata_2 {		//▶9
	public void datas(int num_2[]) {
		int w = 0;
		int ea = num_2.length;
		int total = 0;
		do {
			total += num_2[w];
			w++;
		} while (w < ea);
		System.out.println(total);
	}
}
class Bdata_2 {		//▶22
	public void list(String f[]) {
		String new_fruit[] = new String[5];
		int w = 0;
		int ea = f.length;
		int total = 0;
		while (w < ea) {
			if (!f[w].equals("참외") && !f[w].equals("배") && !f[w].equals("키위")) {
				new_fruit[total] = f[w];
				total++;
			}
			w++;
		}
		System.out.println(Arrays.toString(new_fruit));
	}
}
class Cdata_2 {		//▶36
	public void data(String f[], int m[]) {
		int ea = f.length;
		int w = 0;
		int total = 0;
		while (w < ea) {
			if (!f[w].equals("사과") && !f[w].equals("바나나")) {
				total += m[w];
			}
			w++;
		}
		System.out.println(total);
	}
}
class Ddata_2 {		//▶50
	public void list(String name_2) {
		String user_2[] = name_2.split(" ");
		System.out.println(Arrays.toString(user_2));
	}
}
