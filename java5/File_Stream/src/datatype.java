import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		
		//intern() : equals를 사용하지 않고 ==(부등기호)로 사용가능
		String data[] = new String[] {"홍길동","이순신"};	//배열은 new 선언해도 == 사용가능
		//String h = new String(data[0]); //이건 == 사용 불가능
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동").intern();
		String d = new String("홍길동");
		String e = data[0];
		//new 사용시 햅스 영역에 단독으로 노는 데이터를 새로 추가해준다는 것 (소속이 없기 때문에 == 사용 불가, pool안에 들어간 자료형들은 == 사용 가능하다)
		Scanner sc = new Scanner(System.in);
		String f = sc.next().intern();
		//스캐너 입력시 new String와 같은 뜻이기 때문에 == 사용불가 (뒤에 intern을 붙여주면 사용가능)
		
		System.out.println(a==f);
		
		//new String : 소속이 없는 자유분방한 자료형 (문자,배열값)

	}

}
