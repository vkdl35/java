
public class Method13 {

	public static void main(String[] args) {
		//extends : inherit(상속)
		/*
		  절대 부모 class에 constructor 부분에 인수값을 적용할 수 없음
		  자식 클래스에서 로드를 못하는 상황이 발생함
		  단, 자식 클래스에서 인수값을 적용하여 constructor을 사용할 수는 있음 
		 */
		mth1 m1 = new mth1();
		mth2 m2 = new mth2(0);

	}
	
}

class mth1 {	
	public int no;
	public mth1() {	//constructor에 인수값을 넣으면 main에서 상속 class를 로드할 수 없음
		//constructor를 상속하려면 인수값으 무조건 비워야함
		this.no = 20;
		System.out.println("mth1");
	}
}
class mth2 extends mth1 {
	public mth2(int a) {
		this.no = 50;
		System.out.println(this.no);
		System.out.println("mth2");
	}
}