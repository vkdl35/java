
public class If2 {

	public static void main(String[] args) {
		
		String mid1="hong";
		String mid2="kim";
		String mpass="a123456";
		/* 해당 조건문은 문자로 확인하는 조건형태이며, else문 적용하는 부분*/
		
		if (mid1=="hong") {
			System.out.println("환영합니다.");
		}
		else if(mid1=="park") { //추가로 비교대상이 있을 경우
			System.out.println("환영합니다.");
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}
		
		/* 아이디 및 패스워드를 모두 검토하는 더블 조건문*/
		
		if(mid2=="kim") { //큰 if문
			
			if(mpass=="a123456") { //작은 if문
				System.out.println("로그인 하셨습니다.");
			}
			else {
				System.out.println("패스워드가 틀립니다.");
			} 
			
		}
		else {
			System.out.println("가입되지 않은 사용자 입니다.");
		}
		
		//복합조건문
		//변수가 문자형태면 조건문도 문자형태여야 함
		//공백도 문자로 포함됨
		
		

	}

}
