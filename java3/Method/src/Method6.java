
public class Method6 {

	public static void main(String[] args) {
		// private�� ���� ��ü ���� ����2

		insert i = new insert();
		i.userid = "hong";
		String skey = "a12345678";
		String result = i.checks(skey);
		System.out.println(result);

	}

}

class insert {
	String userid = null;
	private String key = "a1234567";	//�ش� Ŭ�������� ����Ǵ� key��

	public String checks(String bb) {
		String msg = null;
		if (key.equals("a1234567")) {	//�ش� Ű��(private)�� �ܺ� Ŭ�������� �Ѿ���� �μ����� �� 
			if (userid.equals("hong")) {	//���̵� Ȯ��
				msg = "�����͸� Ȯ�� �߿� �ֽ��ϴ�.";
			} else {
				msg = "�ش� �����Ͱ��� Ȯ������ ���մϴ�.";
			}
		} else {	//�ܺ� Ŭ�������� �ùٸ� Ű���� ���޵��� ���� ���
			msg = "error";
		}
		return msg;	//���� ����� ���� return���� ȸ��
	}
}
