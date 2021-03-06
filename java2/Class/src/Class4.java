
public class Class4 {

	public static void main(String[] args) {
		
		Member mb  = new Member();	
		//객체 : Member
		//mb : 인스턴스
		//new Member() : 메모리에 인스턴스명을 생성하여 사용할 수 있도록 함
		mb.user_age = 33;
//		System.out.println(total);
		int total = 25 * mb.user_agree;
//		System.out.println(total);
		final int agree = mb.user_agree;	
		//Member 인스턴스 필드값을 로드함 -> agree라는 필드상수값으로 전달
		mb.user_agree = 80;	//메모리에 등록된 필드명에 해당되는 값을 변경함
		//System.out.println(mb.user_agree);
		//System.out.println(agree);
		
		/* 일반 클래스 메소드 부분 
		 * 일반 클래스 메소드 사용시 별도의 객체 및 인스턴스를 만들 필요가 없음
		 * static 자체가 메모리 인스턴스를 사요한다는 뜻이기 때문*/
		
		//coupon.events(); 
		//Member.member_event();
		mb.member_event();
		
	}

}

class Member {	//클래스
	String user_name;	//변수 필드명(user_name)을 생성
	int user_age;
	int user_level;	
	int user_agree = 6;	//변수 필드명에 필드값(1)을 선언
	public static void member_event() {		
		coupon.events();	//클래스에 대한 메소드를 바로 호출 가능
		//단, events라는 메소드에 변수 필드 및 변수 필드가밧을 calss에 선언하게 되면
		//그때는 객체+인스턴스를 선언해야만 로드가 됩니다.
	}
}

class coupon {
	public static void events() {
		int cp = 30;
		System.out.println(cp);
	}
}

/*
 하나의 프로젝트 중 서로 다른 package라도 한번 사용한 Class명은 다른 곳에서 사용할 수 없습니다. 
 */
