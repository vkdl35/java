package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList (배열값) - add,remove,get,size
		//Map (배열키, 배열값)	- remove,get
		//Map은 배열키가 기반이기 때문에 키를 통해서 데이터를 확인합니다. (속도가 제일 빠름)
		//같은 키를 사용시 마지막에 적용된 값으로 갱신됩니다.
		//! 키값을 절대 중복시키지 않음
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(HashMap) -> 해시코드로 변환하면서 자동으로 정렬함 (중복값이 발생하지 않음)
		m.put("hong", "홍길동");
		m.put("kang", "강감찬");
		System.out.println(m.get("hong"));	
		m.put("", "박");	//비어있는 키를 사용할 순 있으나 Map 원리에는 올바르지 않음
		m.put("park", "");	//키는 있으나 값이 비어있을 경우는 사용됨
		if(m.get("park").equals("")) {
			m.put("park", "박");
		}
		//get뒤에 인덱스 번호를 넣으면 null 나옴, 배열키를 호출해야 배열값이 나옴(단, 중복되면 마지막에 넣은 값만 출력됨)
		m.remove("hong");
		System.out.println(m);
		
		//Map : 여러개의 자료형을 사용할 수 있음
		Map<String, Integer> m2 = new HashMap<>();	//문자형과 숫자형을 같이 쓸 수도 있음 (Object도 사용 가능)
		m2.put("age",32);
		m2.put("level", 5);
		System.out.println(m2.keySet());	//키만 출력
		System.out.println(m2.values());	//값만 출력
		System.out.println(m2.containsKey("tel"));	//해당 키가 있는지 확인
		
	}

}
