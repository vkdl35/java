package java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {	//�߻� Ŭ�������� ����ó�� ����
	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 87000000;	//ȸ�� �� �ܰ�ݾ�
	//protected String se = "";
	public void start(String a) {}	//�����ε�
	public abstract void start();	
	abstract void db() throws IOException;	//public ���� ����
	public abstract int[] check();	//getter	(return 2�� �̻�)
}
