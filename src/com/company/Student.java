package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String surname;
    int age;
    int grade;
    boolean homework;
    List<Integer> grade0 = new ArrayList<>();
    List<String> subject =new ArrayList<>();
    List<String> quiz =new ArrayList<>();
    List<String> exam =new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String surname, int age, int grade, boolean homework, List<Integer> grade0, List<String> subject, List<String> quiz, List<String> exam) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grade = grade;
        this.homework = homework;
        this.grade0 = grade0;
        this.subject = subject;
        this.quiz = quiz;
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", homework=" + homework +
                ", grade0=" + grade0 +
                ", subject=" + subject +
                ", quiz=" + quiz +
                ", exam=" + exam +
                '}';


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isHomework() {
        return homework;
    }

    public void setHomework(boolean homework) {
        this.homework = homework;
    }

    public List<Integer> getGrade0() {
        return grade0;
    }

    public void setGrade0(List<Integer> grade0) {
        this.grade0 = grade0;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public List<String> getQuiz() {
        return quiz;
    }

    public void setQuiz(List<String> quiz) {
        this.quiz = quiz;
    }

    public List<String> getExam() {
        exam.add("English");
        exam.add("Math");
        return exam;
    }

    public void setExam(List<String> exam) {
        this.exam = exam;
    }

    public static void main(String[] args) {

        List<Integer> grade0 = new ArrayList<>();
        List<String> subject = new ArrayList<>();
        List<String> quiz = new ArrayList<>();
        List<String> exam = new ArrayList<>();
        grade0.add(2);
        grade0.add(3);
        subject.add("English");
        subject.add("Math");
        exam.add("English");
        quiz.add("Math");
        System.out.println(subject);
        System.out.println(exam);
        System.out.println(quiz);
    }
}
