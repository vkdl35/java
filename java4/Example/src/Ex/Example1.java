package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		 * �ܺ�class�� ����Ͽ� ���� ���μ����� �ۼ��ϼ���.
		 * ���� 2���� �迭 �����Ͱ� �ֽ��ϴ�.
		 * ��, 2���� �迭�� �ϳ��� �迭�� ��ġ���� �մϴ�.
		 * �״�� �ߺ��� ���� �ϳ��� ó���� �ϼž� �մϴ�.
		 * 1�� DB : 11,22,33,44,55
		 * 2�� DB : 8,10,11,19,44
		 * ��� ��� : 8,10,11,19,22,33,44,55
		 */
		
		ak_data ad = new ak_data();
		ad.add();
		

		

	}

}


class ak_data {
	//ArrayList<Integer> a = null;
	
	public void add() {
		Integer box[] = new Integer[10];
		int a1[] = {11,22,33,44,55};
		int a2[] = {8,10,11,19,44};
		
		int w = 0;
		int ct = 0;
		while(w < a1.length) {
			box[ct] = a1[w];
			ct++;
			box[ct] = a2[w];
			ct++;
			w++;
		}
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(box));
		a.remove(0);
		a.remove(8);
		
		Collections.sort(a);
		System.out.println(a);
		
	}
	

}