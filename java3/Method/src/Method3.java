
public class Method3 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제1]
		 * 인수값 2개의 숫자를 적용하여 계산되도록 합니다.
		 * 최종 계산을 받아서 결과를 출력하세요.
		 * 157, 45
		 * 157*45
		 * 최종 결과값 출력 : 
		 */
		
		d1 d2 = new d1();
		int a1 = d2.dd(157, 45);
		System.out.println(a1);
		d2.dd2();
		d2.dd();
		
		/*
		 * [응용문제2]
		 * 다음 숫자 하나를 해당 메소드로 전달하게 됩니다.
		 * 해당 메소드에서는 다음과 같이 처리합니다.
		 * 숫자 3을 전달하면 3*1 ~ 3*9까지의 모든 결과값을 더하여
		 * sysout으로 출력되도록 하세요.
		 */
		
		int ak = d2.aa(3);
		System.out.println(ak);
		
		String ck = d2.mb("hong");
		System.out.println(ck);
		
	}

}

class d1 {
	public int dd(int i, int ii) {
		int z = i * ii;
		return z;
	}
	public void dd() {
		//public, public void, public static void 성질이 다 다르기 때문에 같은 이름을 사용해도 되지만,
		// 헷갈릴 수 있기 때문에 권고하지 않는다.
		//단 인수값의 유무에 따라 오류남
		System.out.println("연습입니다.");
	}
	public void dd2() {
		int z = dd(100,200);
		System.out.println(z);
	}
	public int aa(int a) {
		int w = 1;
		int total = 0;
		while(w < 10) {
			total += w*a;
			if(total > 100) {
				break;
			}
			w++;
		}
		return total;	/* return 사용시 절대 반복문 안에 적용하면 안됩니다. 또한 조건문이여도 더블로 return 사용할 수 없습니다. */
		//반복문, 조건문 안에는 return 사용 불가능, 무조건 아래에 위치해야함
	}
	public String mb(String mid) {
		String msg = "";
		String msg2 = "홍길동";
		if(mid.equals("hong")) {	
			msg = "ok";
			//return = "ok"; 도 사용 가능하나 막코드 됨
		}
		else {
			msg = "cancel";
		}
		return msg;	/* 해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return시킴 */
		//return은 한번만, 맨 아래에서 보내는게 정석
		//return msg, msg2; <- 오류남, return을 두번 쓸 수도 없음
	}
	
	
}
