package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {

		Integer a[] = { 3, 6, 9, 12, 15 };
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));
		ln.add(33);
		ln.add(43);
		System.out.println(ln);
		//for(;;) //for�� ���ѷ���
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();	//��迭 ����
		String user;
		while (true) {
			System.out.println("���ڸ� �Է��ϼ���.");
			user = sc.next();
			try {	//����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ
				int number = Integer.parseInt(user);
				list.add(number);
				int ea = list.size();
				if (ea >= 5) { break; }//5������ �迭�� �ԷµǸ� ���ѷ����� ��������
			} catch (Exception e) {	//������ �߻��Ͽ��� ��� �۵��Ǵ� ��Ʈ
				System.out.println("�ش� �Է»����� �����Դϴ�. ���ڸ� �Է��ϼ���.");
			}
		}
		System.out.println(list);
		sc.close();

	}

}

