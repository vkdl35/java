
public class Exception5 {
	//���� : �� �ְ�, ��¸� ��
	public static void main(String[] args) {	//���� �ְ� �ٽ� �޾ƿͼ� ���� ���� �� ��� throws Exception ���
		
		words wd = new words();
		
		try {
			String result = wd.files("");
			System.out.println(result);
			
		} catch (Exception a) {

			//System.out.println("�� ���� ������ �Ǿ� �ùٸ� ���� ���� ���� ����");
			
			if(a.getMessage() != null) {				
				System.out.println(a);
			}
			
		}
		finally {
			try {
				String result = wd.files("ȫ�浿");
				System.out.println(result);
			}
			catch (Exception f) {
				System.exit(0);
			}
			
		}

	}

}

class words {
	//���� : ���� �ް�, ���� �� return
	public String files(String aa) throws Exception {	
		//�ش� �޼ҵ忡�� ��� ������ �־����� try-catch�� ����ϰ�����, �׳� return�� ������ ���̱� ������ ������� �ʾƵ� ��
		String msg = "";
		if(aa==null || aa.equals("")) {
			//Exception ex = new Exception();	//�̷��� ����ص� ��
			throw new Exception("���� �������");	// -> ���⿡ ���� �¿� �� ����. ��� ������ ������ Ȯ�� ����
		}
		else {
			msg = aa + "�� ȯ���մϴ�.";
		}
		return msg;
	}
}
