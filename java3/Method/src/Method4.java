import java.util.Arrays;

public class Method4 {

	public static void main(String[] args) {
		//return�� �� 2�� ����ϱ�
		//split ���
		per p = new per();
		String info = p.userinfo();
		String info2[] = info.split(",");
		System.out.println(Arrays.toString(info2));
		//System.out.println(info);
		System.out.println(info2[0]);
		
		//�迭 �̿�
		String myinfo[] = p.userinfo2();	//�޴� ���� �迭�� ����������
		System.out.println(myinfo[0]+" "+myinfo[1]);
		//System.out.println(Arrays.toString(myinfo));
		
	}
	
}

class per {	
	/* split ��� */
	public String userinfo() {
		String user_name = "ȫ�浿";
		String user_id = "hong";
		String user_info = user_name + "," + user_id;
		return user_info;
	}
	/* �迭 �̿� */
	public String[] userinfo2() {	//�迭���� �ѱ���� public���� �迭�� ��������, �����Ͱ��� �迭�� ������ �ʾƵ� ������
		String user_name = "ȫ�浿";
		String user_id = "hong";
		String user_array[] = {user_name,user_id};	
		//�ش� 1�� �̻��� ���� return���� ���� ���
		return user_array;
		//return new String[] {user_name,user_id};	//�ѹ��� ������ ��
	}
}