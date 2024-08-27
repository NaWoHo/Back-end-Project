package com.example;
import com.example.Student;
public class Main {
    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setName("Sara");
        student01.setAge(20);
        student01.setGender("F");
        student01.setId("Rd234567");

        Student student02 = new Student();
        student02.setName("Alexia");
        student02.setAge(23);
        student02.setGender("F");
        student02.setId("E30958303");

        Student student03 = new Student();
        student03.setName("Max");
        student03.setAge(23);
        student03.setGender("M");
        student03.setId("C30599383");

        System.out.println("=========================================================================");
        System.out.printf("%s is %d Year Old, %s and ID %s" ,
        student01.getName(), student01.getAge(), student01.getGender(), student01.getId());
        System.err.println();
        System.out.printf("%s is %d Year Old, %s and ID %s" ,
        student02.getName(), student02.getAge(), student02.getGender(), student02.getId());
        System.err.println();
        System.out.printf("%s is %d Year Old, %s and ID %s" ,
        student03.getName(), student03.getAge(), student03.getGender(), student03.getId());
    }
}