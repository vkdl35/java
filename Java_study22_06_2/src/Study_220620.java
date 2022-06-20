import java.util.HashMap;
import java.util.Map;

public class Study_220620 {

   public static void main(String[] args) {

      /* wrapper class */

      Integer a = new Integer(20); // new Integer : 박싱
      int b = new Integer(20); // int : 언박싱
      /* !-박싱과 박싱을 비교할 때는 equals를 사용해야만 비교가 이루어짐-! */
      if (a == b) {
         System.out.println(a + b);
      }
      Integer no1 = 10; // 언박싱 상태
      Integer no = new Integer(99); // 박싱
      // int aa = no; //언박싱(자동)
      Integer bb = no.intValue(); // intValue : 언박싱
      System.out.println(bb);

      /* Map */

      Map<String, String> m = new HashMap<>();
      m.put("hong", "홍길동");
      m.put("kang", "강감찬");
      System.out.println(m.get("hong"));
      m.put("", "박"); // 비어있는 키를 사용할 순 있으나 Map 원리에는 올바르지 않음
      m.put("park", ""); // 키는 있으나 값이 비어있을 경우는 사용됨
      if (m.get("park").equals("")) {
         m.put("park", "박");
      }
      m.remove("hong");
      System.out.println(m);
      
      Map<String, Integer> m2 = new HashMap<>(); // 문자형과 숫자형을 같이 쓸 수도 있음 (Object도 사용 가능)
      m2.put("age", 32);
      m2.put("level", 5);
      System.out.println(m2.keySet()); // 키만 출력
      System.out.println(m2.values()); // 값만 출력
      System.out.println(m2.containsKey("tel")); // 해당 키가 있는지 확인

      /* 중복되지 않는 키값 생성 + 해당 배열에 있는 인덱스 번호 */

      String data[] = { "홍길동", "강감찬", "이순신", "유관순" };
      Map<Integer, String> h = new HashMap<>();
      int w = 0;
      while (w < data.length) {

    	 // m.put("name"+w, data[w]); 			 //키값에 +w를 안해주면 맨마지막 배열값만 들어감
         // m.put(String.valueOf(w), data[w]);	 //키 값을 String로 생성시
         // m.put(w, data[w]);					 //키 값을 Integer로 생성시(보통 사용하지 않음)
         w++;
      }
      System.out.println(h);

      /* 동일한 키 값 적용 */

      Map<String, String> h2 = new HashMap<>();

      for (String names : data) {
         h2.put(names, names); // foreach로 키,값이 동일하게 적용
      }
      System.out.println(h2);

      /* 반복문 이용하여 키 생성 및 배열값을 split으로 분리 작업 */

      String alldata[] = { "names=홍길동", "aeg=25", "email=hong@naver.com" };
      Map<String, String> m3 = new HashMap<>();
      int f;
      for (f = 0; f < alldata.length; f++) {
         String key[] = alldata[f].split("=");
         m3.put(key[0], key[1]);
      }
      System.out.println(m3);

   }

}