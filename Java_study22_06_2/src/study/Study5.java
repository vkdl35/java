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
			
			System.out.println("1.입력  2.검색  3.가장 긴 단어찾기");
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
		System.out.println("영어 단어를 입력해주세요.");
		String user_e = this.sc.next();
		System.out.println("해당 영어 단어의 한국어를 입력해주세요.");
		String user_k = this.sc.next();
		this.fruit.put(user_e, user_k);
	}

	public void name2() {
		
		
	}

	public void name3() {
		if(this.fruit == null) {
			System.out.println("정보가 없습니다.");
		}else {			
			System.out.println(this.fruit);
		}
	}

}
