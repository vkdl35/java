
public class Method8 {

	public static void main(String[] args) {
		
		/*
		 * [���빮��]
		 * ���� ���α׷��Ӱ� �ش� DB�� ���� Ȧ������ ���� �� ������ �ް��� �մϴ�.
		 * �ش� ������ ��µ� �� �ֵ��� �ڵ带 �ۼ��ϼ���.*/
		
		odbc o = new odbc();
		//int r = o.name();
		int r = o.aaa();
		System.out.println(r);


	}

} 
/*
class odbc {
	//�ʵ� �����ϸ� �ٸ� �޼ҵ� �Լ��� ������� �� ������ ����
	private int[] odata;
	private int total;	
	//total���� �ǵ��� ���ϰ� �Ϸ��� �뵵 + �ڷ������� �޼ҵ� �Լ��� ����������� �뵵
	
	public odbc() {
		int odata2[] = {15,22,17,14,32,35,19,33};
		this.odata = odata2;
		int ea = odata.length;
		int w = 0;
		while(w < ea) {
			if(odata2[w] % 2 == 1) {
				this.total++;	//this�� ����ؾ� ���� ���� �ٲ��� ����
			}
			w++;
		}
	}
	
	public int name() {	//���ڰ��� ������ �ȵ�
		return this.total;	//this�� ����ؾ� ���� ���� �ٲ��� ����
		//�ڷ������� �޼ҵ� �Լ����� return ����
	}
}
*/

class odbc {
	private int[] odata;	//�迭���� ������� �ʵ��� ���
	private int count;	//Ȧ���� ��� +1�� �����ϱ� ���� �ʵ� ������
	public odbc() {
		int odata2[] = {15,22,17,14,32,35,19,33};
		this.odata = odata2;
	}
	public int aaa() {
		int w = 0;
		int ea = this.odata.length;
		while(w < ea) {
			if(this.odata[w]%2 == 1) {
				this.count++;	//Ȧ���̸� +1�� ����
			}
			w++;
		}
		return this.count;	//�������� return��Ŵ
	}
}