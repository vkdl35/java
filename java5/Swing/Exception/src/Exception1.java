/*
 Exception : try-catch�� �Բ� ��� (����ó�� ����)
 - RuntimeException (Error �߻��� ����ó�� üũ�� ����) - null,class,Arraysize
 - OtherException (����ó�� üũ ���� ��� ��)
 Exception[����]
 Arithmetic : 0���� ���� �� �߻�
 NullPointer : null ��ü�� ������ �� 
 ClassCast : Ŭ������ ��ȯ
 NumberFormat : ���������� ��ȯ
 ArrayIndexOutOfBound : �迭 ������ �ε��� ��ȣ ����
 IOException : ����� ���� �߻� (���־�)
 Exception : ��ü ����ó�� ��Ȳ (���־�)
 */
public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try {	//try : �ش簪�� int�� ������ (1)
			a = Integer.valueOf(b);	//error �߻� : a1�̶�� �����ε�, ������ ���ڷ� ��ȯ�� a��� ���ڷ� ���Ͽ� ���� �߻� (2)
		}
		catch (NumberFormatException z) {
			System.out.println(z);	//� �κп��� ������ �߻��ߴ��� ��� (3)
		}
		finally {	//����ó�� �߻��� ��ü
			b = b.replaceAll("[a-z][A-Z]","");	//������ ��ó�� (4)
			//a~z���� ���ڰ� ������ ����� �Լ�
			a = Integer.valueOf(b);	//�ٽ� ������ ���ۼ��ؼ� ��� (5)
		}	
		System.out.println(a);	//���� ����� ��� (6)

	}

}
