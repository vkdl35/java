package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 해당 데이터값 중 휴면고객 데이터는 모두 삭제해야 합니다.
		 * 고객 데이터 - 김수빈, 김정현, 김창수, 박도현, 이경훈, 정재욱, 하윤성
		 * 결과 - 정재욱, 하윤성 (만 출력) 
		 */
		
		/* - 내가 짠 코드 오류
		String user[] = {"김수빈","김정현","김창수","박도현","이경훈","정재욱","하윤성"};
		int e[] = {1,1,1,1,1,0,0};
		ArrayList<String> u = new ArrayList<>(Arrays.asList(user));
		int ea = u.size();
		
		int w = 0;
		while(w < ea) {
			if(e[w] > 0) {
				u.remove(w);
			}
			w++;
		}
		System.out.println(u);
		*/
		
		String user[] = { "김수빈", "김정현", "김창수", "박도현", "이경훈", "정재욱", "하윤성" };
		ArrayList<String> u = new ArrayList<>(Arrays.asList(user));
		int ea = u.size();
		int w = 0;
		while (w < ea) {
			//int ea2 = u.size();	//node의 갯수를 다시 파악
			int ww = 0;
			while (ww <= 0) {
				if (!u.get(ww).equals("정재욱") && !u.get(ww).equals("하윤성")) {
					u.remove(0);
					System.out.println(u);
				}
				ww++;
			}
			w++;
		}
		
		
		
		/*
		 * 응용 
		 * 짝수의 숫자를 모두 삭제 
		 * 10,7,6,1,11,37,41,22
		 */
		
		Integer num[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(num));
		
		int no = ar2.size();
		int z = 0;
		do {
			int no2 = ar2.size();
			int zz = 0;
			do {
				if(ar2.get(zz) % 2 == 0) {			
					ar2.remove(zz);
					break;
				}
				zz++;
			}while(zz < no2);
			//ar2.remove(0);
			z++;
		}while(z < no);
		System.out.println(ar2);
		
		
		
	}

}
