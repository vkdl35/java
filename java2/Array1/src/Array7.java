import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		
		/*
		 * [응용문제]
		 * 해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공됩니다.
		 * 그 중 레벨 데이터 값에 3미만(미포함)의 값만 확인하여 
		 * 배열 데이터를 재가공합니다.
		 * 
		 * 홍길동, 이순신, 강감찬, 세종대왕, 유관순, 김유신
		 * 4,3,1,1,2,2
		 * ["강감찬" , "세종대왕" , "유관순" , "김유신"]
		 */
		
		
		String member[] = {"홍길동","이순신","강감찬","세종대왕","유관순","김유신"};
		int lv[] = {4,3,1,1,2,2};	//조건 기준
		String user[] = new String[4];	//int배열에 string배열을 받아올 수 없어서 새로 생성해줘야함
		
		int ea_m = member.length;
		//System.out.println(ea_lv);
		int a = 0;
		int ct = 0;
		
		while(a < ea_m) {
			//System.out.println(memver[a]);
			if(lv[a] < 3) {
				//sysout.out.println(member[a]) //member와 lv의 [a]는 공유
				user[ct] = member[a];	
				//user[a] 들어가도 괜찮지만 카운트값을 증가시켜줘야하기 때문에 새로운 변수를 생성해줘야함
				ct++;
			}
			a++;
		}
		System.out.println(Arrays.toString(user));
		//Arrays.toString() : 숫자, 문자, 소수 [] 현재 배열 변수값을 출력하는 함수
		

	}

}
