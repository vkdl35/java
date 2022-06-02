
public class Class3 {
	//package를 사용하지 못함 (default라서)
	public static void main(String[] args) {
		//자료형(데이터형) 변환
		
		//doubel -> int로 변환
		double a = 137.5;
		int b = (int)a;
		
		//int -> double로 변환
		int c = 35;
		double d = (double)c;
		
		//숫자에서 숫자 형태를 바꾸는 건 가능하나, 숫자에서 문자, 문자에서 숫자형으로 바꾸는 건 안됨
		
		//String -> int
		String x = "35";
		String x2 = "156";
		int z = Integer.parseInt(x);	//parseInt (int형에 사용하는 산술연산 언어임)
		//int z = Integer.valueOf(x);	//valueOf 클래스 메소드(메소드함수) => parseInt 포함
		//int total = Integer.parseInt(x + x2);
		int total = Integer.parseInt(x) + Integer.parseInt(x2);	//문자형을 숫자로 변환하여 산술계산을 처리함
		//System.out.println(total);
		
		//단순하게 문자를 숫자로 바꿀 때는 parseInt
		//parseInt는 변환하려는 자료형에 문자가 포함되어 있으면 오류남
		//valueOf 함수 안에 parseInt 포함되어 있기 때문에 속도가 느림
		// = valueOf 변환하려는 자료형에 문자가 포함되어 있어도 추가 작업을 통해 숫자와 분자를 분류함
		
		//Long 사용시 Long.parseLong 사용
		String j = "923456789";
		String j2 = "9234567892";	//10억이 넘어가면 int 사용 불가
		//int total2 = Integer.parseInt(j) + Integer.parseInt(j2);
		Long total2 = Long.parseLong(j) + Long.parseLong(j2);	//Long을 쓰고 Integer.parseInt로 바꿀 수 없음
		double total3 = (double)total2;
		//System.out.println(total3);	
		
		//문자(char) -> 문자(string) : 기본 지식만 제공
		char p = 'M';	
		//char는 ""(쌍따옴표) 대신 ''(따옴표)를 사용해야함
		//char는 두자리 이상 사용시 오류
		String f = String.valueOf(p);	//String은 문자 변환이기 때문에 parse가 없음
		System.out.println(f);
		//사용할 일이 거의 없음
		
		
		
		
		

	}

}
