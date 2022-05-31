import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		
		//빈배열 변수에 데이터가 있는 배열로 커스텀 방법
		
		int a[] = new int[3];	//3개의 공간만 제공함
		int b[] = {1,2,3,4,5,6,7};	//7개의 객체가 있는 상황
		//System.out.println(a);
		int ea = b.length;	//b배열 안에 몇개의 데이터 객체가 있는지를 확인
		int a_ea = a.length;	//헷갈리면 변수를 받아서 확인해도 됨
		int w = 0;	//데이터 배열값은 무조건 0으로 시작하기 때문에
		int ct = 0;
		
		while(w < ea) {	//<=쓰면 안됨
			//System.out.print(b[w]);	//확인
			if(b[w]%2==0 && ct < a_ea) {	//if(b배열의 값중 짝수만 && 배열의 전체 객체 크기 만큼만)
				//짝수만 && a가 가진 공간보다 작을 때까지(a의 공간 갯수를 수정해도 오류가 안남)
				a[ct] = b[w];	//a[w]로 설정하면 짝수에 해당하지 않는 숫자가 날라갈 때, 처음 a 0에 들어갈 공간이 빈 공간이 되어버림
				ct++;	//조건이 맞을시 인덱스 번호를 +1씩 증가시킴
				//조건이 맞으면 하나씩 증가, 만약 증가하지 않으면 계속 인덱스 0의 자리에 새로운 객체를 덮어씀
			}
			w++;
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
	}

}
