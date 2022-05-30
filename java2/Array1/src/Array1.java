
public class Array1 {

	public static void main(String[] args) {
		/* 배열이란? 나열된 데이터 형태를 말합니다. (Array)
		 * 배열기호는 다음과 같습니다. [] , {}*/
		
		int a[] = new int[4];	//a[] : 변수이지만 배열값을 받는 변수		//a라는 배열값을 가진 변수
		//new int[4] : 숫자로 된 4개의 데이터를 생성함, 범위가 데이터수보다 크면 상관없는데 데이터수보다 작으면 오류남
		a[0]=5;		//배열은 0부터 써야 인식 가능
		a[1]=15;
		a[2]=25;
		a[3]=35;
		//배열 코드의 위치가 바뀌어도 에러
		//new int[배열범위] : 해당 범위는 실제 데이터보다 무조건 커야함. 
		int ea = a.length;	//length : 배열의 갯수를 파악할 때 사용
		//System.out.println(ea);
		int f;
		for(f=0;f<ea;f++) {		//배열에선 작거나 같다는 기호가 존재해선 안됨. 에러남.
			//System.out.println(a[f]);
			//a[f] : a[0] ~ a[4] 
		}
		
		
		
		
		String user[] = new String[3];
		user[0]="홍길동";
		user[1]="이순신";
		user[2]="강감찬";
		int k = user.length;
		int w = 0;
		while(w < k) {
			//System.out.println(user[w]);
			w++;
		}

		//int[] z : 배열값을 선언하고 해당 데이터를 직접적으로 자동 구분하여 적용 
		//int z[] : 배열값을 선언하면서 직접 0부터 시작하여 값을 구분함
		int[] z = new int[] {10,20,30,33,42,11};
		int zea = z.length;
		//System.out.println(zea);
		int ww=0;
		
		do {
			//System.out.println(z[ww]);
			ww++;
		}while(ww<zea);
		
		//버전이 바뀌면서 new를 사용하지 않아도 되는 배열
		//aa[] 배열 사용시 배열 범위 + 값을 지속적으로 넣어야하는 불편함이 있음
		//버전이 변경되면서 a[] 배열값 {}로 인식시킬 수 있또록 변화됨
		int aa[] = {10,11,22,33,55};	
		int aea = aa.length;
		System.out.println(aea);
		int aw = 0;
		while(aw < aea) {
			System.out.println(aa[aw]);
			aw++;
		}
		//두번째랑 마지막 방식을 많이 쓰고, 첫번째는 책에선만 쓰이는 코드
		

		
	}

}
 