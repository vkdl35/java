import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		
		/*
		Scanner a = new Scanner(System.in);
		System.out.println("����� ���̴� ����Դϱ�?");
		byte num = a.nextByte();
		if(num < 19) {
			System.out.println("19�� �̸��� �����Ͻ� �� �����ϴ�.");
		}
		else {
			System.out.println("�����Ͻ� �� �ִ� �����Դϴ�.");
		}
		*/
		
		/*
		Scanner b = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		String mid = b.next();
		if(mid.equals("�̰��")) {
			System.out.println("����ʽÿ�.");
		}
		else {
			System.out.println("ȸ���� �ƴմϴ�.");
		}
		*/
		
		/*
		Scanner c = new Scanner(System.in);
		System.out.println("���ϴ� ���ڸ� �Է��ϼ���.");
		short num1 = c.nextShort();
		if(num1 % 2==0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		*/
		
		/*
		Scanner d = new Scanner(System.in);
		System.out.println("���⸦ ������ ���� �� ���� �Է��Ͻʽÿ�.");
		String memo = d.nextLine();
		System.out.println(memo);
		*/
		
		/*
		//%f�� float�� ���� ��� ����
		double num2 = 29.25;
		String name2 = "�̰��";
		System.out.printf("%s(��)�� %f�� �Դϴ�.",name2,num2);
		*/
		
		// 1~25 �����߿� �Է��ϼ���. (��÷�� �θ�)
		
		/*
		 [���빮��]
		 Q. 1~45���� ���� �ϳ��� �Է��ϼ���.
				 
		 error���� 
		 0�� �Է� : �����Է��� �߸� �Ǿ����ϴ�.
		 45���� ū ���ڸ� �Է� : ���ڴ� 1~45������ �Է� �����մϴ�.
				 
		 1~45���ڸ� �Է��Ͽ��� ���
		 7, 15 �ΰ��� ���� �Է½� 30�� ���� ��÷�Դϴ�. ��� ���
		 23 ���� �Է½� 50�� ���� ��÷�Դϴ�. ��� ���
		 �� �ܿ� ���ڽ� ���� ��ȸ�� �����ϼ���. ��� ��� 
		 */
		
		/*
		Scanner e = new Scanner(System.in);
		System.out.println("1~45 �����߿� �Է��ϼ���.");
		short num3 = e.nextShort();
		
		if(num3 == 0) {
			System.out.println("0�� ����Ͻ� �� �����ϴ�.");
		}
		else if(num3 > 45) {
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		}
		else {
			if(num3 == 7 || num3 == 15) {
				System.out.println("�����մϴ�! 30% ������ ��÷ �Ǽ̽��ϴ�!");
			}
			else if(num3 == 23) {
				System.out.println("�����մϴ�! 50% ������ ��÷ �Ǽ̽��ϴ�!");
			}
			else {
				System.out.println("�ƽ����� ���� ��ȸ��...");
			}
		}
		*/
		/*
		[�α��� ���α׷�]
				 
		ȸ������ ���̵�� lee, song
		�н�����
		lee : rudals
		song : yh
		�ش� ���̵� �ܿ� ������ '���Ե��� ���� ������Դϴ�." ��� ����մϴ�.
		����, �н����尡 Ʋ�� ��� "ȸ�������� �ٽ� Ȯ���ϼ���." ��� ����մϴ�.
		���̵� �� �н����尡 ��� ���� ��� "ȯ���մϴ�. �������." ��� ����ϼ���.
		*/
		
		/*
		Scanner f = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���.");
		String id2 = f.next();
		
		Scanner g = new Scanner(System.in);
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String pass2 = g.next();
		
		if(id2.equals("lee") || id2.equals("song")) {
			if(id2.equals("lee") && pass2.equals("rudals")) {
				System.out.println("ȯ���մϴ�. �������.");
			}
			else if(id2.equals("song") && pass2.equals("yh")) {
				System.out.println("ȯ���մϴ�. �������.");
			}
			else {
				System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���.");
			}
		}
		else {
			System.out.println("���Ե��� ���� ������Դϴ�.");
		}
		*/
		
		/*
		 [���빮��]

			����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�.
			ù��° ���ڰ��� �Է��ϼ���.
			�ι�° ���ڰ��� �Է��ϼ���.
			
			ù��° ���ڰ� * �ι�° ���ڰ� �� ���� ����� ����ϼ���.
			��, �ش� ������� 100 ������ ��� 
			��� �޼��� "100������ ������Դϴ�." ��� �����Ͻð�
			100 �̻��� ��� "�ش簪�� 100�̻� ����� �Դϴ�." ��� ����մϴ�.
		 */
		
		
		
		Scanner h = new Scanner(System.in);
		System.out.println("ù��° ���ڰ��� �Է��ϼ���.");
		short num1 = h.nextShort();
		
		Scanner i = new Scanner(System.in);
		System.out.println("�ι�° ���ڰ��� �Է��ϼ���.");
		short num2 = i.nextShort();
		
		// short num3 = (num1*num2);
		
		if((num1*num2) <= 100) {
			System.out.println("100������ ������Դϴ�.");
		}
		else if((num1*num2) > 100) {
			System.out.println("�ش簪�� 100�̻� ����� �Դϴ�.");
		}
			
		h.close();
		i.close();
		
		/*
		 if(����) {
		 	�ش� ������ ���� ��� ����Ǵ� �ڵ�
		 } 
		 else if(if�ܿ� �ٸ� ����){				//else if�� ������ ��� ����
		 	�ش� ������ ���� ��� ����Ǵ� �ڵ�
		 }
		 else {								
		 	if�� �ݴ� �Ǵ� ������ �ϳ��� ���� ���� ���
		 }
		 */
		
		// boolean : true, false //""��� �Ұ���, �� �� �ϳ��� ���
			
		/*
		 Scanner ��ĳ�� �̸�(������� �޶����) = new(���ο� ����) Scanner(System.in);
		 System.out.println("");
		 �ڷ����� ���� �ڿ� �ٴ� next�� �޶���
		 int aa = a.nextInt();
		 String ab = a.next();
		 */
		
		/*
		 [���빮��. ���ǹ� �ڵ带 �ۼ� �Ͻÿ�.]
		 
		  ���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�.
		  ���� �⺻ �ڻ� �ݾ��� : 100,000��
		  
		  "1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�." ��� �޼����� ���� ���� ���� �Ǿ�� �մϴ�.
		  
		  1���� �Է½� "�ش� �ݾ��� �Է��ϼ���."
		  ����ڰ� �Է��� �ݾ� + �⺻ �ڻ� �ݾ��� ���� �� �ڻ� �ݾ��� ����Ͻø� �˴ϴ�.
		  
		  2���� �Է½� "����� �ݾ��� �Է��ϼ���."
		  ����ڰ� �Է��� �ݾ� - �⺻ �ڻ� �ݾ��� ����Ͽ� �� �ڻ� �ݾ��� ����Ͻø� �˴ϴ�.
		 */
		

	}

}
