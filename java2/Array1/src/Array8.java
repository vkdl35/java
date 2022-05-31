import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*	정적배열 - 공간을 먼저 만들고 객체를 넣으면
		int a[] = new int[2];
		a[0] = 25;
		a[1] = 31;
		*/
		
		/*	동적배열 - 공간을 안만들고 객체를 넣으면
		int b[] = {1,2,3,4};
		int [] c = {1,2,3,4};
		int [] d = new int [] {1,2,3,4};
		*/
		
		/* 2차 배열 [][] */
		
		/*	2차 정적 배열
		String member2[][] = new String[3][4];
		*/
		
		String member[][] = {
				{"홍길동","김유신","유관순"},
				{"25","31","22"}
		};
		
		int ea = member.length;	//배열 갯수가 몇개 있는지를 확인(배열 안에있는 중괄호 갯수)
		int data_ea = member[0].length;	//해당 배열에서 데이터 객체가 몇개 있는지 확인(인덱스로 확인)
		//System.out.println(ea);
		//System.out.println(member[0][1]);
		
		int f, ff;
		for(f=0;f<ea;f++) {	//큰 반복문은 배열 갯수만큼 loop
			//System.out.println(Arrays.toString(member[f]));	//2차 배열일 때는 무조건 기본 인덱스를 써줘야 함
			for(ff=0;ff<data_ea;ff++) {	//작은 반복문은 배열에 있는 데이터 갯수만큼 loop
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
				//2차 배열은 작은 반복문 안에 Arrays.toString를 사용할 수 없음
			}
		}
		//System.out.println("총 합계는 : "+total);	
		
		
		/*
		 * [응용문제]
		 * 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하세요. *조건문 필요
		 * 1번 데이터 : 11, 42, 22, 16
		 * 2번 데이터 : 7, 33, 10, 29
		 * 결과값 : 90
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
