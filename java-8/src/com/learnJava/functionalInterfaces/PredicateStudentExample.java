package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;

public class PredicateStudentExample {

    static Predicate<Student> filterGrade = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> filterGpa = (s) -> s.getGpa()>=3.9;

    static Function<Integer,Predicate<Integer>> gradePredicate = (toCompare) -> (number) -> number > toCompare;
    static Function<Double,Predicate<Double>>  gpaPredicate = (toCompare) -> (number) -> number > toCompare;


    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.stream()
                .filter(filterGrade)
                .collect(toList());

        studentList.forEach((student -> {
            if(filterGrade.test(student)){
                System.out.println(student);
            }
        }));

        boolean result = gradePredicate.apply(2).test(5) && gpaPredicate.apply(3.6).test(3.9);
        System.out.println("Result from Predicate : " + result);

    }
}
