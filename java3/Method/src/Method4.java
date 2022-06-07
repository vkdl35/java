import java.util.Arrays;

public class Method4 {

	public static void main(String[] args) {
		//return에 값 2개 사용하기
		//split 사용
		per p = new per();
		String info = p.userinfo();
		String info2[] = info.split(",");
		System.out.println(Arrays.toString(info2));
		//System.out.println(info);
		System.out.println(info2[0]);
		
		//배열 이용
		String myinfo[] = p.userinfo2();	//받는 값도 배열로 만들어줘야함
		System.out.println(myinfo[0]+" "+myinfo[1]);
		//System.out.println(Arrays.toString(myinfo));
		
	}
	
}

class per {	
	/* split 사용 */
	public String userinfo() {
		String user_name = "홍길동";
		String user_id = "hong";
		String user_info = user_name + "," + user_id;
		return user_info;
	}
	/* 배열 이용 */
	public String[] userinfo2() {	//배열값을 넘기려면 public부터 배열로 만들어야함, 데이터값을 배열로 보내지 않아도 괜찮음
		String user_name = "홍길동";
		String user_id = "hong";
		String user_array[] = {user_name,user_id};	
		//해당 1개 이상의 값을 return으로 보낼 경우
		return user_array;
		//return new String[] {user_name,user_id};	//한번에 보내도 됨
	}
}