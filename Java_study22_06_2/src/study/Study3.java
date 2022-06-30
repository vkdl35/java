package study;

import java.util.Scanner;

public class Study3 {

	public static void main(String[] args) {
		
		test1 ts = new test1();
		ts.result();

	}

}
class test1 {
	Scanner sc = new Scanner(System.in);
	public int userinput() {
		int w = 0;
		int total = 0;
		while(w < 8) {
			System.out.println("숫자를 입력해주세요.");
			int user = sc.nextInt();
			total += user;
			w++;
		}
		return total;
	}
	public void result() {
		System.out.println(userinput());
	}
	
}