
public class For1 {

	public static void main(String[] args) {
		//반복문 : 데이터를 일괄적으로 입력, 출력을 할 수 있도록 하는 문법
		
		//short z = 1;
		//z++;	//+1 증가 : 출력 후 +1 증가
		//z--;	//-1 감소 : 출력 후 -1 감소
		//++z;	//+1 증가 : + 증가 후 출력
		//--z;	//-1 감소 : - 감소 후 출력
		//System.out.println(z);
		
		for(int a=0; a<10; a++) {		//for(초기값; 범위값; 증가 또는 감소)
			//System.out.println(a);
		}
		
		/*
		for(int a=0; a<10; a++) { 		//마지막은 ; 안씀
			System.out.println(a);		//a++ == a+1
		}
		*/
		
		byte b;
		for(b=5;b<=10;b++) {			
			//System.out.println(b);
		}
		
		byte c;
		for(c=10;c>3;c--) {				//주의사항 c<3 0~음수까지 전부 찍혀버리는 상황이 발생함
			//System.out.println(c);
		}
				
		//응용문제 20부터 27까지 출력하세요
		
		byte d;
		for(d=20;d<28;d++) {
			//System.out.print(d+" ");
		}
		
		//응용문제 39~21까지 출력하세요
		
		byte e;
		for(e=39;e>20;e--) {
			//System.out.print(e+" ");
		}
		
		
		//1~10까지 숫자 출력
		byte aa;
		byte bb=10;
		for(aa=1;aa<=bb;aa++) {
			//System.out.print(aa+" ");
		}
		
		
		/*
		 변수 두개를 이용하여 다음 데이터를 출력하시오
		 55~4까지 출력합니다.
		*/
		
		byte a1;
		byte b1=4;
		for(a1=55;a1>=b1;a1--) {
			System.out.print(a1+" ");
		}
		
		
		
		
		
		
		
		
	}

}
