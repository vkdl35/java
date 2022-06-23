/*
 Exception : try-catch와 함께 사용 (예외처리 사항)
 - RuntimeException (Error 발생시 예외처리 체크를 안함) - null,class,Arraysize
 - OtherException (예외처리 체크 사항 모두 함)
 Exception[종류]
 Arithmetic : 0으로 나눌 때 발생
 NullPointer : null 객체를 참조할 때 
 ClassCast : 클래스형 변환
 NumberFormat : 숫자형으로 변환
 ArrayIndexOutOfBound : 배열 참조시 인덱스 번호 오류
 IOException : 입출력 문제 발생 (자주씀)
 Exception : 전체 예외처리 현황 (자주씀)
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try {	//try : 해당값을 int로 변경함 (1)
			a = Integer.valueOf(b);	//error 발생 : a1이라는 문자인데, 강제로 숫자로 변환시 a라는 문자로 인하여 오류 발생 (2)
		}
		catch (NumberFormatException z) {
			System.out.println(z);	//어떤 부분에서 문제가 발생했는지 출력 (3)
		}
		finally {	//예외처리 발생시 대체
			b = b.replaceAll("[a-z][A-Z]","");	//데이터 재처리 (4)
			//a~z까지 문자가 있으면 지우는 함수
			a = Integer.valueOf(b);	//다시 문법을 재작성해서 사용 (5)
		}	
		System.out.println(a);	//최종 결과값 출력 (6)

	}

}
