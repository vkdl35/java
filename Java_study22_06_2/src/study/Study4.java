package study;

import java.util.Arrays;

public class Study4 {

	public static void main(String[] args) {
		
		/*
		 * 다음 해당 값이 있습니다. 해당 값에 대해 배열로 각각 저장 되도록 합니다. 
		 * honggildong 결과 h,o,n,g,g,i,d,o,n,g
		 * 로 배열이 저장 되어야 합니다. 
		 * 해당 처리는 외부 class에서 처리가 되도록 합니다.
		 */
		
		test12 t = new test12();
		t.t1("honggildong");


	}

}

class test12 {
	public void t1(String name) {
		String data[] = name.split("");
		System.out.println(Arrays.toString(data));
	}
}