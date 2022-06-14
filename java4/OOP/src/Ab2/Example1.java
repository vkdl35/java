package Ab2;

public class Example1 {

	public static void main(String[] args) {
		
		home h[] = {new computer(),new monitor()};
		home2 h2[] = {new phone()};	//extends로 home을 로드
		
		//phone ph = new phone();	
		//ph.broken(21);
		
		h[0].broken(50);
		h[1].broken(0);
		h2[0].broken(21);	
		//main에서 출력하려면 아래에서 return을 해야하는데 home에선 리턴을 못함
		//phone ph = new phone(); 
		//ph.broken(21); 을 사용해서 어쩌고... 이해안됨
		
		
	}

}

class computer implements home{
	@Override
	public void poweron() {
		System.out.println("컴퓨터 전원 공급중");
	}
	@Override
	public void poweroff() {
		System.out.println("컴퓨터 전원 중단");
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("컴퓨터 고장");
		}
		else if(this.bk > n && n > 0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
	}
	
}
class monitor implements home {
	@Override
	public void poweron() {
		System.out.println("모니터 전원 공급중");
	}
	@Override
	public void poweroff() {
		System.out.println("모니터 전원 중단");
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("모니터 고장");
		}
		else if(this.bk > n && n > 0) {
			this.poweron();
		}
		else {
			this.poweroff();
		}
	}
}
/* 
 * [응용문제]
 * 휴대폰에 추가 가능이 필요합니다.
 * 휴대폰 고장시 최소전원이 (20) -> 정상작동은 (40~79) 80이상 되면 고장
 * 1. 전원은 공급되지만 화면이 고장날 경우 (공급중인데 작동이 안되는 경우) - 20부터 39까지
 * 2. 전원을 공급시키지만 충전이 안될 경우 (공급이 아예 안되는 경우) - 20이하 숫자일 경우
 */
class phone implements home,home2{
	@Override
	public void poweron() {
		System.out.println("핸드폰 전원 공급중");
	}
	@Override
	public void poweroff() {
		System.out.println("핸드폰 전원 중단");
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("핸드폰 고장");
		}
		else if(this.bk > n && n > 0) {	//20~79
			if(n < 20) {	//40~79
				this.powerchk2();
			}
			else if(n >= 20 && n <= 39){	//21~39
				this.powerchk1();
			}
		}
		else {
			poweron();
		}
	}
	
	@Override
	public void powerchk1() {
		System.out.println("화면 고장");	
	}
	public void powerchk2() {
		System.out.println("전공 공급되나 충전 안됨");
	}
	
	

}