import java.util.Arrays;

public class Study_220531_2 {

	public static void main(String[] args) {

		//2차 배열 [][]
		
		String member[][] = {
				{"홍길동","김유신","유관순"},
				{"25","31","22"}
		};
		int ea = member.length;	
		//배열 갯수가 몇개 있는지를 확인(배열 안에있는 중괄호 갯수)
		int data_ea = member[0].length;	
		//해당 배열에서 데이터 객체가 몇개 있는지 확인(인덱스로 확인)
		System.out.println(member[0][1]);
		//큰 중괄호 안에 있는 작은 중괄호 중 첫번째, 그 중에서 두번째에 있는 걸 확인하겠다.
		
		/*	2차 정적 배열
		String member2[][] = new String[3][4];
		*/
		
		//2차 배열과 더블 반복문
		
		int [][] data = {
				{1,3,5},
				{2,4,6}
		};
		int fea = data.length;	//총 배열의 개수
		int dea = data[0].length;	//해당 배열에 들어있는 데이터의 개수
		int w, ww;
		int total = 0;	//두 배열의 합을 받아줄 변수
		for(w=0;w<fea;w++) {	//배열 갯수를 받을 땐 작거나 같다 기호 사용 불가능 
			//더블반복문 사용시 큰 for문은 배열수만큼 돌아야 한다.
			for(ww=0;ww<dea;ww++) {
				//작은 for문은 배열에 있는 데이터 수만큼 돌아야 한다.
				total+=data[w][ww];
				//2차 배열은 반복문 안에 Arrays.toString을 사용할 수 없다.
			}
		}
		System.out.println("총 합계는 : "+total);
		
		
		/*
		 * [응용문제1]
		 * 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하세요. *조건문 필요
		 * 1번 데이터 : 11, 42, 22, 16
		 * 2번 데이터 : 7, 33, 10, 29
		 * 결과값 : 90
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
			int aa = 0;	//반복문 밖에 쓰면 인식하지 못함
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
		 * [응용문제2]
		 * 두개의 데이터 배열이 있습니다.
		 * 해당 데이터 배열을 다음 결과처럼 값을 출력하세요.
		 * 1번 DATA : 대한민국, 일본, 중국, 베트남, 태국
		 * 2번 DATA : 40, 35, 70, 55, 32
		 * 결과 DATA : ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"]
		 */
		
		String country[][] = {
				{"대한민국","일본","중국","베트남","태국"},
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
		 * [응용문제3]
		 * 해당 두개의 배열 데이터가 있습니다. 
		 * 각 배열별로 인덱스가 같은 번호를 더해서 짝수인지 홀수인지를 배열 결과 데이터로 재설정하세요.
		 * Adata = 5,17,19,22,33
		 * Bdata = 1,2,3,4,5
		 * Result = ["짝수","홀수","짝수","짝수","짝수"]
		 */	
		
		int data2[][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		String num;	//문자를 전달할 변수
		String num_data[] = new String[5];
		int ean_2 = data2[0].length;
		int c = 0;
		int total3;	//배열 두개 안에 있는 데이터값끼리 더한 값을 받는 변수
		while(c < ean_2) {	//5개 보다 작을 때까지 반복문을 돌린다.
			total3 = data2[0][c]+data2[1][c];	//{6,19,22,26,38}
			if(total3 % 2 == 0) {	//만약 더한 배열의 값을 2로 나눴을 때 짝수라면
				num = "짝수입니다";
			}
			else {
				num = "홀수입니다";
			}
			num_data[c] = num;	
			//c는 int였는데 어떻게 string 배열에 들어가며 텍스트를 받을 수 있지?
			c++;
		}
		System.out.println(Arrays.toString(num_data));
		
		/* 위의 응용문제 또다른 풀이 */
		
		int data3[][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		int ead_1 = data3.length;
		int ead_2 = data3[0].length;
		int e = 0;
		int box[] = new int[ead_2];	//다섯번까지
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
		//???? 오류나는데???????

	}

}
