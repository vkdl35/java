public class Exception4 {

	public static void main(String[] args) {
		try {			
			ex e = new ex();
			e.loader("ok");
			
			/* !-�������� : �ڱ� �ڽ��� �ٷ� ���ܻ�Ȳ���� ����-!
			Exception aaa = new Exception();
			throw aaa;	//throw : �ڽ��� ȣ���Ͽ� ���ܰ� �߻��ϸ� �ڽ��� ȣ���� class�� return
			*/
		}
		catch (Exception e) {
			if(e.getMessage() != null) {				
				System.out.println(e);
			}
		}
//		catch (IOException e1) {	//������ �� ���� ���¿��� ����ǥ�� ��
//			System.out.println(e1);
//		}
		
		/*
		 * ����Exception�� �ٸ� �޼ҵ�� �ѱ� ��, �޴� �޼ҵ忡 �ش� ����Exception�� �����������. 
		 * ����ó���� �޼ҵ忡�� ���� �ٽ� main���� ���Ͻ� main �޼ҵ忡�� throws �ش�Exception�� ����ؾ���
		 * catch(����Exception)�� ���� �������� ������ try �ȿ� �ش� �����̳� ������ ���� ���� */

	}

}

class ex{
	Exception ep = null;
	//IOException io = null;
	public void loader(String data) throws Exception {	//throws�� try-catch�� �ޱ� ���� class�� �ε�
		/*�߸��� �������� (�ڽ��� ������ ���� main class�� ��� �����ϴ� ��Ȳ��)*/
//		if(data=="ok") {			
//			int keycode = Integer.valueOf(data);	//������������, loader class ��ü���� ������ �߻�
//		}
//		else {
//			/* ����ó������ �޼ҵ忡�� �������� ��� �ش� �޼ҵ忡�� try�� ����ؼ� �ش� �޼ҵ� ������ Ȯ���� �� ���� */
//			//�ش� ������ �ڽ��� ���� ���׿� ���� ����ó���� �߸��� ���
//			this.ep = new Exception();
//			throw this.ep;
//			//this.io = new IOException();
//			//throw this.io;	
//			/* throw�� ������ main try-catch���� �ش� �޼ҵ� �������� ���� �������� ������
//			   (main �޼ҵ忡�� ������ ��� ����ó���� �߱� ������ ��� ������ ���� Ȯ���ϱ� �����) */
//		}
		try {
			if(data=="ok") {			
				int keycode = Integer.valueOf(data);	
			}
			else {
				System.out.println("test");
			}
		}
		catch (Exception e3) {
			System.out.println(e3.getMessage());
			//�ڽ��� ���� ������ ���� �޾Ƽ� Ȯ����
			this.ep = new Exception();	
			throw this.ep;
		}
		
	}
}