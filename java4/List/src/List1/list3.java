package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * �ѹ�������1 3,6,9,12,15
		 * �ѹ�������2 2,4
		 * 3,6,7,12,15,2,4
		 * */
		
		/* Arrays.sort : �迭���� ���¿��� ���밡�� */
		Integer a[] = {3,6,9,12,15};
		Integer b[] = {2,4};
		ArrayList<Integer> ar1 = new ArrayList<>(Arrays.asList(a));
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(b));
		
		int ea = ar2.size();
		int f;
		for(f=0;f<ea;f++) {
			ar1.add(ar2.get(f));
		}
		Collections.sort(ar1);	//ArrayList, LinkedList sort �������� ����
		System.out.println(ar1);
		
		
		
	}

}
