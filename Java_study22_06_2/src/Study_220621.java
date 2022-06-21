
public class Study_220621 {

	public static void main(String[] args) {

		int a;
		String b = "a1";
		try { // try : 해당값을 int로 변경함 (1)
			a = Integer.valueOf(b); // error 발생 : a1이라는 문자인데, 강제로 숫자로 변환시 a라는 문자로 인하여 오류 발생 (2)
		} catch (NumberFormatException z) {
			System.out.println(z); // 어떤 부분에서 문제가 발생했는지 출력 (3)
		} finally { // 예외처리 발생시 대체
			b = b.replaceAll("[a-z][A-Z]", ""); // 데이터 재처리 (4)
			// a~z까지 문자가 있으면 지우는 함수
			a = Integer.valueOf(b); // 다시 문법을 재작성해서 사용 (5)
		}
		System.out.println(a); // 최종 결과값 출력 (6)

		try {
			// test(); //메소드 호출 자체 에러기 때문에 Exception과 관계가 없음
			Study_220621 ex = new Study_220621();
			String a1 = "홍길동2";
			ex.test(a1);
		} catch (Exception i) {
			System.out.println(i);
		}

		String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" };
		Study_220621 st = new Study_220621();

		try {
			st.main2(data); // 가공 전 배열값을 main2 메소드로 보냄
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e); // 문제가 생겼을시 출력
			}
		} finally { // 예외 처리 상황이 발생했을 때 대체 함수
			String data2[] = new String[data.length];
			int r = 0;
			int w = 0;

			try { // 보낼 데이터가 달라졌으니 try를 다시 한번 사용
				while (w < data.length) { // 반복문을 돌려서 문자를 제거해준 뒤 새로운 배열값에 담아줌
					data2[r] = data[w].replaceAll("[a-z]", "");
					r++;
					w++;
				}
				st.main2(data2); // main2 메소드로 다시 보냄
			} catch (Exception e2) {
				if (e2.getMessage() != null) {
					System.out.println(e2);
				} else {
					System.exit(0); // 이번에도 오류 발생시 작동 중지
				}
			}
		}

		try {
			Exception aaa = new Exception();
			throw aaa;
		} catch (Exception u) {
			if (u.getMessage() != null) {
				System.out.println(u);
			}
		}

		words wd = new words();

		try {
			String result = wd.files("");
			System.out.println(result);

		} catch (Exception q) {

			// System.out.println("빈 값이 문제가 되어 올바른 값을 전달 받지 못함");

			if (q.getMessage() != null) {
				System.out.println(q);
			}

		} finally {
			try {
				String result = wd.files("홍길동");
				System.out.println(result);
			} catch (Exception f) {
				System.exit(0);
			}

		}
		
		int total = 45 * 3 + 16 + 5 + 22 * 8;
		ki a5 = new ki();
		try {
			System.out.println(a5.name(total));
			
		} catch (Exception e6) {
			if(e6.getMessage() != null) {
				System.out.println(e6);
			}
		}

	}

	public void test(String b) throws Exception, NumberFormatException { // throws는 main 메소드에서 예외처리 없이 해당 메소드를 호출할 경우를
																			// 막기 위해 사용
		// throws Exception 사용시 던지는 쪽에서 무조건 try~catch문을 사용해야함
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c; // 코드 맨 밑에 사용을 하며 throw = return 비슷한 성격을 가짐
		// 예외처리 결과에 대한 값을 메인 메소드로 다시 return
	}

	public void main2(String data[]) throws Exception { // 자료형은 throw에 제약이 있더라?

		int total = 0;
		int w = 0;

		while (w < data.length) { // 반복문을 돌려서 배열값을 숫자로 바꾼 뒤 합산해줌
			total += Integer.valueOf(data[w]);
			w++;
		}
		System.out.println(total);

		Exception ex1 = new Exception();
		throw ex1; // 얘 자료형에 못씀 ㅋㅋ 웃긴다

	}

}

class words {
	// 역할 : 값을 받고, 연산 후 return
	public String files(String aa) throws Exception {
		// 해당 메소드에서 산술 연산이 있었으면 try-catch를 사용하겠지만, 그냥 return만 보내는 것이기 때문에 사용하지 않아도 됨
		String msg = "";
		if (aa == null || aa.equals("")) {
			// Exception ex = new Exception(); //이렇게 사용해도 됨
			throw new Exception("값이 비어있음"); // -> 여기에 값을 태울 수 있음. 어디서 오류가 나는지 확인 가능
		} else {
			msg = aa + "님 환영합니다.";
		}
		return msg;
	}
}
class ki {
	
	public String name(int total) throws Exception {
		
		String msg = "";
		if(total % 2 == 1) {
			msg = "홀수입니다.";
		}
		else {
			throw new Exception("예외처리 발생으로 재확인이 필요합니다.");
		}
		
		return msg;
	}
	
}