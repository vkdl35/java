
public class Class1 {

	public static void main(String[] args) {	//일반 main함수

		Adata a = new Adata();	//Adata Class먼저 로드
		Bdata b = new Bdata();	//Bdata Class먼저 로드
		System.out.println(a.aa);	//Adata Class 안에 aa라는 문자 자료형 객체값을 가져옴
		System.out.println(b.aa);	//Bdata Class 안에 aa라는 문자 자료형 객체값을 가져옴

		Cdata c = new Cdata();
		/* Cdata 안에 변수 자료형을 선언함 -> 
		 * 현재 기본함수에 값만 입력한 뒤 객체값을 받아 산술식으로 계산 (인스턴스 변수) */
		c.aa = 10;
		c.bb = 30;
		c.cc = c.aa + c.bb;
		System.out.println(c.cc);

	}

}

//aa는 각각의 다른 클래스에 있기 때문에 중복되지 않습니다.
class Adata {
	String aa = "홍길동";
}
// Adata에만 속한 변수 aa, 때문에 Bdata 에 똑같은 aa가 있어도 정상 작동된다. 
// 단, class 안에 있는 변수를 다른 class로 옮기면 문제가 됨.
class Bdata {
	String aa = "이순신";
}
class Cdata {	//단독 class 안에서는 sysout 사용이 어려움. public 등의 기본 main 함수가 없기 때문
	//해당 Cdata에 있는 클래스에는 자료형에 대한 변수만 선언합니다.
	//단, 계산 수식은 함수가 없는 상황이므로 수식 또는 sysout을 사용하지 못합니다.
	int aa;	
	int bb;
	int cc;
}