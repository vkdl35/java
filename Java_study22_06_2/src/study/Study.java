package study;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���.");
		String user = sc.next();
		test t = new test();
		String a = t.name(user);
		System.out.println(a);
	}
}
class test {
	String data[] = {"������","�ǿ�ȯ","�ݻ���","�赿��","�����","������","����ȣ","����"};
	public String name(String user) {
		String msg = "";
		int w = 0;
		while(w < this.data.length) {
			if(user.equals(this.data[w])) {
				msg = "�ش� ����ڰ� �ֽ��ϴ�.";
				break;
			}
			else {
				msg = "�ش� ����ڴ� ���Ե��� �ʾҽ��ϴ�.";
			}
			w++;
		}
		return msg;
	}
}