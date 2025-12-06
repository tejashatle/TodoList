package com.example.learning.TodoList.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main(String args[]) {
		
		
		List<String> str1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
		
		List<String> str2 = new ArrayList<String>(Arrays.asList("A", "B", "E", "F"));
		
		List<String> added = str2.stream().filter(st -> !str1.contains(st)).toList();
		
		List<String> removed = str1.stream().filter(st -> !str2.contains(st)).toList();
		
		System.out.println(added);
		System.out.println(removed);
		
		
		
	}

}


