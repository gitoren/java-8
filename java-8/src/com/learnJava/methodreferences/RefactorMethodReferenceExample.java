package com.learnJava.methodreferences;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class RefactorMethodReferenceExample {

    static Predicate<Student> predicateUsingLambda = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> predicateUsingMetRef = RefactorMethodReferenceExample::greaterThan;

    public static Supplier<Student> studentSupplier = () -> new Student();
    static BiPredicate<Student,Integer> predicateUsingMethodReference = RefactorMethodReferenceExample::greaterThan;

    static public  boolean greaterThan(Student student){

        return student.getGradeLevel() >3;
    }

   static public  boolean greaterThan(Student student,Integer grade){

        return student.getGradeLevel() >grade;
    }

    public static void main(String[] args) {

    	Supplier<Student> studentSupplier = Student::new;
    	
    	System.out.println(predicateUsingLambda.test(StudentDataBase.studentSupplier.get()));
        System.out.println(predicateUsingMetRef.test(StudentDataBase.studentSupplier.get()));
        System.out.println(predicateUsingMethodReference.test(StudentDataBase.studentSupplier.get(),3));

    }
}
