import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
		Scanner ac = new Scanner(System.in);
		System.out.println("������ �Ǵ� ���Ǿ����� �Է����ּ���.");
		String user = ac.next();
		//int num = 3;
		datalist da = new datalist();
		da.agrees(user);
		ac.close();
		/*
		//da.array_data(num);
		
		//String pay = "�ſ�ī��";
		String pay = "������ü";
		if(pay.equals("�ſ�ī��")) {
			da.pay1();	//�ش� ���ǿ� �´� �޼ҵ带 ȣ��
		}
		else {
			da.pay2(pay);	//�޼ҵ忡 ��ü���� �¿��� ���� (��ü���� ���Ѵ�)
		}
		*/
				
		
		/*
		 * [���빮��]
		 * ��ü �ش� �ε��� class���� agrees��� �̸��� ������ �ֽ��ϴ�.
		 * main �޼ҵ忡�� ����ڰ� "������", "���Ǿ���"�� �Է��ϰ� �˴ϴ�.
		 * ���������� �Է� �Ǿ��� ��� "ȸ�������� ����˴ϴ�." ��� �޼����� ����ϰ�,
		 * ���Ǿ����� �Է½� "���Ǹ� �ϼž� ����˴ϴ�." ��� ��� �ǵ��� �ϼ���.
		 * ��, agrees Ŭ���� �ȿ� void �޼ҵ� �Ѱ� �Ǵ� �ΰ��� �����Ͽ� �ڵ带 �����ϼ���.
		 */

	}

}

class datalist {
	//static �޼ҵ带 Ȱ���ϴ� ���� : ���� package���� �ش� �޼ҵ带 ���� ����ؾ��ϴ� �κп����� static�� �̿��մϴ�.
	//static(�����޼ҵ�) : �������̵��� ����� �� ����
	//void�� ���(�����޼ҵ�) : �������̵��� ����� �� ����
	public void array_data(int a) {	//static ���� �޼ҵ�
		System.out.println(a);
		int w=1;
		while(w < 10) {
			//System.out.println(a*w);
			w++;
		}	
	}
	public void pay1() {
		//System.out.println("�ſ�ī��� ���� �����մϴ�.");
	}
	public void pay2(String pm) {
		//System.out.println(pm+"���� ���� �����մϴ�.");
	}
	public void agrees(String aa) {
		
		if(!aa.equals("������")) {	// ! : �ݴ�
			System.out.println("���Ǹ� �ϼž� ����˴ϴ�.");
		}
		else {
			System.out.println("ȸ�������� ����˴ϴ�.");
		}
		
	}
	
	
	
}

