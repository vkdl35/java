package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		//add(추가), get(데이터 로드), remove(삭제), size(갯수) : ArrayList라는 유틸 메소드에서 사용
		//Arrays.asList : 로드할 배열 변수를 적용
		//중요! add는 일반적으로 무조건 맨 뒤에 데이터가 추가됩니다. 단, 인덱스 번호를 적용 후 값을 실행하면 해당 인덱스 부분에 추가됩니다.
		String member[] = {"이순신","홍길동","유관순","강감찬"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		//System.out.println(mb);
		int ea = mb.size();
		//System.out.println(ea);
		mb.add("김유신");
		//System.out.println(mb);
		mb.remove(1);
		//System.out.println(mb);
		mb.add(3,"세종대왕");
		//System.out.println(mb);
		String checks = mb.get(2);
		//System.out.println(checks);
		
		/* [응용문제] 
		 * 본 데이터 15,22,37,8,11,19,41
		 * 해당 본데이터를 커스텀하여 다음 결과처럼 출력하세요.
		 * [7,15,22,8,11,39,41]*/
		//ArrayList에는 int를 사용하지 않음(Integer) 사용함
		Integer numbers[] = {15,22,37,8,11,19,41};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numbers));
		
		int ea2 = num.size();
//		System.out.println(ea2);
		num.remove(2);
		num.remove(4);
//		System.out.println(num);
		num.add(0,7);
		num.add(5,39);
		System.out.println(num);
		
		
	}

}
