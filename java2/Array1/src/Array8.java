import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*	�����迭 - ������ ���� ����� ��ü�� ������
		int a[] = new int[2];
		a[0] = 25;
		a[1] = 31;
		*/
		
		/*	�����迭 - ������ �ȸ���� ��ü�� ������
		int b[] = {1,2,3,4};
		int [] c = {1,2,3,4};
		int [] d = new int [] {1,2,3,4};
		*/
		
		/* 2�� �迭 [][] */
		
		/*	2�� ���� �迭
		String member2[][] = new String[3][4];
		*/
		
		String member[][] = {
				{"ȫ�浿","������","������"},
				{"25","31","22"}
		};
		
		int ea = member.length;	//�迭 ������ � �ִ����� Ȯ��(�迭 �ȿ��ִ� �߰�ȣ ����)
		int data_ea = member[0].length;	//�ش� �迭���� ������ ��ü�� � �ִ��� Ȯ��(�ε����� Ȯ��)
		//System.out.println(ea);
		//System.out.println(member[0][1]);
		
		int f, ff;
		for(f=0;f<ea;f++) {	//ū �ݺ����� �迭 ������ŭ loop
			//System.out.println(Arrays.toString(member[f]));	//2�� �迭�� ���� ������ �⺻ �ε����� ����� ��
			for(ff=0;ff<data_ea;ff++) {	//���� �ݺ����� �迭�� �ִ� ������ ������ŭ loop
				//System.out.println(member[f][ff]);
			}
		}
		
		
		int [][] datas = {
				{1,3,5},
				{2,4,6}
		};
				
		int fea = datas.length;
		int dea = datas[0].length;
		
		int w,ww;
		int total = 0;
		
		for(w=0;w<fea;w++) {
			for(ww=0;ww<dea;ww++) {
				total += datas[w][ww];
				//System.out.println(datas[w][ww]);	
				//2�� �迭�� ���� �ݺ��� �ȿ� Arrays.toString�� ����� �� ����
			}
		}
		//System.out.println("�� �հ�� : "+total);	
		
		
		/*
		 * [���빮��]
		 * �ش� ������ �迭�� �ִ� ��� �� �� ¦������ ��� ���ϼ���. *���ǹ� �ʿ�
		 * 1�� ������ : 11, 42, 22, 16
		 * 2�� ������ : 7, 33, 10, 29
		 * ����� : 90
		 */
		
		int num[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		
		int num_ea = num.length;
		int data2_ea = num[0].length;
		//System.out.println(data2_ea);
		int a, aa;
		int total2=0;
		
		for(a=0;a<num_ea;a++) {
			//System.out.println(Arrays.toString(num[a]));
			for(aa=0;aa<data2_ea;aa++) {
//				System.out.println(num[a][aa]);
				if(num[a][aa] % 2 == 0) {
					total2+=num[a][aa];
				}
			}
		}
		System.out.println(total2);
		
		
		
		
		
		
		
		
		
		
	}

}
