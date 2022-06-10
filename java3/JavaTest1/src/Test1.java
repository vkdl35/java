import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("on & off 중 하나를 입력하세요.");
		String user = sc.next();
		sc.close();

		if (user.equals("on")) {
			System.out.println("true");
		} 
		else if (user.equals("off")) {
			System.out.println("false");
		}

	}

}
