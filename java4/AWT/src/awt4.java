
public class awt4 {

	public static void main(String[] args) {
		// awt4_class.java와 연계
		decorate de = new decorate();
		de.view();
		
	}

}

class decorate extends awt4_class {
	public String aws="";
	public void btn_push(int c) {
		/*사용자가 입력하는 숫자를 기준으로 구구단을 작성하세요*/
		//System.out.println(c);
		int w = 1;
		int total = 1;
		String prf = "";
		while(w < 10) {
			total = w * c;
			//System.out.printf("%d*%d=%d ",c,w,total);
			prf = prf + c + "*" + w + "=" + total + "\n";
			w++;
		}
		this.aws = prf;
	}
	public String calls() {
		return this.aws;
	}
}


