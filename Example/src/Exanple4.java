
public class Exanple4 {

	public static void main(String[] args) {
		/*
		  [응용문제4]
		  
		  다음 결과값에 맞춰서 코드가 출력 되도록 하시오.
		  해당 코드는 for문으로 작성합니다.
		  
		  45 35 25 15 10
		
		 **조건문 들어가야함
		 */
		
		//[내가 짠 코드]
		
//		int a;
//		int b=10;
//		
//		for(a=4;a>=1;a--) {
//			int c = (a*b)+5;
//			System.out.print(c+" ");
//		}
//		System.out.println(10);
		
		// [선생님이 짠 코드]
		
		int f;
		int v;
		for(f=9;f>0;f--) {
			v=5*f;
			if(f%2==1 || f==2) {	//if(f%2==1 && f!=1 || f==2)
					if(f != 1) {
						
						System.out.print(v + " ");
					}
			}
		}
		
			
		
		

	}

}
