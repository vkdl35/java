//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Double_loop1 {

	public static void main(String[] args) {
		
//		Date today = new Date();
//		System.out.println(today);
//		
//		SimpleDateFormat date = new SimpleDateFormat("YY�� MM�� dd��");	//MM:�� / mm:��
//		SimpleDateFormat time = new SimpleDateFormat("h:m:s");	//H:24�ð� ���� / h:12�ð� ����
//		System.out.println(date.format(today));
//		System.out.println(time.format(today));
		
		//�ǹ����� ������� �ʴ� �ڵ�
		
		//format : �԰�ȭ�� ���·� ���� ǥ���� �� ����ϰ� �˴ϴ�.
		//ctrl+shift+o : ������� �ʴ� import�� ����������.
		
		/*
		int f;
		for(f=1;f<=100;f=f+2) {
			System.out.print(f+" ");
		}
		//����++ �� �⺻������ 1�� ����, �ڿ� ���� ���̸� �� ���ڸ�ŭ ����
		 */
		
		/*
		[���빮��]
		
		3���� ��ǰ
		�����ڵ�� ��ǰ�� �Է½����ּ���.�� �ݾ��� �Է��ϰ��� 
		������%�� �Է����ּ���.�� ��� ������ �Բ� �ش� ���� ���ڸ� �Է��ϸ�
		���� �ݾ��� ����Ǿ� ����մϴ�.
		
		*/
		
//		int money = 10000;
//		int coupon = 20;
//		double a = coupon * 0.01;
//		System.out.println(a);
//		double b = money * a;
//		System.out.println(b);
//		double c = money - b;
//		System.out.println(c);
		
		int f,ff;
		int total;
		
		for(f=1;f<=3;f++) {
			for(ff=1;ff<=4;ff++) {
				total=f+ff;
				System.out.print(" "+f + "+" + ff);
			}
		}
		
		
		
		
	}

}
