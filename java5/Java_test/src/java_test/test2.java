package java_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test2 {

	public static void main(String[] args) {

		/*
		 * 2번 문제 { "사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8" } 각각의 개당 가격이 있습니다. 
		 * 해당 장바구니는 갯수만큼 전체 값을 계산하여 총 결제할 금액을 출력하는 프로그램을 작성하시오 
		 * [각각 1개당 가격] 
		 * 사과 = 250 
		 * 양파 = 200 
		 * 마늘 = 700 
		 * 파 = 2300 
		 * 참치캔 = 1100 
		 * 라면 = 850 
		 * [결과출력] 
		 * 구매하시고자 하는 총 결제 금액은 : XXXXX 원 입니다. ※
		 * 각각 1개당 가격 관련 사항 배열은 직접 제작하시길 바라며, 해당 배열 기본가격 절대 값이 변하지 않아야 합니다. 
		 * 각각 1개당 가격 관련 사항은 별도의 java 파일에서 로드 하여 가져오시길 바랍니다. 
		 * test2.java test2_data.java를 함께 이용합니다.
		 */
		
		
		
		/*
		Map<String, String> m = new HashMap<>();
		String data[] = {"사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8"};
		String key[];		
		int f;
		for(f=0; f<data.length; f++) {
			key = data[f].split("=");
			m.put(key[0], key[1]);
			Integer.parseInt(key[1]);
		}
	
		Map<String, Integer> m2 = new HashMap<>();
		String data2[] = {"사과=250","양파=200","마늘=700","파=2300","참치캔=1100","라면=850"};
		String key2[];
		int f2;
		for(f2=0; f2<data2.length; f2++) {
			key = data[f2].split("=");
		}
		 */
		
		basket b = new basket();
		b.basket_data();
		System.out.println("최종 결제 금액은 " + b.total + "원 입니다.");

		
	}

}


class basket extends test2_data {
	static int total = 0;
	public void basket_data() {
		String user[] = {"사과=250","양파=200","마늘=700","파=2300","참치캔=1100","라면=850"};
		
	}
}