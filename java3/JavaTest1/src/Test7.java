import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ� ���� ������ �ѱ۷� �Է��Ͻʽÿ�.");
		String user = sc.next();
		sc.close();
		
		switch(user) {
		case "����" -> {
			System.out.println("red");
		}
		case "��Ȳ" -> {
			System.out.println("orange");
		}
		case "���" -> {
			System.out.println("yellow");
		}
		case "�ʷ�" -> {
			System.out.println("green");
		}
		default -> {
			System.out.println("�ش� �ܾ�� ������ ���� �ʽ��ϴ�.");
		}

		}
	}

}
