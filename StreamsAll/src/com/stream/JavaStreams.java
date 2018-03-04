package com.stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javafx.scene.shape.Path;

public class JavaStreams {
	public static void main(String[] args)throws Exception {

		/*		IntStream.range(1,10)	
		.forEachOrdered(x-> System.out.print(x));
		System.out.println();

		//if you want skip some values use it 
		IntStream.range(1,10)
		.skip(5)
		.forEachOrdered(x-> System.out.print(x));
		System.out.println();
		 */
		//if you want add values
		/*	System.out.println(
				IntStream.range(1, 5)
				.sum());
		System.out.println();

		 */

		//if you want sorting findFirst
		/*		Stream.of("ava","aneri","albetro","Abhi")
		.sorted()
		.findFirst()
		.ifPresent(System.out::print);
		 */
		// filter any one charactor starts with ("s")

		/*	String[]names={"kiran" ,"vijay", "kamal", "varsha" , "varun","kanalkannan"};
		Arrays.stream(names)
		.filter(x -> x.startsWith("v"))
		.forEach(System.out::println);*/

		//multiple operation
/*
			Arrays.stream(new int[]{2,4,6,8,10})
		.map(x-> x* x)
		.forEach(System.out::println);
		 */

		//print the values uppercause
/*
		List<String>list=Arrays.asList("paul","poloris","ibm","mastech");
		list.stream()
		.map(String::toUpperCase)
		.filter(y-> y.startsWith("p"))
		.forEach(System.out::println);*/
		
		//Stream row from the text files
	/*	Stream<String>bands=Files.lines(Paths.get("/StreamsAll/src/com/stream/files.txt"));
		bands.sorted()
		.filter(x-> x.contains("kiran"))
		.collect(Collectors.toList())
		.forEach(x->System.out.println(x));*/
		
		
		//flat Map example

		List<String>list=Arrays.asList("kiran","vijay");
		list.stream()
		.map(String ::toUpperCase)
		.sorted()
		.forEach(System.out::println);

		System.out.println("==========Flat map================== ");

		Function<String, String>fun=s->s + " sister  sujatha ";
		list.stream()
		.map(fun)
		.forEach(System.out::println);
		
		
		
		
	}



}
