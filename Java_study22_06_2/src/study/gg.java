package study;

import java.util.*;

public class gg {
	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>(); // 해쉬맵 생성
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		String result = "";

		while (true) {
			System.out.println("1.입력 2.검색 3.가장 긴 단어 찾기");
			int n = scanner.nextInt(); // 숫자받기

			if (n == 1) { // 추가기능
				String eng = scanner.next(); // 영어
				String kor = scanner.next(); // 한글입력
				h.put(eng, kor); // 해쉬맵에 넣기
			} else if (n == 2) { // 검색기능
				Set<String> keys = h.keySet();
				Iterator<String> it = keys.iterator();// 키정렬
				String x = scanner.next();

				while (it.hasNext()) {
					String value = h.get(x);
					if (value == null) {
						System.out.println("없는 단어입니다.");
					} else {
						System.out.println(value);
						break;
					}
				}
			} else if (n == 3) { // 가장긴단어찾기
				Set<String> keys = h.keySet();
				Iterator<String> it = keys.iterator();// 키정렬

				while (it.hasNext()) {
					String key = it.next(); // key값 받기
					String value = h.get(key);
					int count = key.length(); // 길이받기
					if (max < count) {
						result = key;
					}
				}
				System.out.println(result);
				return; // 끝내기
			} else { // 다른 숫자를 입력한경우
				System.out.println("다시입력하세요");
			}
		}
	}
}