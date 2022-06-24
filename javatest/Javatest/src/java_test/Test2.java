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
			System.out.println(w1.get(w)+"님에게 이체를 시작합니다. 이체하실 금액을 입력해 주세요: ");
			int um = sc.nextInt();
			total += um;
			w++;
		}

		System.out.printf("총 이체한 금액은 %d이며, 총 잔고금액은 %d 입니다.", total, this.money - total);
		sc.close();

	}

}