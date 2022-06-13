import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("주소를 입력해주세요.");
		String user = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String user2 = sc.nextLine();
		
		System.out.printf("해당 정보를 확인해주세요.\n주소: %s , 전화번호:%s",user,user2);
		
		
		
		

	}

}
