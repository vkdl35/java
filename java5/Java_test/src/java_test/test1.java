package java_test;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		
		/*
		 * 해당 데이터가 있는 상황 입니다. 해당 데이터 중 최고 고점자 사용자만 출력을 하시오.
		 * 
		 * 출력 예 1등 : Daniel(98) 
		 * { {"Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
		 * {"65","74","23","75","68","96","88","98","54"} }
		 * 
		 * ※ abstract는 필수로 사용하시길 바랍니다.
		 */
		
		fs f = new fs();
		f.load();
		
		
	}

}

abstract class data {
	public abstract int indexs(int[] data2);
	public abstract void load();
}
class fs extends data {
	@Override
	public int indexs(int[] data2) {
		int s = 0;
		int z = 0;
		while(s < data2.length) {
			if(data2[z] < data2[s]) {
				z = s;
			}
			s++;
		}
		return z;
	}
	@Override
	public void load() {
		String[] nm = {"Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"};
		String[] sc = {"65","74","23","75","68","96","88","98","54"};
		int ea = sc.length;
		int sc2[] = new int[ea];
		int w = 0;
		while(w < ea) {
			sc2[w] = Integer.parseInt(sc[w]);
			w++;
		}
		int ck = indexs(sc2);
		System.out.printf("1등 : %s %s점",nm[ck],sc[ck]);
		
		
	}
}
