
public class awt4 {

	public static void main(String[] args) {
		// awt4_class.java�� ����
		decorate de = new decorate();
		de.view();
		
	}

}

class decorate extends awt4_class {
	public String aws="";
	public void btn_push(int c) {
		/*����ڰ� �Է��ϴ� ���ڸ� �������� �������� �ۼ��ϼ���*/
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


