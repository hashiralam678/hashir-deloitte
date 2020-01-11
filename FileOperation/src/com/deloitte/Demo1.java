package com.deloitte;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo1 {

	public static void main(String[] args) {
		try {
//			List<String> lines = Files.lines(Paths.get("hello1.txt")).collect(Collectors.toList());
			
			Files.lines(Paths.get("hello1.txt"))
			.filter(s ->(s.toString().split(" ")).length>=3)
			.map(String :: toUpperCase)
			.forEach(System.out::println);
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
