package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		
		//���ڿ� ���� �迭 ���
		
		Scanner sc = new Scanner(System.in);
		int w = 0;
		ArrayList list = new ArrayList();	//�ڷ����� ���� ����
		while(w < 5) {
			System.out.println("�����͸� �Է��� �ֽñ� �ٶ��ϴ�.");
			String user = sc.next();
			list.add(user);
			w++;
		}
		System.out.println(list);
		
		
		/* ���� �Է»��׸� ��� ���� */
		
		int ww = 0;
		int total = 0;
		do {
			try {
				Object k = list.get(ww);	//�迭 �ڷᰡ ���� + ���� ���·� ������ �Ǿ� ���� ���� ������Ʈ �Ű�Ÿ������ ����
				int numbers = Integer.parseInt(k.toString());	//�ش� �Ű�Ÿ���� ����ȭ�Ͽ� parseint�� �������
				total += numbers;
			}catch (Exception e) {}//�迭�� �Ű�Ÿ���� ���ڰ� �ƴ� ���(���ܻ�Ȳ�߻�)
			ww++;
		}while(ww < list.size());
		
		System.out.println("�Է��� ��� �迭�� ���� ���� : "+total+"�Դϴ�.");
		
//		Object a = list.get(1);
//		System.out.println(a);
	}

}
