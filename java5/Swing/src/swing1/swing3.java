package swing1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class swing3 {
	//�ݺ��� �̿��Ͽ� Ű ���� �� �迭���� split���� �и� �۾�
	public static void main(String[] args) {
		
		String data[] = {"ȫ�浿","������","�̼���","������"};
		Map<String,String> m = new HashMap<>();
		int w = 0;
		while(w < data.length) {
			/* �ߺ����� �ʴ� Ű�� ���� + �ش� �迭�� �ִ� �ε��� ��ȣ */
			m.put("name"+w, data[w]);	//Ű���� +w�� �����ָ� �Ǹ����� �迭���� ��
			//m.put(String.valueOf(w), data[w]);	//Ű ���� String�� ������
			//m.put(w, data[w]);	//Ű ���� Integer�� ������(���� ������� ����)
			w++;
		}
		System.out.println(m);
		
		Map<String,String> m2 = new HashMap<>();
		
		for(String names : data) {
			m2.put(names,names);	//foreach�� Ű,���� �����ϰ� ����
		}
		System.out.println(m2);
		
		String alldata[] = {"names=ȫ�浿","aeg=25","email=hong@naver.com"};
		Map<String, String> m3 = new HashMap<>();
		int f;
		for(f = 0;f<alldata.length;f++) {
			String key[] = alldata[f].split("=");
			m3.put(key[0], key[1]);
		}
		System.out.println(m3);
		
		

	}

}
