package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		
		//문자와 숫자 배열 사용
		
		Scanner sc = new Scanner(System.in);
		int w = 0;
		ArrayList list = new ArrayList();	//자료형이 없는 상태
		while(w < 5) {
			System.out.println("데이터를 입력해 주시길 바랍니다.");
			String user = sc.next();
			list.add(user);
			w++;
		}
		System.out.println(list);
		
		
		/* 숫자 입력사항만 모두 더함 */
		
		int ww = 0;
		int total = 0;
		do {
			try {
				Object k = list.get(ww);	//배열 자료가 숫자 + 문자 형태로 구성이 되어 있을 경우는 오브젝트 매개타입으로 설정
				int numbers = Integer.parseInt(k.toString());	//해당 매개타입을 문자화하여 parseint로 재검증함
				total += numbers;
			}catch (Exception e) {}//배열의 매개타입이 숫자가 아닐 경우(예외상황발생)
			ww++;
		}while(ww < list.size());
		
		System.out.println("입력한 모든 배열의 숫자 합은 : "+total+"입니다.");
		
//		Object a = list.get(1);
//		System.out.println(a);
	}

}
