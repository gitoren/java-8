package com.learnJava.oren;

import com.learnJava.data.Student;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MyTester {

	public static void main(String[] args) {

		Function<Integer,Integer> add10 = (a) -> (a+10);
		BiFunction<Integer,Integer,Integer> multiply = (a,b) -> (a*b);
		System.out.println(add10.apply(5) );
		System.out.println(multiply.apply(5,10));	
		
		Student s = new Student.Builder().withName("Oren").withGradeLevel(2).build();
		System.out.println(s);
	}

}
