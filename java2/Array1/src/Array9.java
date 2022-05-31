import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 두개의 데이터 배열이 있습니다.
		 * 해당 데이터 배열을 다음 결과처럼 값을 출력하세요.
		 * 1번 DATA : 대한민국, 일본, 중국, 베트남, 태국
		 * 2번 DATA : 40, 35, 70, 55, 32
		 * 결과 DATA : ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"]
		 */
		
		String data [][] = {
				{"대한민국","일본","중국","베트남","태국"},
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
		 * [응용문제]
		 * 해당 두개의 배열 데이터가 있습니다. 
		 * 각 배열별로 인덱스가 같은 번호를 더해서 짝수인지 홀수인지를 배열 결과 데이터로 재설정하세요.
		 * Adata = 5,17,19,22,33
		 * Bdata = 1,2,3,4,5
		 * Result = ["짝수","홀수","짝수","짝수","짝수"]
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
			
			
		/*	루프를 하나만 썼을 경우 -> 나머지 Array10
			
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
				result = "짝수입니다.";
			}
			else {				
				result = "홀수입니다.";
			}
			result_data[f] = result;
			f++;
		}
		System.out.println(Arrays.toString(result_data));
		
		*/


	}

}
