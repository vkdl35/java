import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * �ΰ��� ������ �迭�� �ֽ��ϴ�.
		 * �ش� ������ �迭�� ���� ���ó�� ���� ����ϼ���.
		 * 1�� DATA : ���ѹα�, �Ϻ�, �߱�, ��Ʈ��, �±�
		 * 2�� DATA : 40, 35, 70, 55, 32
		 * ��� DATA : ["���ѹα�(40)","�Ϻ�(35)","�߱�(70)","��Ʈ��(55)","�±�(32)"]
		 */
		
		String data [][] = {
				{"���ѹα�","�Ϻ�","�߱�","��Ʈ��","�±�"},
				{"40","35","70","55","32"}
		};

		
//		int ar = data.length;
		int ar2 = data[0].length;
		String newdata[] = new String[data[0].length];
		
//		int w = 0;
//		
//		while(w == 0) {
			int ww = 0;
			while(ww < ar2) {
				//System.out.println(data[w][ww]);
				newdata[ww] = data[0][ww] + "(" + data[1][ww] + ")";
				ww++;
			}
//			w++;
//		}
		//System.out.println(Arrays.toString(newdata));

		/*
		 * [���빮��]
		 * �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�. 
		 * �� �迭���� �ε����� ���� ��ȣ�� ���ؼ� ¦������ Ȧ�������� �迭 ��� �����ͷ� �缳���ϼ���.
		 * Adata = 5,17,19,22,33
		 * Bdata = 1,2,3,4,5
		 * Result = ["¦��","Ȧ��","¦��","¦��","¦��"]
		 */	
		
//		int data2 [][] = {
//				{5,17,19,22,33},
//				{1,2,3,4,5}
//		};
//		int ea = data2.length;
//		int ea2 = data2[0].length;
//		String newdata2[] = new String[5];
//		
//		int a = 0;
//		
//		while(a < ea) {
////			System.out.println(Arrays.toString(data2[a]));
//			int aa = 0;
//			while(aa < ea2) {
//				
//				aa++;
//			}
//			a++;
//		}
			
			
		/*	������ �ϳ��� ���� ��� -> ������ Array10
			
		int A1[][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		
		int data_ea = A1[0].length;
		int f = 0;
		int total2;
		String result;
		String result_data[] = new String[data_ea];
		
		while(f < data_ea) {
			total2 = A1[0][f] + A1[1][f];
			if(total2 % 2 == 0) {
				result = "¦���Դϴ�.";
			}
			else {				
				result = "Ȧ���Դϴ�.";
			}
			result_data[f] = result;
			f++;
		}
		System.out.println(Arrays.toString(result_data));
		
		*/


	}

}
