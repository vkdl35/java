import java.util.HashMap;
import java.util.Map;

public class Study_220620 {

   public static void main(String[] args) {

      /* wrapper class */

      Integer a = new Integer(20); // new Integer : �ڽ�
      int b = new Integer(20); // int : ��ڽ�
      /* !-�ڽ̰� �ڽ��� ���� ���� equals�� ����ؾ߸� �񱳰� �̷����-! */
      if (a == b) {
         System.out.println(a + b);
      }
      Integer no1 = 10; // ��ڽ� ����
      Integer no = new Integer(99); // �ڽ�
      // int aa = no; //��ڽ�(�ڵ�)
      Integer bb = no.intValue(); // intValue : ��ڽ�
      System.out.println(bb);

      /* Map */

      Map<String, String> m = new HashMap<>();
      m.put("hong", "ȫ�浿");
      m.put("kang", "������");
      System.out.println(m.get("hong"));
      m.put("", "��"); // ����ִ� Ű�� ����� �� ������ Map �������� �ùٸ��� ����
      m.put("park", ""); // Ű�� ������ ���� ������� ���� ����
      if (m.get("park").equals("")) {
         m.put("park", "��");
      }
      m.remove("hong");
      System.out.println(m);
      
      Map<String, Integer> m2 = new HashMap<>(); // �������� �������� ���� �� ���� ���� (Object�� ��� ����)
      m2.put("age", 32);
      m2.put("level", 5);
      System.out.println(m2.keySet()); // Ű�� ���
      System.out.println(m2.values()); // ���� ���
      System.out.println(m2.containsKey("tel")); // �ش� Ű�� �ִ��� Ȯ��

      /* �ߺ����� �ʴ� Ű�� ���� + �ش� �迭�� �ִ� �ε��� ��ȣ */

      String data[] = { "ȫ�浿", "������", "�̼���", "������" };
      Map<Integer, String> h = new HashMap<>();
      int w = 0;
      while (w < data.length) {

    	 // m.put("name"+w, data[w]); 			 //Ű���� +w�� �����ָ� �Ǹ����� �迭���� ��
         // m.put(String.valueOf(w), data[w]);	 //Ű ���� String�� ������
         // m.put(w, data[w]);					 //Ű ���� Integer�� ������(���� ������� ����)
         w++;
      }
      System.out.println(h);

      /* ������ Ű �� ���� */

      Map<String, String> h2 = new HashMap<>();

      for (String names : data) {
         h2.put(names, names); // foreach�� Ű,���� �����ϰ� ����
      }
      System.out.println(h2);

      /* �ݺ��� �̿��Ͽ� Ű ���� �� �迭���� split���� �и� �۾� */

      String alldata[] = { "names=ȫ�浿", "aeg=25", "email=hong@naver.com" };
      Map<String, String> m3 = new HashMap<>();
      int f;
      for (f = 0; f < alldata.length; f++) {
         String key[] = alldata[f].split("=");
         m3.put(key[0], key[1]);
      }
      System.out.println(m3);

   }

}