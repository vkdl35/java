import java.util.ArrayList;
import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		/*
		 * 응용문제 data = {"hong45","lee90","kang100","park70","kim72"}; 해당 배열 데이터 값을
		 * main2라는 메소드로 값을 던집니다. 해당 값을 던질 때 예외처리를 무조건 발생시켜야하며, 최초 값을 던질 때는 가공없이 던지게 됩니다.
		 * main2에서는 해당 배열값을 받은 후 해당 점수를 모두 합산한 결과가 나와야 합니다. 단, 숫자 변환시 문제가 발생할 경우
		 * finally로 체크 후, main2 메소드로 다시 호출하여 정상적으로 데이터가 나오도록 하세요.
		 */

		/*
		 * String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" }; try {
		 * Exception3 ex = new Exception3(); ex.main2(data); } catch (Exception e) {
		 * System.out.println(e); } finally { int w = 0; while (w < data.length) {
		 * data[w] = data[w].replaceAll("[a-zA-Z]", ""); w++; } }
		 */

		String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" };
		try {
			main2(data);
		} catch (Exception z) {
			System.out.println(z);
		} finally {
			ArrayList<String> rdata = new ArrayList<String>();	//여기서 다시 원래 try로 돌아갈 수 있는 방법은 없나?
																//아니면 보내는 data 변수명을 같게하는 방법은?
			int j = 0;
			String modify;
			while (j < data.length) {
				modify = data[j].replaceAll("[a-zA-Z]", "");
				rdata.add(modify);
				j++;
			}
			String cdata[] = new String[rdata.size()];
			int q = 0;
			do {
				cdata[q] = rdata.get(q);
				q++;
			} while (q < rdata.size());

			try {
				main2(cdata);
			} catch (Exception h) {
				if (h.getMessage() == null) {
					System.exit(0);
				}
				else {
					System.out.println(h);					
				}
			}

		}

	}

	static public void main2(String db[]) throws Exception {
		/*
		 * int w = 0; int r = 0; int d[] = new int[5]; while (w < data1.length) { d[w]
		 * += Integer.valueOf(data1[w]); w++; } System.out.println(d); Exception c = new
		 * Exception(); throw c;
		 */

		int w = 0;
		int ea = db.length;
		int values;
		int jumsu = 0;
		while (w < ea) {
			values = Integer.valueOf(db[w]);
			jumsu += values;
			w++;
		}
		System.out.println(jumsu);

		Exception e = new Exception();
		throw e;
	}

}