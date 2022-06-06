import java.util.Random;
import java.util.Scanner;

public class Study_220602 {
   //���� ��Ű���� default package
   //class�� �����ؼ� ����Ϸ��� ��Ű���� ���� ������ �� �ű⿡ Ŭ������ �����ؾ� ��
   public static void main(String[] args) {   //�Ϲ� main�Լ�
      
      /* class */
      
      Adata a = new Adata();   //��112
      //AdataŬ������ �ε�
      Bdata b = new Bdata();	//��115
      System.out.println(a.aa);   //�ε� Ŭ���� �ȿ� �ִ� �޼ҵ� ȣ��
      System.out.println(b.bb);
      a = null;
      b = null;
      
      Cdata c = new Cdata();	//��118
      //�⺻ �Լ��� ���� �Է��� �� ��ü���� �޾� ��������� ���(�ν��Ͻ� ����)
      //Ŭ������ ��ġ�� ������ �ڷ����� �ٸ� ���� ��Ƶ� �� ����(ó�� �ӵ��� ������)
      c.aa = 10;
      c.bb = 30;
      c.cc = c.aa + c.bb;
      //System.out.println(c.cc);
      c = null;
      
      Ddata.datas();   //��� �ڷ����� ����� class����, main�Լ����� ������� ���
      Ddata.datas2();   
      //Ŭ������ static�� ����Ǿ� ������ ���� ��ü ������ ���� �ʾƵ� ��
      Ddata d = new Ddata();   //��124
      //Ŭ������ static�� ���� ��� Ŭ������ �ҷ����� ��ü ����
      d.datas3("�̰��");   //Ŭ������ ���� ������ �Է�
      d.datas4(1,10);   //�������� �Ѳ����� ������ ��.
      d = null;
      
      /* �ڷ��� ��ȯ */
      
      /* double -> int */
      double a1 = 135.5;
      int b1 = (int)a1;   //������ ��ȯ�� ������ �տ� �ش� �������� �ٿ��ָ� ��
      System.out.println(b1);   //�Ҽ����� ���� ��µ�
      
      /* int -> double */
      int c1 = 35;
      double d1 = (double)c1;
      System.out.println(d1);
      //�ش� ������� ���ڿ��� ���� ���¸� �ٲٴ� �� �����ϳ�, ���ڿ��� ����, �Ǵ� ���ڿ��� ���������� �ٲٴ� �� �Ұ���
      
      /* string -> int */
      String a2 = "35";   //�������̶� ���ڿ��߸� ��ȯ ����
      int z = Integer.parseInt(a2);   //�������� ���������� �ٲ��ִ� �Լ�
      //Integer : int�� Ǯ����
      //parseInt : int���� ����ϴ� ������� ���
      System.out.println(z);
      String b2 = "156";
      int z2 = Integer.valueOf(b2);   //valueOf : �޼ҵ� �Լ��ν� �ȿ� parseInt�� �����ϰ� ����
      //valueOf ��ȯ�Ϸ��� �ڷ����� ���ڰ� ���ԵǾ� �־ �߰� �۾��� ���� ���ڿ� ���� �з� ����(perseInt�� �Ұ���)
      System.out.println(z2);
      int total = Integer.parseInt(a2) + Integer.parseInt(b2);
      System.out.println(total);
      //�������� ���ڷ� ��ȯ�Ͽ� ���
      
      /* Long ��� */
      String a3 = "123456789";
      String b3 = "987654321";
      Long total2 = Long.parseLong(a3) + Long.parseLong(b3);
      System.out.println(total2);   //10���� �Ѿ�� int ��� �Ұ�
      
      /* class���� ���� �ҷ����� �� */
      Edata ed = new Edata();   //��147
      //Edata Ŭ���� ��ü ����
      //��ü : Edata
      //ed : �ν��Ͻ�
      //new Edata() : �޸𸮿� �ν��Ͻ����� �����Ͽ� ����� �� �ֵ��� ��
      int total3 = 25 * ed.user_agree;   
      //Edata Ŭ���� �ȿ� �ִ� �Լ��� �ҷ��� main���� ������
      final int agree = ed.user_agree;   
      //main���� user_agree���� �ٲ� final�� �����Ǿ� �ֱ� ������ EdataŬ�������� ������ �� �״�� ���
      ed.Edata_event();   //Edata �ȿ� �ִ� Edata_event�޼ҵ� �ҷ�����
      ed = null;
      
      /* class���� ���� �ҷ����� ��2 */
      Fdata fd = new Fdata();	//��157
      //static�� ������ ��ü �� �ν��Ͻ��� �����ؾ���
      fd.list();
      Fdata.list2();   //�޸𸮿��� �ٷ� �ε��ϴ� ���(static ����)
      fd.list3("������ȣ��",13);
      fd = null;
      
      /* class���� ���� �ҷ����� ��3 */
      String a6 = "�̰��";
      int b6 = 29;
      Gdata3 gd = new Gdata3(a6,b6);	//�� 178
      //�ٸ� class�� public�� �ҷ����ų� �Ѱ��� ��, �޼ҵ� ��ü ������ ���� ���ص� ��
      //ag.java2();
      //�Ʒ� public agrees���� java2�� ȣ���߱� ������ main���� ���� �θ��� �ʾƵ� ������,
      //���� public agrees���� �θ��� �ʾ��� ��� ag.java2() �� ����ؼ� ���� �Ѱܹްų� ���� �Ѱ��� �� ����
      gd = null;
      
      /* random ���� - �� �𸣰���*/
      System.out.println("0~10���� ���� �ϳ��� �����ϼ���.");
      Hdata hd = new Hdata();	//��189
      hd.rotto2();
      hd=null;

   }

}
//Ŭ������ �ܵ����� ���� ��� �ڷ����� ���� ������ ����
//�ܵ� Ŭ���� �ȿ����� sysout����� ��ƴ�. public���� �⺻ main�Լ��� ���� ������
class Adata {	//��11
   String aa = "�ȳ��ϼ���.";
}
class Bdata {	//��13
   String bb = "�ݰ����ϴ�.";
}
class Cdata {   //��19
	//���� �ٸ� Ŭ���� �ȿ� �ִ� �������� �ߺ� �����ϴ�
   int aa;
   int bb;
   int cc;
}
class Ddata {	//��31
   public static void datas() {   //���� �⺻�� �Ǵ� �Ϲ� �Լ�
      //static�Լ��� 
      String user = "�̰��";
      //System.out.println(user);
   }
   public static void datas2() {   //Ŭ�������� ��� �۾� ó�� �� main���� ����
      int a = 1;
      int b = 4;
      int c = a + b;
      //System.out.println(c);
   }
   public void datas3(String name) {   
      //main���� ���� �����͸� ����. int���� int��, string�� string�� �޾ƾ� ��
      //�޼ҵ� �Լ� �ȿ� �� �̸��� main�Լ���� �ߺ��Ǿ �ȵ�! �޼ҵ� �ȿ����� ���� ���ο� �̸��� �����ؾ���
      String mag = name + "�� ȯ���մϴ�.";   //main���� ���� �����͸� ���ؼ� ���
      //System.out.println(mag);
   }
   public void datas4(int a, int b) {   //�������� �ѹ��� ���� �� ������ �ڷ����� ���� �Է����־�� ��
      int c = a*b;
      //System.out.println(c);
   }
}
class Edata {	//��71
   int user_agree = 6;
   public static void Edata_event() {
      events();
   }
   public static void events() {
      int cp = 40;
      System.out.println(cp);
   }
}
class Fdata{	//��84
	   public void list() {   //�޸𸮿� ������ �Ҵ� ���� �޼ҵ� �Լ��� ����
	      String a = "�̰��";
	      System.out.println(a);
	   }
	   public static void list2() {
	      String a = "�ȳ��ϼ���.";
	      System.out.println(a);
	   }
	   public static void list3(String c, int d) {   //main���� �Ѱܹ��� ������ �ٷ� ���� c.equals("������ȣ��") �� ��밡��
	      String random_mag = c;
	      int random_num = d;
	      //main���� �Ѱܹ��� ���� �޼ҵ� �ȿ��� �ѹ� �� �Ѱ��� ���
	      if(random_mag.equals("������ȣ��") && random_num == 13) {
	         System.out.println("��÷�Դϴ�.");
	      }
	      else {
	         System.out.println("���� ��ȸ��");
	      }
	   }
	}
