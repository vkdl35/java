package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList (�迭��) - add,remove,get,size
		//Map (�迭Ű, �迭��)	- remove,get
		//Map�� �迭Ű�� ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ���մϴ�. (�ӵ��� ���� ����)
		//���� Ű�� ���� �������� ����� ������ ���ŵ˴ϴ�.
		//! Ű���� ���� �ߺ���Ű�� ����
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(HashMap) -> �ؽ��ڵ�� ��ȯ�ϸ鼭 �ڵ����� ������ (�ߺ����� �߻����� ����)
		m.put("hong", "ȫ�浿");
		m.put("kang", "������");
		System.out.println(m.get("hong"));	
		m.put("", "��");	//����ִ� Ű�� ����� �� ������ Map �������� �ùٸ��� ����
		m.put("park", "");	//Ű�� ������ ���� ������� ���� ����
		if(m.get("park").equals("")) {
			m.put("park", "��");
		}
		//get�ڿ� �ε��� ��ȣ�� ������ null ����, �迭Ű�� ȣ���ؾ� �迭���� ����(��, �ߺ��Ǹ� �������� ���� ���� ��µ�)
		m.remove("hong");
		System.out.println(m);
		
		//Map : �������� �ڷ����� ����� �� ����
		Map<String, Integer> m2 = new HashMap<>();	//�������� �������� ���� �� ���� ���� (Object�� ��� ����)
		m2.put("age",32);
		m2.put("level", 5);
		System.out.println(m2.keySet());	//Ű�� ���
		System.out.println(m2.values());	//���� ���
		System.out.println(m2.containsKey("tel"));	//�ش� Ű�� �ִ��� Ȯ��
		
	}

}
