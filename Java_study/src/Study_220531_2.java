import java.util.Arrays;

public class Study_220531_2 {

	public static void main(String[] args) {

		//2�� �迭 [][]
		
		String member[][] = {
				{"ȫ�浿","������","������"},
				{"25","31","22"}
		};
		int ea = member.length;	
		//�迭 ������ � �ִ����� Ȯ��(�迭 �ȿ��ִ� �߰�ȣ ����)
		int data_ea = member[0].length;	
		//�ش� �迭���� ������ ��ü�� � �ִ��� Ȯ��(�ε����� Ȯ��)
		System.out.println(member[0][1]);
		//ū �߰�ȣ �ȿ� �ִ� ���� �߰�ȣ �� ù��°, �� �߿��� �ι�°�� �ִ� �� Ȯ���ϰڴ�.
		
		/*	2�� ���� �迭
		String member2[][] = new String[3][4];
		*/
		
		//2�� �迭�� ���� �ݺ���
		
		int [][] data = {
				{1,3,5},
				{2,4,6}
		};
		int fea = data.length;	//�� �迭�� ����
		int dea = data[0].length;	//�ش� �迭�� ����ִ� �������� ����
		int w, ww;
		int total = 0;	//�� �迭�� ���� �޾��� ����
		for(w=0;w<fea;w++) {	//�迭 ������ ���� �� �۰ų� ���� ��ȣ ��� �Ұ��� 
			//����ݺ��� ���� ū for���� �迭����ŭ ���ƾ� �Ѵ�.
			for(ww=0;ww<dea;ww++) {
				//���� for���� �迭�� �ִ� ������ ����ŭ ���ƾ� �Ѵ�.
				total+=data[w][ww];
				//2�� �迭�� �ݺ��� �ȿ� Arrays.toString�� ����� �� ����.
			}
		}
		System.out.println("�� �հ�� : "+total);
		
		
		/*
		 * [���빮��1]
		 * �ش� ������ �迭�� �ִ� ��� �� �� ¦������ ��� ���ϼ���. *���ǹ� �ʿ�
		 * 1�� ������ : 11, 42, 22, 16
		 * 2�� ������ : 7, 33, 10, 29
		 * ����� : 90
		 */
		
		int datas[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int aea_1 = datas.length;
		int aea_2 = datas[0].length;
		int total2 = 0;
		int a = 0;
		while(a < aea_1) {
			int aa = 0;	//�ݺ��� �ۿ� ���� �ν����� ����
			while(aa < aea_2) {
					if(datas[a][aa] % 2 == 0) {
						total2+=datas[a][aa];
					}
				aa++;
			}
			a++;
		}
		System.out.println(total2);
		
		/*
		 * [���빮��2]
		 * �ΰ��� ������ �迭�� �ֽ��ϴ�.
		 * �ش� ������ �迭�� ���� ���ó�� ���� ����ϼ���.
		 * 1�� DATA : ���ѹα�, �Ϻ�, �߱�, ��Ʈ��, �±�
		 * 2�� DATA : 40, 35, 70, 55, 32
		 * ��� DATA : ["���ѹα�(40)","�Ϻ�(35)","�߱�(70)","��Ʈ��(55)","�±�(32)"]
		 */
		
		String country[][] = {
				{"���ѹα�","�Ϻ�","�߱�","��Ʈ��","�±�"},
				{"40","35","70","55","32"}
		};
		int eac_1 = country.length;
		int eac_2 = country[0].length;
		String plus[] = new String[5];
		int b = 0;
		while(b < eac_2) {
			plus[b] = country[0][b] + "(" + country[1][b] + ")";
			b++;
		}
		System.out.println(Arrays.toString(plus));
		
		/*
		 * [���빮��3]
		 * �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�. 
		 * �� �迭���� �ε����� ���� ��ȣ�� ���ؼ� ¦������ Ȧ�������� �迭 ��� �����ͷ� �缳���ϼ���.
		 * Adata = 5,17,19,22,33
		 * Bdata = 1,2,3,4,5
		 * Result = ["¦��","Ȧ��","¦��","¦��","¦��"]
		 */	
		
		int data2[][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		String num;	//���ڸ� ������ ����
		String num_data[] = new String[5];
		int ean_2 = data2[0].length;
		int c = 0;
		int total3;	//�迭 �ΰ� �ȿ� �ִ� �����Ͱ����� ���� ���� �޴� ����
		while(c < ean_2) {	//5�� ���� ���� ������ �ݺ����� ������.
			total3 = data2[0][c]+data2[1][c];	//{6,19,22,26,38}
			if(total3 % 2 == 0) {	//���� ���� �迭�� ���� 2�� ������ �� ¦�����
				num = "¦���Դϴ�";
			}
			else {
				num = "Ȧ���Դϴ�";
			}
			num_data[c] = num;	
			//c�� int���µ� ��� string �迭�� ���� �ؽ�Ʈ�� ���� �� ����?
			c++;
		}
		System.out.println(Arrays.toString(num_data));
		
		/* ���� ���빮�� �Ǵٸ� Ǯ�� */
		
		int data3[][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		int ead_1 = data3.length;
		int ead_2 = data3[0].length;
		int e = 0;
		int box[] = new int[ead_2];	//�ټ�������
		while(e < ead_1) {
			int ee = 0;
			int t1 = 0, t2 = 0;
			while(ee < ead_2) {
				if(ee == 0) {
					t1 = data3[e][ee];
				}
				else {
					t2 = data3[e][ee];
				}
				ee++;
			}
			box[e] = t1+t2;
			e++;
		}
		System.out.println(Arrays.toString(box));
		//???? �������µ�???????

	}

}
