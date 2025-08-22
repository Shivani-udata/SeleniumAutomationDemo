package ext.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.stream.StreamFilter;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class pritingArrayListUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // streamFilter();
		//streamMap();
		streamCollect();
	}
	
	@Test
	public static void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println("C is "+c);
		
		
		//another method to do this 
		
		long d= Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->{s.startsWith("A"); return true;}).count();
		System.out.println("D is "+d);
		
		
		//printing all the names of arraylist with length greater than 4
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println("S by for each method "+s));
		
		System.out.println("S by sysout "+names.stream().filter(s->s.length()>4));
		
		//limiting to print 1st result 
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	
	@Test
	public static void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("man");
		names.add("women");
		names.add("don");
		
		
		//print names which have last letter as 'a' with uppercase
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println();
		
		//print names which have first letter as a with uppercase and sorted 
		List<String> names1= Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println();
		
		//merging 2 different list 
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		
		newStream.sorted().forEach(s->System.out.println(s));
		
		System.out.println();
		
		boolean flag= newStream.anyMatch(s->s.equals("Adam"));
		Assert.assertTrue(flag);
		
		
		
		
	}
	@Test
	public static void streamCollect() {
		List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(ls.get(0));
		
		List<Integer>values = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique elements 
		//sorted order and print 3 rd element only
		values.stream().distinct().forEach(s->System.out.println(s));
		
		System.out.println();
		
		List<Integer> sortedList =values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sortedList.get(3));
	}

}
