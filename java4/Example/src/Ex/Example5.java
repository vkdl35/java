package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * ����ڰ� ���� ���ڸ� �Է� �޽��ϴ�.
		 * ��, ����ڰ� ���ڸ� �Է��� ��� ����ó���� ����Ǿ�� �մϴ�.
		 * �� ���� �Է��� �ϰ����̸�, ����ڰ� �Է��� ���ڸ� ������������ �����մϴ�.
		 * "���ڸ� �ϳ� �Է����ֽñ� �ٶ��ϴ�. : " -7��
		 * ��� - [6,22,37,44,45,80,100] 
		 * 
		 * �߰��ɼ� - ¦���� Ȧ������ ������ �迭�� �����ϵ��� �մϴ�.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		ArrayList<Integer> c = new ArrayList<>();

		try {
			int w = 1;
			while (w < 8) {
				System.out.println("���ڸ� �Է¤�");
				int ak = sc.nextInt();
				a.add(ak);
				if(ak % 2 == 0) {
					b.add(ak);
				}
				else {
					c.add(ak);
				}
				w++;
			}

		} catch (Exception e) {
			System.out.println("���ڸ� �Է��϶��");
		}

		Collections.sort(b);
		Collections.sort(c);
		//System.out.println(a);
		
		System.out.println(b);
		System.out.println(c);

	}

}
