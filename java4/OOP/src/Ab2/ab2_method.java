

package Ab2;
import Ab.method_1;	//package Ab���� main class�� �ε���


public class ab2_method extends Ab.method_1 {	
	//�ڽ�Ŭ������ ��������� protected �޼ҵ� ���� ���� ,�����̺��� ����
	
	public static void main(String[] args) {
		Ab.method_1 at = new Ab.method_1();
		at.recall();	//public �޼ҵ� ����
		at.main(args);	//mian �޼ҵ� ����
		at.name(); 		//protected �޼ҵ����
		
	}

}

