package swing1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class swing3 {
	//반복문 이용하여 키 생성 및 배열값을 split으로 분리 작업
	public static void main(String[] args) {
		
		String data[] = {"홍길동","강감찬","이순신","유관순"};
		Map<String,String> m = new HashMap<>();
		int w = 0;
		while(w < data.length) {
			/* 중복되지 않는 키값 생성 + 해당 배열에 있는 인덱스 번호 */
			m.put("name"+w, data[w]);	//키값에 +w를 안해주면 맨마지막 배열값만 들어감
			//m.put(String.valueOf(w), data[w]);	//키 값을 String로 생성시
			//m.put(w, data[w]);	//키 값을 Integer로 생성시(보통 사용하지 않음)
			w++;
		}
		System.out.println(m);
		
		Map<String,String> m2 = new HashMap<>();
		
		for(String names : data) {
			m2.put(names,names);	//foreach로 키,값이 동일하게 적용
		}
		System.out.println(m2);
		
		String alldata[] = {"names=홍길동","aeg=25","email=hong@naver.com"};
		Map<String, String> m3 = new HashMap<>();
		int f;
		for(f = 0;f<alldata.length;f++) {
			String key[] = alldata[f].split("=");
			m3.put(key[0], key[1]);
		}
		System.out.println(m3);
		
		

	}

}
