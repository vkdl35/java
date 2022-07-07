package study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Study6 {
	
	public static void main(String[] args) {
		
		Study6 s6 = new Study6();
		System.out.println(s6.name());
		System.out.println(s6.name2());
		
	}
	
	public ArrayList<Integer> name() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		int w = 1;
		while(w < 11) {
			ar.add((int)(Math.random()*10)+1);
			for (int f : ar) {
				if(!ar2.contains(f)) {
					ar2.add(f);
				}
			}
			w++;
		}
		
		return ar2;
	}
	
	public ArrayList<Integer> name2() {
		Set<Integer> set = new LinkedHashSet<>();
		while(set.size() < 10) {
			int d = (int)(Math.random()*10)+1;
			set.add(d);
		}
		ArrayList<Integer> ar = new ArrayList<>(set);
		return ar;
	}

}
