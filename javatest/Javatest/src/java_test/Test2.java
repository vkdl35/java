package java_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		dfe d = new dfe();
		d.name();

	}

}

class dfe implements test2_interface {
	ArrayList<String> w1 = new ArrayList<>(Arrays.asList(this.worker));
	Scanner sc = new Scanner(System.in);

	public void name() {
		int w = 0;
		int total = 0;
		while (w < w1.size()) {
			System.out.println(w1.get(w)+"�Կ��� ��ü�� �����մϴ�. ��ü�Ͻ� �ݾ��� �Է��� �ּ���: ");
			int um = sc.nextInt();
			total += um;
			w++;
		}

		System.out.printf("�� ��ü�� �ݾ��� %d�̸�, �� �ܰ�ݾ��� %d �Դϴ�.", total, this.money - total);
		sc.close();

	}

}