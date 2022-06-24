package java_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

abstract class txt {
	public abstract void name();
}

class exd extends txt {

	public String data[] = { "국어", "영어", "수학", "과학", "사회" };
	public ArrayList<String> rdata = new ArrayList<>(Arrays.asList(data));
	Scanner sc = new Scanner(System.in);
	String msg = "";
	String user1;

	@Override
	public void name() {

		
		System.out.println("과목추가[1], 과목삭제[2], 과목리스트 확인[3] 를 선택해 주세요.");
		int user = sc.nextInt();

		if (user == 1) {
			System.out.println("추가할 과목명을 입력하세요.");
			this.user1 = this.sc.next().intern();
			name2();
			//System.out.println(msg);
		} else if (user == 2) {
			System.out.println("삭제할 과목명을 입력하세요.");
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
				msg = "정상적으로 등록 되었습니다.";
				name();
				
				

			} else {
				System.out.println("이미 등록된 과목명이 있습니다.");
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
				msg = "정상적으로 삭제 되었습니다";
			} else {
				this.rdata.add(user1);

				msg = "해당 과목명이 없습니다.";
			}
			w++;
		}
	}
}
