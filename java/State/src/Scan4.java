import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("�Է��� ������ �����ּ���.");
		//String memo = a.next();
		String memo = a.nextLine(); 
		//next() : �����̽��� �Է±����� ����
		//nextLin() : �����̽��� ���� ��� �Է�����
		System.out.println(memo);
		
		a.close(); //Scanner ���Ḧ �⺻���� �������־�� �մϴ�, �޸𸮰� �����ֱ� ������ �������ִ� ���� ����.
		/*
		 * ���� : park
		 * ���� : 25
		 * */
		
		String a1="park"; 	//String �Ǵ� String + ���� = %s
		int a2=25; 			//���� = %d
		/*
		 [�߿����]
		 %f : float, double
		 %t : date, time �ð�, ��¥
		 %b : boolean (true, false)
		 */
		
		//System.out.println(a1+"���� ���̴�"+a2+"�Դϴ�.");
		//printf : f��� ���� format�� ���մϴ�.
		System.out.printf("%s���� ���̴� %d�Դϴ�.",a1, a2);
		
	}

}
