package Ex;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example5_t {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * ����ڰ� ���� ���ڸ� �Է� �޽��ϴ�.
		 * ��, ����ڰ� ���ڸ� �Է��� ��� ����ó���� ����Ǿ�� �մϴ�.
		 * �� ���� �Է��� �ϰ����̸�, ����ڰ� �Է��� ���ڸ� ������������ �����մϴ�.
		 * "���ڸ� �ϳ� �Է����ֽñ� �ٶ��ϴ�. : " -> 7��
		 * ��� ��) [6,22,37,44,45,80,100] 
		 * 
		 * �߰��ɼ� - ¦���� Ȧ������ ������ �迭�� �����ϵ��� �մϴ�.
		 */
		
		/* �Ʒ� �ּ�ó���� �͵��� �߰��ɼ� ������! */
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> data = new LinkedList<>();	//¦��	//LinkedList�� ��迭 �ϳ� ����
//		LinkedList<Integer> data2 = new LinkedList<>();	//Ȧ��	/* !�߰��ɼ�! Ȧ������ ���� �迭 ���� */		
		int w = 0;
		do {
			System.out.println("���ڸ� �ϳ� �Է����ּ���.");	//7�� ��µǾ�� �ϴϱ� �ݺ��� �ȿ� �־���
			try {	//try~catch������ ���ڸ� �� ��츦 ����ó�� ����
				Integer ck = Integer.valueOf(sc.next());	//����ڰ� ���ڸ� �Է��Ѱ� �´ٸ�
//				if(ck % 2 == 0) {	/* !�߰��ɼ�! try�� �ȿ� ���ǹ��� �־�, ���� ����� �Է°��� ¦����� */				
					data.add(ck); // LinkedList �� �迭�� ����� �Է°��� �߰�����
//				}
//				else {	/* !�߰��ɼ�! Ȧ����� data2 �迭�� �־��ּ��� */		
//					data2.add(ck);
//				}
			}
			catch (Exception e) {	
				System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
			}
			w++;
		}while(w < 7);	//7���� ���ư�(w = 0���� �����߱� ����)
		Collections.sort(data);	 	//Collections�� �̿��ؼ� �������� ����
//		Collections.sort(data2);
		System.out.println(data);	
//		System.out.println(data2);	/* !�߰��ɼ�! data�迭�� ���� ����ϸ� ¦��, Ȧ�� ������ ��� ���� */		

	}

}
