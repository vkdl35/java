package study;

import java.util.Arrays;

public class Study4 {

	public static void main(String[] args) {
		
		/*
		 * ���� �ش� ���� �ֽ��ϴ�. �ش� ���� ���� �迭�� ���� ���� �ǵ��� �մϴ�. 
		 * honggildong ��� h,o,n,g,g,i,d,o,n,g
		 * �� �迭�� ���� �Ǿ�� �մϴ�. 
		 * �ش� ó���� �ܺ� class���� ó���� �ǵ��� �մϴ�.
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