import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		//for�� + Scanner
		Scanner aa = new Scanner(System.in);	//�Է¿��� �ε�
		System.out.println("���Ͻô� ������ ���ڸ� �Է��ϼ���.");	//��������
		int bb = aa.nextInt();	//����ڰ� �Է��� ����
		
		int cc;	//�ݺ����� ����ϴ� ����
		int dd;	//�ݺ����� ������� �����
		for(cc=1;cc<=9;cc++) {	
			dd = bb * cc;	//�������
			System.out.printf("%d ", dd);	//���
		}
		
		
		aa.close();	//��ĳ�� ����

		
		
		
		
		
	}

}
