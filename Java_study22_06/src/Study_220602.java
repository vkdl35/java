import java.util.Random;
import java.util.Scanner;

public class Study_220602 {
   //현재 패키지는 default package
   //class를 공유해서 사용하려면 패키지를 먼저 생성한 뒤 거기에 클래스를 생성해야 함
   public static void main(String[] args) {   //일반 main함수
      
      /* class */
      
      Adata a = new Adata();   //▶112
      //Adata클래스를 로드
      Bdata b = new Bdata();	//▶115
      System.out.println(a.aa);   //로드 클래스 안에 있는 메소드 호출
      System.out.println(b.bb);
      a = null;
      b = null;
      
      Cdata c = new Cdata();	//▶118
      //기본 함수에 값만 입력한 뒤 객체값을 받아 산술식으로 계산(인스턴스 변수)
      //클래스를 거치는 것으로 자료형을 다른 곳에 모아둘 수 있음(처리 속도가 빨라짐)
      c.aa = 10;
      c.bb = 30;
      c.cc = c.aa + c.bb;
      //System.out.println(c.cc);
      c = null;
      
      Ddata.datas();   //모든 자료형과 계산은 class에서, main함수에선 결과값만 출력
      Ddata.datas2();   
      //클래스에 static가 선언되어 있으면 따로 객체 선언을 하지 않아도 됨
      Ddata d = new Ddata();   //▶124
      //클래스에 static가 없을 경우 클래스를 불러오는 객체 선언
      d.datas3("이경민");   //클래스에 보낼 데이터 입력
      d.datas4(1,10);   //여러개를 한꺼번에 보내도 됨.
      d = null;
      
      /* 자료형 변환 */
      
      /* double -> int */
      double a1 = 135.5;
      int b1 = (int)a1;   //숫자형 변환시 변수명 앞에 해당 숫자형을 붙여주면 됨
      System.out.println(b1);   //소수점을 떼고 출력됨
      
      /* int -> double */
      int c1 = 35;
      double d1 = (double)c1;
      System.out.println(d1);
      //해당 방식으로 숫자에서 숫자 형태를 바꾸는 건 가능하나, 숫자에서 문자, 또는 문자에서 숫자형으로 바꾸는 건 불가능
      
      /* string -> int */
      String a2 = "35";   //문자형이라도 숫자여야만 변환 가능
      int z = Integer.parseInt(a2);   //문자형을 숫자형으로 바꿔주는 함수
      //Integer : int의 풀네임
      //parseInt : int형에 사용하는 산술연산 언어
      System.out.println(z);
      String b2 = "156";
      int z2 = Integer.valueOf(b2);   //valueOf : 메소드 함수로써 안에 parseInt를 포함하고 있음
      //valueOf 변환하려는 자료형에 문자가 포함되어 있어도 추가 작업을 통해 숫자와 문자 분류 가능(perseInt는 불가능)
      System.out.println(z2);
      int total = Integer.parseInt(a2) + Integer.parseInt(b2);
      System.out.println(total);
      //문자형을 숫자로 변환하여 산술
      
      /* Long 사용 */
      String a3 = "123456789";
      String b3 = "987654321";
      Long total2 = Long.parseLong(a3) + Long.parseLong(b3);
      System.out.println(total2);   //10억이 넘어가면 int 사용 불가
      
      /* class에서 값을 불러오는 법 */
      Edata ed = new Edata();   //▶147
      //Edata 클래스 객체 선언
      //객체 : Edata
      //ed : 인스턴스
      //new Edata() : 메모리에 인스턴스명을 생성하여 사용할 수 있도록 함
      int total3 = 25 * ed.user_agree;   
      //Edata 클래스 안에 있는 함수를 불러와 main에서 산술계산
      final int agree = ed.user_agree;   
      //main에서 user_agree값이 바뀌어도 final로 고정되어 있기 때문에 Edata클래스에서 설정된 값 그대로 출력
      ed.Edata_event();   //Edata 안에 있는 Edata_event메소드 불러오기
      ed = null;
      
      /* class에서 값을 불러오는 법2 */
      Fdata fd = new Fdata();	//▶157
      //static이 없을시 객체 및 인스턴스를 생성해야함
      fd.list();
      Fdata.list2();   //메모리에서 바로 로드하는 방식(static 사용시)
      fd.list3("랜덤번호는",13);
      fd = null;
      
      /* class에서 값을 불러오는 법3 */
      String a6 = "이경민";
      int b6 = 29;
      Gdata3 gd = new Gdata3(a6,b6);	//▶ 178
      //다른 class의 public을 불러오거나 넘겨줄 때, 메소드 객체 선언을 따로 안해도 됨
      //ag.java2();
      //아래 public agrees에서 java2를 호출했기 때문에 main에서 따로 부르지 않아도 되지만,
      //만약 public agrees에서 부르지 않았을 경우 ag.java2() 를 사용해서 값을 넘겨받거나 직접 넘겨줄 수 있음
      gd = null;
      
      /* random 사용법 - 잘 모르겠음*/
      System.out.println("0~10까지 숫자 하나를 선택하세요.");
      Hdata hd = new Hdata();	//▶189
      hd.rotto2();
      hd=null;

   }

}
//클래스만 단독으로 있을 경우 자료형에 대한 변수만 선언
//단독 클래스 안에서는 sysout사용이 어렵다. public등의 기본 main함수가 없기 때문에
class Adata {	//▶11
   String aa = "안녕하세요.";
}
class Bdata {	//▶13
   String bb = "반갑습니다.";
}
class Cdata {   //▶19
	//서로 다른 클래스 안에 있는 변수명은 중복 가능하다
   int aa;
   int bb;
   int cc;
}
class Ddata {	//▶31
   public static void datas() {   //가장 기본이 되는 일반 함수
      //static함수는 
      String user = "이경민";
      //System.out.println(user);
   }
   public static void datas2() {   //클래스에서 모든 작업 처리 후 main으로 보냄
      int a = 1;
      int b = 4;
      int c = a + b;
      //System.out.println(c);
   }
   public void datas3(String name) {   
      //main에서 보낸 데이터를 받음. int값은 int로, string는 string로 받아야 함
      //메소드 함수 안에 들어갈 이름은 main함수명과 중복되어선 안됨! 메소드 안에서만 쓰일 새로운 이름을 지정해야함
      String mag = name + "님 환영합니다.";   //main에서 받은 데이터를 더해서 출력
      //System.out.println(mag);
   }
   public void datas4(int a, int b) {   //여러개를 한번에 받을 수 있으나 자료형은 각각 입력해주어야 함
      int c = a*b;
      //System.out.println(c);
   }
}
class Edata {	//▶71
   int user_agree = 6;
   public static void Edata_event() {
      events();
   }
   public static void events() {
      int cp = 40;
      System.out.println(cp);
   }
}
class Fdata{	//▶84
	   public void list() {   //메모리에 별도의 할당 없이 메소드 함수만 선언
	      String a = "이경민";
	      System.out.println(a);
	   }
	   public static void list2() {
	      String a = "안녕하세요.";
	      System.out.println(a);
	   }
	   public static void list3(String c, int d) {   //main에서 넘겨받은 데이터 바로 사용시 c.equals("랜덤번호는") 로 사용가능
	      String random_mag = c;
	      int random_num = d;
	      //main에서 넘겨받은 값을 메소드 안에서 한번 더 넘겨줄 경우
	      if(random_mag.equals("랜덤번호는") && random_num == 13) {
	         System.out.println("당첨입니다.");
	      }
	      else {
	         System.out.println("다음 기회에");
	      }
	   }
	}
