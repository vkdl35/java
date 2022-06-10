import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번역하고 싶은 색상을 한글로 입력하십시오.");
		String user = sc.next();
		sc.close();
		
		switch(user) {
		case "빨강" -> {
			System.out.println("red");
		}
		case "주황" -> {
			System.out.println("orange");
		}
		case "노랑" -> {
			System.out.println("yellow");
		}
		case "초록" -> {
			System.out.println("green");
		}
		default -> {
			System.out.println("해당 단어는 번역이 되지 않습니다.");
		}

		}
	}

}
