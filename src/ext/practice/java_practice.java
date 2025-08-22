package ext.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=5;
		arr[2]=4;
		arr[3]=6;
		arr[4]=2;
		
		System.out.println("array's 2nd index is "+arr[2]);
		int count=0;
		int[] numbers= {1,2,3,4,5};
		for(int i=numbers.length-1; i>=0;i--) {
			System.out.println(numbers[i]);
			count++;
		}
		System.out.println("count is "+ count);
		
		
		//dynamic arrays - ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		list.add(arr[1]);
		for(int num : list) {
			System.out.println("Arraylist has "+num);
		}
		
		list.add(arr[4]);
		for(int j=0;j<list.size();j++) {
			System.out.println("list printing"+list.get(j));
		}
		
		System.out.println(list.get(1));
		System.out.println(list.contains(5));
		
	    //List<Integer> arrList=	Arrays.asList(arr);
		
		
		

	}

}