class Gdata3 {	//▶94
	   public Gdata3(String aa,int bb) {   //public 은 클래스에서 딱 한번만 사용 가능함
	      //public 사용시 이름은 클래스 이름과 동일하게 사용해야함(스틱 메소드, 일반 메소드는 상관없음)
	      System.out.println(aa+bb);
	      java2();
	   }
	   public void java2() {
	      System.out.println("test");
	   }
	   
	}
class Hdata {	//▶103
	   public void rotto() {
	      double a = Math.random();   //랜덤은 더블을 사용해야함 0.0~1.0까지
	      int w = 0;
	      while(w <= 10) {
	         int b = (int)(Math.random()*10)+1;   //실수인 랜덤을 정수로 바꿔줌
	         //0~1이 될테니 곱하기로 원하는 수만큼 늘려주고, 0이 나오지 않기 위해 뒤에 +1을 달아줌
	         System.out.print(b);
	         w++;
	      }
	   }
	   public void rotto2() {
	      Random r = new Random();   //random객체 생성 및 인스턴스 적용이라는데 무슨 소린지 잘 모르겠따
	      int w = 0;
	      while(w <= 6) {
	         System.out.print((r.nextInt(45)+1)+" ");   
	         //0~9까지 nextInt를 사용한다는데 이것역시 무슨 소린지 모르겠서요
	         w++;
	      }
	      r=null;
	   }
	}