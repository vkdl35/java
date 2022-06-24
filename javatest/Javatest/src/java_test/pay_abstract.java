package java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {	//추상 클래스에는 예외처리 못함
	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 87000000;	//회사 총 잔고금액
	//protected String se = "";
	public void start(String a) {}	//오버로딩
	public abstract void start();	
	abstract void db() throws IOException;	//public 빼면 가넝
	public abstract int[] check();	//getter	(return 2개 이상)
}
