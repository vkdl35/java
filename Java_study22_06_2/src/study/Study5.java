package study;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Study5 {

	public static void main(String[] args) {
		sub s = new sub();
		s.main2();
	}
}

class sub {
	static HashMap<String, String> fruit = new HashMap<String, String>();
	Scanner sc = null;

	public void main2() {
		this.sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("1.�Է�  2.�˻�  3.���� �� �ܾ�ã��");
			int user = sc.nextInt();
			if (user == 1) {
				name1();
			}
			else if(user==2) {
				name2();
			}
			else if(user==3){
				name3();
			}
		}
	}

	public void name1() {
		System.out.println("���� �ܾ �Է����ּ���.");
		String user_e = this.sc.next();
		System.out.println("�ش� ���� �ܾ��� �ѱ�� �Է����ּ���.");
		String user_k = this.sc.next();
		this.fruit.put(user_e, user_k);
	}

	public void name2() {
		
		
	}

	public void name3() {
		if(this.fruit == null) {
			System.out.println("������ �����ϴ�.");
		}else {			
			System.out.println(this.fruit);
		}
	}

}
