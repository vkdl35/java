package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Study6 {

	public static void main(String[] args) {

	      Integer[] numberList = {1,2,6,7,10,11,15,22,42,43,50,51};
	      
	      
	      calculation ca = new calculation(numberList,true);
	      calculation ca2 = new calculation(numberList,false);
	      ca.run();
	      ca2.run();
	   }   
	}

	class calculation implements Runnable{
	   
	   List<Integer>numberList = new ArrayList<>();
	   List<Integer>collector = new ArrayList<>();
	   boolean isEven;
	   
	   public calculation(Integer[] number,boolean isEven) {
	      
	      this.isEven = isEven;
	      this.numberList.addAll(Arrays.asList(number));
	   }
	   
	   @Override
	   public void run() {
	      
	      for(int i = 0; i < numberList.size(); i++) {
	         if(isEven && this.numberList.get(i)%2 == 0 ) {
	            this.collector.add(this.numberList.get(i));
	         }
	         
	         if(!isEven && this.numberList.get(i)%2 != 0) {
	            this.collector.add(this.numberList.get(i));
	         }
	      }
	      System.out.println(this.collector);
	   }
	}



