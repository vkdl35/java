package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		//add(�߰�), get(������ �ε�), remove(����), size(����) : ArrayList��� ��ƿ �޼ҵ忡�� ���
		//Arrays.asList : �ε��� �迭 ������ ����
		//�߿�! add�� �Ϲ������� ������ �� �ڿ� �����Ͱ� �߰��˴ϴ�. ��, �ε��� ��ȣ�� ���� �� ���� �����ϸ� �ش� �ε��� �κп� �߰��˴ϴ�.
		String member[] = {"�̼���","ȫ�浿","������","������"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		//System.out.println(mb);
		int ea = mb.size();
		//System.out.println(ea);
		mb.add("������");
		//System.out.println(mb);
		mb.remove(1);
		//System.out.println(mb);
		mb.add(3,"�������");
		//System.out.println(mb);
		String checks = mb.get(2);
		//System.out.println(checks);
		
		/* [���빮��] 
		 * �� ������ 15,22,37,8,11,19,41
		 * �ش� �������͸� Ŀ�����Ͽ� ���� ���ó�� ����ϼ���.
		 * [7,15,22,8,11,39,41]*/
		//ArrayList���� int�� ������� ����(Integer) �����
		Integer numbers[] = {15,22,37,8,11,19,41};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numbers));
		
		int ea2 = num.size();
//		System.out.println(ea2);
		num.remove(2);
		num.remove(4);
//		System.out.println(num);
		num.add(0,7);
		num.add(5,39);
		System.out.println(num);
		
		
	}

}
