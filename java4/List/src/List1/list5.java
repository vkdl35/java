package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
	
		/*
		 * [���빮��]
		 * ����ڰ� ���ڱݾ��� �Է��մϴ�.
		 * �ش� ���� �ݾ� Ƚ���� �� 8���Դϴ�.
		 * 0~n���� �Է°����ϸ�, 
		 * �ش� �Է��� ��� ������ ���� �հ� �ݾ��� ����ϼ���.*/
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> bank = new LinkedList<>();
		int total = 0;
		while(true) {
			System.out.println("�Ա��� �ݾ��� ��������.");
			String money = sc.next();
			try {
				int addm = Integer.parseInt(money);
				bank.add(addm);
				total += addm;
				int ea = bank.size();
				if (ea >= 8) {
					break;
				}
			}catch (Exception e) {
				System.out.println("�ݾ��� ���ڷθ� �Է��ϼ���.");
			}
			
		}
		System.out.printf("�� �ݾ��� %d���Դϴ�.",total);
		sc.close();
		
		
		
		
		
	}

}