class Gdata3 {	//��94
	   public Gdata3(String aa,int bb) {   //public �� Ŭ�������� �� �ѹ��� ��� ������
	      //public ���� �̸��� Ŭ���� �̸��� �����ϰ� ����ؾ���(��ƽ �޼ҵ�, �Ϲ� �޼ҵ�� �������)
	      System.out.println(aa+bb);
	      java2();
	   }
	   public void java2() {
	      System.out.println("test");
	   }
	   
	}
class Hdata {	//��103
	   public void rotto() {
	      double a = Math.random();   //������ ������ ����ؾ��� 0.0~1.0����
	      int w = 0;
	      while(w <= 10) {
	         int b = (int)(Math.random()*10)+1;   //�Ǽ��� ������ ������ �ٲ���
	         //0~1�� ���״� ���ϱ�� ���ϴ� ����ŭ �÷��ְ�, 0�� ������ �ʱ� ���� �ڿ� +1�� �޾���
	         System.out.print(b);
	         w++;
	      }
	   }
	   public void rotto2() {
	      Random r = new Random();   //random��ü ���� �� �ν��Ͻ� �����̶�µ� ���� �Ҹ��� �� �𸣰ڵ�
	      int w = 0;
	      while(w <= 6) {
	         System.out.print((r.nextInt(45)+1)+" ");   
	         //0~9���� nextInt�� ����Ѵٴµ� �̰Ϳ��� ���� �Ҹ��� �𸣰ڼ���
	         w++;
	      }
	      r=null;
	   }
	}