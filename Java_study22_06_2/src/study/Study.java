package study;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String user = sc.next();
		test t = new test();
		String a = t.name(user);
		System.out.println(a);
	}
}
class test {
	String data[] = {"강보경","권용환","금새록","김동주","김민재","성유리","손진호","안희성"};
	public String name(String user) {
		String msg = "";
		int w = 0;
		while(w < this.data.length) {
			if(user.equals(this.data[w])) {
				msg = "해당 사용자가 있습니다.";
				break;
			}
			else {
				msg = "해당 사용자는 가입되지 않았습니다.";
			}
			w++;
		}
		return msg;
	}
}