import java.util.Arrays;
import java.util.Scanner;

public class Study_220531 {

	public static void main(String[] args) {
		
		//�迭�̶�? ������ �������� ����
		
		int a[] = new int[4];	//���ڷ� �� 4���� �����͸� ����
		a[0]=5;					//4���� �����Ϳ� ������ ���� �־���
		a[1]=15;
		a[2]=25;
		a[3]=35;
		int ea = a.length;		//�迭�� ������ �ľ��� �� ���
		//System.out.println(ea);	//���� ����� �Ǵ��� ���� Ȯ��
		int f;
		for(f=0;f<ea;f++) {		
			//f�� ea����. ��, 0���� 4�����ϱ� �� {0,1,2,3} 4��
			//������ �۰ų� ���ٶ�� ���� �ν� ����
			System.out.println(a[f]);	//�迭 �Լ�[Ȯ���Ϸ��� ��]
		}
		
		// ���� ����
		
		//String aaa[] = {"a","b","c","d","e"};
		//String aaa[] = null;	//�������� 0
		
		//������ �迭
		
		String user[] = new String[3];
		user[0]="ȫ�浿";
		user[1]="�̼���";
		user[2]="������";		//0���� �����ؼ� ������ 0,1,2
		int k = user.length;	//�迭 ������ ����� Ȯ��
		int w = 0;
		while (w < k) {		//0�� 3���� ���� ��, 2�� �������� 3���� �����ϱ� ��� ����
			System.out.println(user[w]);
			w++;
		}
		
		/* ���� ����� ���� ������ �ʴ� �迭 */
		
		//�ٸ� ����� �迭
		
		//int[] z : �迭���� �����ϰ� �ش� �����͸� ���������� �ڵ� �����Ͽ� ���� 
		//int z[] : �迭���� �����ϸ鼭 ���� 0���� �����Ͽ� ���� ������
		int [] z = new int[] {10,20,30,33,42,11};
		int zea = z.length;		//zea�� z�� �ִ� �迭 ������ ���� �ִ�
		int ww = 0;
		do {
			System.out.print(z[ww]+" ");
			ww++;
		}while(ww<zea);
		
		//�ٸ� ����� �迭(2) _ ���� ���׷��̵�
		
		int aa[] = {10,11,22,33,55};
		int aea = aa.length;
		//System.out.println(aea);	//�׻� ������ �� ���Գ� Ȯ�� ����
		int aw = 0;
		while(aw < aea) {
			System.out.print(aa[aw]+" ");
			aw++;
		}
		
		//������ �迭�� length
		
		String id[] = {"hong", "kim", "park", "lee", "jang", "jung"};
		int idea = id.length;
		//length�� �迭���� ������ ��Ÿ���� ���̱� ������ �������̾ int�� ����.
		//int idea_2 = id[1].length();	
		//length() �Ұ�ȣ�� ������ length�� ö���� ������ �ľ��� �� ��
		//id[] �ȿ� ���� ���ڴ� �迭���� �ε��� ��ȣ
		System.out.println(idea);
		
		//for each�� - �迭������ ���̴� �ݺ���
		int data[] = {5, 10, 15, 20, 25, 30, 35};
		for(int f2 : data) {	//int f�� ���������� data���� �޾Ƽ� �����Ŵ
		/*  �迭���� �ҷ��ͼ� f�� �Ѱ��ش�. �̶�, int f�� ���� �ۿ� ������ �� ����.
			���ȣ ��ȣ ��� :(�ݷ�)�� ���
			for each���� �ε��� ��ȣ�� �ʿ� ���� ���
			for~do~while �ݺ����� �ε��� ��ȣ�� �ʿ��� �� ����Ѵ�.  */
			if(f2 % 2 == 0) {
				System.out.println(f2);
			}	
		}
		
		//for each�� ��� ����
		
		String pay[] = {"������ �Ա�","�ſ�ī��","�޴��� ����","��ǰ��","����"};
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ��� �ϴ� ����� �������ּ���.");
		String pm = sc.nextLine();
		//������� ���� �غ�
		for(String z2 : pay) {	//�迭 �����Ͱ� ���ڸ� �޴� ���� ���µ� �������̾�� ��
			if(pm.equals(z2)) {
			//����� �Է�.equals(foreach������ ���� �迭��)
				System.out.println(pm+"�� ���� ����˴ϴ�.");
			}
		}
		sc.close();
		
		//for each���� ���� ���ǹ��� ����� ���
		
		String pay2[] = {"������ �Ա�","�ſ�ī��","�޴�������","��ǰ��","����"};
		Scanner ssc = new Scanner(System.in);
		
		System.out.println("�����ϰ��� �ϴ� ���¸� �������ּ���.");
		String pam = ssc.next();
		
		for(String z2 : pay2) {	
			if(pam.equals(z2)) {	
				if(z2.equals("�޴�������")) {
					System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
				}
				else {
					System.out.println(pam+"�� ���� ����˴ϴ�.");
				}
			}
		}	
		ssc.close();
		
		//������� �迭�� ���
		
		String[] names = new String[3];	//3���� �� �� �ִ� �� ������ ����
		String m[] = {"ȫ�浿","������","�̼���"};
		//System.out.println(names[0]); 	//null ���� ����ٴ� ��
		int ct = 0;
		for(String a4 : m) {	//a��� ������ m �迭���� �����´�
			names[ct] = a4;	//������� a�� ��� �� �ֱ�
			ct++;			//�ε�����ȣ 0���� ����
		}
		System.out.println(names[0]);	//�ε��� ��ȣ�� �ִ� �迭�� ȣ��
		
		//�� ������ �迭�� ��� �ֱ�
		
		String[] names2 = new String[3];
		String m2[] = {"ȫ�浿","������","�̼���"};
		int ct2 = 0;
		for(String a2 : m2) {
			if(a2.equals("ȫ�浿")||a2.equals("�̼���")) {	//ȫ�浿 �Ǵ� �̼��Ÿ��̶�� ����
				names2[ct2] = a2;
				ct2++;
			}
		}
		int name_ea = names2.length;
		System.out.println(name_ea);
		System.out.println(Arrays.toString(names2));
		
		//��迭 ������ �����Ͱ� �ִ� �迭�� Ŀ����
		
		int a3[] = new int[3];
		int b[] = {1,2,3,4,5,6,7};
		//int ea_a3 = a3.length;
		int ea_b = b.length;
		int w3 = 0;
		int ct3 = 0;
		while(w3 < ea_b) {
			if(b[w3] % 2 == 0) {
				a3[ct3] = b[w3];
				ct3++;
			}
			w3++;
		}
		System.out.println(Arrays.toString(a3));
		
		
		/*
		 * [���빮��1]
		 * �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�.
		 * �ش� �迭�� �� ����� ���̵� ���ܾ� �̻� ����ϼ���.
		 */
		
		String id2[] = {"hong","kim","park","lee","jang","jung"};
		int member = id2.length;
		//System.out.println(member);	//�迭���� ���� Ȯ��
		int w2 = 0;
		int word;	//������ �迭���� ö�� ���� �ľ�
		while(w2 < member) {
			word = id2[w2].length();
			if(word > 3) {
				System.out.println(id2[w2]);
			}
			w2++;
		}
		
		/*
		 * [���빮��2]
		 * �迭 �����ʹ� ������ �����ϴ�.
		 * 15, 60, 11, 14, 27
		 * ���� ������ ���� ��� ���ؼ� ���� ������� ����ϼ���.
		 */
		
		int mun[] = {15,60,11,14,27};
		int m_ea = mun.length;
		System.out.println(m_ea);
		int w4 = 0;
		int total = 0;
		while(w4 < m_ea) {
			total += mun[w4];
			w4++;
		}
		System.out.println(total);
		
		/*
		 * [���빮��3]
		 * ������ ��ٱ��Ͽ� �������� ��ǰ�� ����� �ֽ��ϴ�.
		 * �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����ϼ���.
		 * �ù��� 30000�� �̻�(����)�Դϴ�.
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * ��� [48000, 67000, 118200, 49800]
		 */
		
		int money[] = {15000,48000,67000,8000,118200,49800,6000,18700};
		int box[] = new int[4];
		int ea_m = money.length;
		int w5 = 0;
		int ct4 = 0;
		while(w5 < ea_m) {
			if(money[w5] >= 30000) {
				box[ct4] = money[w5];
				ct4++;
			}
			w5++;
		}
		System.out.println(Arrays.toString(box));
		
		/*
		 * [���빮��4]
		 * �ش� ����� ���� ������ �� �� ������ �����͵� �Բ� �����˴ϴ�.
		 * �� �� ���� ������ ���� 3�̸�(������)�� ���� Ȯ���Ͽ� 
		 * �迭 �����͸� �簡���մϴ�.
		 * ȫ�浿, �̼���, ������, �������, ������, ������
		 * 4,3,1,1,2,2
		 * ["������" , "�������" , "������" , "������"]
		 */
		
		String member2[] = {"ȫ�浿","�̼���","������","�������","������","������"};
		int num[] = {4,3,1,1,2,2};
		String box2[] = new String[4];
		int ea_m2 = member2.length;
		int w6 = 0;
		int ct5 = 0;
		while(w6 < ea_m2) {
			if(num[w6] < 3) {
				box2[ct5] = member2[w6];
				ct5++;
			}
			w6++;
		}
		System.out.println(Arrays.toString(box2));
		
		/*
		 * [���빮��5]
		 * {"�ܹ���" , "����" , "ġŲ" , "Ŀ��"}
		 * "�ֹ��ϰ��� �ϴ� ������ �������ּ���."
		 * �ش� ������ �� 4���� ����� �˴ϴ�.
		 * ��, "�ֹ�����" ��� ����ڰ� �Է��ϴ� ��� �ֹ��� ���� �Ǹ�, 
		 * �ֹ� ������ ����Ͻø� �˴ϴ�.
		 */
		
		String food[] = {"�ܹ���" , "����" , "ġŲ" , "Ŀ��"};
		Scanner sdc = new Scanner(System.in);
		String user_food[] = new String[4];	
		//���� ������� ��� �� �ֵ��� ������� �������
		int ct6 = 0;	//�ε��� ���� �ö� �� �ֵ��� �����ϴ� ī���Ͱ�
		for(String fd : food) {
			System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���.");
			String user2 = sdc.next();
			//�� �׹� �����ϱ� ������ �ݺ��� �ȿ� ������ ����� �Է� �Լ��� �־�� ��
			if(user2.equals("�ֹ�����")) {
				break;	//���� �ֹ����Ḧ �Է½� �� �ڸ����� �����
			}
			else {	//�װ� �ƴ϶�� 
				for(String fd2 : food) {	
					//fd2 ������ �ٽ� food���� �Ѱ��ִ� �ݺ��� ���� ����
					if(user2.equals(fd2)) {	//���� �� ������ �ȿ� ����ڰ� �Է��� ���� �ִٸ�
						user_food[ct6] = fd2;	//������ �� ������ �װ� �־����
						//ct�� �ε��� �� 0���� ����
						ct6++;	//���������� �ε����� ����(���� ������ ��� �ε����� 0���� ���� ��)
					}
				}
			}
		}
		sdc.close();	//��ĳ�� ���� ��
		System.out.println("�ֹ��Ͻ� �޴��� ������ �����ϴ�." + Arrays.toString(user_food));
		//��� ���ǹ��� �ݺ��� �ۿ� ��� + arrays.tostring�� ����� �ȿ� ��� ��� �迭�� �����޶�
		
		/*
		 * [���빮��6]
		 * ����ڰ� ��ٱ��Ͽ� ������ �����ϰ� �˴ϴ�.
		 * ��, �ش� �ݾ׸���Ʈ�� ������� ����, ���� ��ü ���� �ݾ׸� ��µǵ��� �մϴ�.
		 * 1500, 2000, 13000, 14500, 113800, 4500
		 */		
		
		/*
		 * [���빮��7]
		 * ���� �迭���� �ֽ��ϴ�. �ش� �迭 ���� ���Ͽ� ����� ������ ����ϼ���.
		 * Adata = hong kim park jang lee song
		 * Bdata = 80 100 46 38 65 88
		 * ��� �迭�� ���� ������ 60�� �̻�(����) �� �հ��ڸ� ����մϴ�.
		 * ��� �迭 : [hong kim lee song]
		 */
		
		String Adata[] = {"hong","kim","park","jang","lee","song"};
		int Bdata[] = {80,100,46,38,65,88};
		int ea_A = Adata.length;
		String user4[] = new String[4];
		int x2 = 0;
		int ct9 = 0;
		while(x2 < ea_A) {
			if(Bdata[x2] >= 60) {
				user[ct9] = Adata[x2];
				ct9++;
			}
			x2++;
		}
		System.out.println(Arrays.toString(user4));
	}

}
