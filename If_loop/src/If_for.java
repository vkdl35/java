
public class If_for {

	public static void main(String[] args) {
		
//		final int a = 1;		
		//final ���� ���� > ����� ����
		/* ��� : ���� ������ �ʴ� ���� ���մϴ�. */
//		final String name = "ȫ�浿";
//		System.out.println(name);
//		System.out.println(a);
		
		

		//[�߸��� ����]
/*
		final int ct = 3;
		int f;
		for(f=1;f<10;f++) {
			if(f==ct) {
				System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
			}
			else {
				System.out.println("���� Ȯ������ ���մϴ�.");
			}
		}
*/		
		
		//[�߸��� ����]

/*
		final int ct = 5;
		int f;
		boolean ok = false;
		for(f=1;f<10;f++) {
			if(f==ct) {
				System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
				ok = true;
			}
			else {
				ok = false;
			}
		}
		if(ok==false) {
			System.out.println("Ȯ�ε��� �ʴ� �����Դϴ�.");
		}
*/
		
		
		final int ct = 5;	//������
		int f;	//�ݺ���
		boolean ok = false;	//���ǿ� ���� true, false;
		for(f=1;f<10;f++) {
			if(f==ct) {	//�ݺ��� ���� �������� ���� ���
				System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
				ok = true;	//���ǿ� ���� ���� �����մϴ�.
			}
		}
		if(ok==false) {	//���࿡ �ݺ����� �����µ��� �ݺ��� �ȿ� ���� ������ ���� ��� ��µǴ� �ڵ��Դϴ�.
			System.out.println("Ȯ�ε��� �ʴ� �����Դϴ�.");
		}
		
		
		/* �� �������� ���� �ݺ��մϴ�. �� �� Ȧ������ ����ϵ��� �մϴ�. */
		
//		int ff;
//		for(ff=1;ff<=20;ff++) {
//			if(ff%2 != 0) {	//!= : ~�� �ƴϸ�
//				System.out.print(ff+" ");
//			}
//		}
		
		
		int ff;
		String odd=" "; 	//odd :Ȧ��   ,   even : ¦��
		for(ff=1;ff<=20;ff++) {
			if(ff%2 != 1) {	//!= : ~�� �ƴϸ�
				System.out.print(ff+" ");
			}
			else {	//���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰ� �˴ϴ�.
				//odd = ff + " " + odd;
				odd += ff + " ";	//�߰��� ��� " " ������� Ȱ���Ͽ� ������.
			}
		}
		System.out.println(odd);
		
		
		
		
		
		

	}

}
