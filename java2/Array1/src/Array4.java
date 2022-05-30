import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		
//		String[] names = new String[3];	//값이 비어있는 상태, 범위만 잡아놓은 배열, 공간만 만들어놓은 상태
//		String m[] = {"홍길동","이순신","강감찬"};	//값이 들어가있는 배열, 배열값에 데이터가 있는 상태
//		// System.out.println(names[0]);	//null : 값이 비었다는 뜻
//		int ct = 0;
//		
//		for(String a : m) {
//			//System.out.println(ct);
//			names[ct] = a;
//			ct++;
//		}
//		System.out.println(names[0]);
		
		String[] names = new String[3];	
		String m[] = {"홍길동","이순신","강감찬"};
		int ct = 0;	//foreach에는 인덱스 번호가 없으므로 새롭게 인덱스 번호를 지정해주기 위한 변수
		
		for(String a : m) {
			if(a.equals("홍길동") || a.equals("강감찬")) { 
				//해당 (기존m)배열값 중 조건에 맞는 값만 추려서 새로운 배열값에 추가함
				names[ct] = a;
				ct++;	//인덱스 번호를 순차적으로 적용하기 위한 증가값
				//ct가 조건문 밖에 있으면 에러, 카운팅되지 않아서 names은 1번부터 빈공간이 됨		
			}
		}
		int name_ea = names.length;
		//System.out.println(names[1]); //먼소리야...ㅠ
		System.out.println(Arrays.toString(names));
		//Arrays.toString() : 인덱스 안에 있는 정보를 모두 보고 싶을 때
		
		
		
		
		
	}

}
