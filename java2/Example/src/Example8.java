import java.util.Arrays;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * ���� ����ڰ� ���� ���� ���α׷��� ��û�Ͽ����ϴ�.
		 * ����ڰ� �� �ټ����� ���ڸ� �Է��ϰ� �˴ϴ�.
		 * "1~46 �� ������ ���ڸ� �Է��� �ּ���."
		 * ����ڰ� �Է��� �ټ����� ���ڸ� �迭�� �����մϴ�. (mainó��)
		 * 
		 * �ܺ� Ŭ������ �̿��Ͽ� pc�� ���� ��÷��ȣ �ټ����� �����ϰ� �̾Ƴ��ϴ�.
		 * pc�� ���� �ټ����� ���ڸ� �迭�� �����մϴ�. (�ܺ� class �޼ҵ� ó��)
		 * 
		 * ������ ��� �޼ҵ带 �ϳ� �� �����Ͽ�
		 * ����ڰ� �Է��� �ټ����� �迭 �����Ϳ� pc�� ���� �迭 �����͸� 
		 * �ش� �޼ҵ�� �����Ͽ� ����ϼ���. 
		 * ��, ��� ����ϴ� �ݺ����� ������ do while������ �ۼ��ϼ���.
		 * 
		 * [���]
		 * ������ ���� ���� �ټ���
		 * pc�� ���� ���� �ټ���
		 */
		
		Scanner sc = new Scanner(System.in);
		int box[] = new int[5];
		int a = 0;
		int user;
		do {
			System.out.println("1~46�� ������ ���ڸ� �Է��� �ּ���.");
			user = sc.nextInt();		
			box[a] = user;
			a++;
		}while(a < 5);
		//System.out.println(Arrays.toString(box));
		data2 dt = new data2();
		dt.datas(box);
		

	}

}

class data2 {
	public void datas(int user1[]) {	//user1 = ����� �Է°�
										//user2 = ��
		int box2[] = new int[5];
		int b;
		int w = 0;
		do {
			b = (int)(Math.random()*5)+1;
			box2[w] = b;
			w++;
		}while(w < 5);
		
		datas2(user1,box2);
	}
	public static void datas2(int user2[], int pc[]) {	//����� 5, pc 5
		System.out.println(Arrays.toString(user2));
		System.out.println(Arrays.toString(pc));
	}
}






