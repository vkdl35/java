
public class Datatype {

	public static void main(String[] args) {
		//String : 문자 "" 무조건 사용
		String a = "1234"; 
		System.out.println(a);
		/* 정수형 */
		byte b = 127; //byte : -128~127
		System.out.println(b);
		
		short c = 32767; //short : -32,768 ~ 32,767
		System.out.println(c);
		
		int d = 1000000; //int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long f = 999999999; //long 사용시 끝에 L 사용해야함
		//long : 9,000,... 18개  기본메모리 할당에서 추가적용시 가능범위가 늘어남
		System.out.println(f);
		/* 정수형 끝 */
		
		/* 실수형 */
		float z = 3.5f; //3.4024800000... +38 (f를 무조건 사용해야함)
		System.out.println(z);
		
		double k = 44.5178; //1.784... +308 (d를 사용 유/무 모두됨)
		System.out.println(k);
		/* 실수형 끝 */
		
		
		/*
		 String는 문자 자료형이기 때문에 무조건 ""를 써야한다.
		 숫자를 출력하고 싶으면 다른 자료형을 써야한다.
		 byte
		 short
		 int
		 long
		 이 기본으로 쓰이고, 차이점은 변수값의 크기 차이다.
		 단위가 커질수록 메모리 사용량이 늘어나기 때문에 상황에 맞는 자료형을 쓰는 게 좋으며,
		 long에서 큰 수의 변수를 줄 땐 숫자 뒤에 L을 붙여 메모리를 추가해준다.
		 
		 예)
		 long a = 9999999999999L;
		 System.out.println(a);
		 
		 
		 실수형(소수점)은 사용되는 자료형이 다르다.
		 float
		 double
		 정수형과 마찬가지로 차이점은 메모리 용량 차이다.
		 하지만 float 함수를 쓸 때는 소수점 숫자 뒤에 꼭 f를 붙여줘야한다.
		 (붙여주지 않을 경우 출력되지 않는다.)
		 doubel 역시 d를 붙여줘도 되지만,
		 이클립스 버전이 업데이트 되면서 생략이 가능해졌다.
		 
		 예)
		 float a = 1.55f;
		 System.out.println(a);
		 
		 double b = 1.54845684;
		 System.out.println(b);
		 */
	}

}
