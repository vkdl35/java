
public class Example1 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제] - 배열 + 메소드 문제
		 * 1차 배열에 다음과 같이 값이 있습니다.
		 * 배열리스트 22 33 44 55 66 77 88 99 이며
		 * 해당 전체값을 모두 더한 총합계 값을 별도의 메소드로
		 * 처리 되도록 합니다. 단, 반복문은 무조건 do~while문으로 작성합니다.
		 */
		
		int num[] = {22,33,44,55,66,77,88,99};
		Example1 ad = new Example1();
		ad.datas(num);
		ad=null;
				
	}
	
	public void datas(int a[]) {
		//void = 객체생성 + 인스턴스(메모리) 등록
		int total = 0;
		int data_ea = a.length;
		int dw = 0;
		do {
			total+=a[dw];
			dw++;
		}while(dw < data_ea);
		System.out.println(total);
	}
	

}
