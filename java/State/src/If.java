
public class If {

	public static void main(String[] args) {
		
		byte a=100;
		byte b=100;
		
		//조건문 (if~else)
		
		if(a > b) { //if문 
			System.out.println("a값이 더 큽니다.");
		}
		else if(a < b) { //else if문
			System.out.println("b값이 더 큽니다.");
		}
		else { //else문
			System.out.println("두 값이 같습니다.");
		} 
		
		//else란 if와 else if를 뺀 나머지
		
		
		/* else문이 없는 경우*/
		
		if(a > b) {
			System.out.println("a값이 더 큽니다.");
		}
		else if(a < b) { 
			System.out.println("b값이 더 큽니다.");
		}
		else if (a == b) {
			System.out.println("두 값이 같습니다.");
		}
		
		/* 부등호기호 : < , > , <= , >= , == */
		// <= : 크거나 같다, >= : 작거나 같다, =는 항상 뒤에
		//if와 else는 하나의 조건문에 한번밖에 못 씀
		
		
		
		
		
	}

}
