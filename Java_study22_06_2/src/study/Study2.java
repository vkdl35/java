package study;

public class Study2 {

	public static void main(String[] args) {
		
		Study2 st = new Study2();
		st.test();	//setter
		
		int a = st.return1(5);
		System.out.println(a);

	}
	
	public void test() {
		int w = 1;
		while(w < 11) {
			System.out.println(w);
			w++;
		}
	}
	
	public int return1(int f) {
		int total = f * 7;
		return total;
	}

}
