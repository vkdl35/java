package java_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

abstract class txt {
	public abstract void name();
}

class exd extends txt {

	public String data[] = { "����", "����", "����", "����", "��ȸ" };
	public ArrayList<String> rdata = new ArrayList<>(Arrays.asList(data));
	Scanner sc = new Scanner(System.in);
	String msg = "";
	String user1;

	@Override
	public void name() {

		
		System.out.println("�����߰�[1], �������[2], ���񸮽�Ʈ Ȯ��[3] �� ������ �ּ���.");
		int user = sc.nextInt();

		if (user == 1) {
			System.out.println("�߰��� ������� �Է��ϼ���.");
			this.user1 = this.sc.next().intern();
			name2();
			//System.out.println(msg);
		} else if (user == 2) {
			System.out.println("������ ������� �Է��ϼ���.");
			this.user1 = this.sc.next();
			name3();
			
			System.out.println(msg);

		} else if (user == 3) {
			System.out.println(rdata);
		}

	}

	public void name2() {

		int w = 0;
		while (w < rdata.size()) {
			if (user1!=this.rdata.get(w)) {
				this.rdata.add(user1);
				System.out.println(this.rdata);
				msg = "���������� ��� �Ǿ����ϴ�.";
				name();
				
				

			} else {
				System.out.println("�̹� ��ϵ� ������� �ֽ��ϴ�.");
				name();
			}
			w++;
		}

	}

	public void name3() {
		int w = 0;
		while (w < rdata.size()) {
			if (user1.equals(this.rdata.get(w))) {
				this.rdata.remove(user1);
				msg = "���������� ���� �Ǿ����ϴ�";
			} else {
				this.rdata.add(user1);

				msg = "�ش� ������� �����ϴ�.";
			}
			w++;
		}
	}
}
