import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/* 
		  [���빮��]
		  
		  ����ڰ� �� 3���� ���ڸ� �Է��մϴ�.
		  3�� ���ڸ� ��� ���Ͽ� �� �հ� ���� ����Ͻÿ�.
		  
		  123456789 * 123456789 * 123456789
		 */
		
//		Scanner aa = new Scanner(System.in);
//		int kk=1;
//		long hh=1;
//		do {
//			System.out.println(kk+"��° ���ڸ� �Է��ϼ���.");
//			int vv=aa.nextInt();
//			hh*=vv;
//			kk++;
//		}while(kk<4);
//		System.out.println("�հ� : "+hh);
		
		Scanner sc = new Scanner(System.in);
		int w=1;
		int user;
		long total=1;		//long�� �Է½� ����������� -���� �߻���
		do {
			System.out.println(w+"��° ���ڸ� �Է��ϼ���.");
			user=sc.nextInt();
			total=total*user;
			w++;
		}while(w<=3);
		
		System.out.println("�� �հ�:"+total);
		sc.close();
		

	}

}
