package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Headmaster {
    String name;
    String surname;
    List<Student> spisok = new ArrayList<>();
    List<Student> dropout = new ArrayList<>();

    public Headmaster() {

    }

    public Headmaster(String name, String surname, List<Student> spisok) {
        this.name = name;
        this.surname = surname;
        this.spisok = spisok;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", spisok=" + spisok +
                ", dropout=" + dropout +
                '}';
    }

    public static void main(String[] args) {

        List<Student> spisok = new ArrayList<Student>();
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


    Student student1 = new Student("Diana","Babiy",19,3,true, grade0, subject , quiz, exam);
    Student student2 = new Student("Pavel","Danilov",23,5,false, grade0, subject , quiz, exam);
    Student student3 = new Student("Svetlana","Suvorova",20,3,true, grade0, subject , quiz, exam);
    Student student4 = new Student("Aleksandr","Zholud",21,3,false, grade0, subject , quiz, exam);

    spisok.add(student1);
    spisok.add(student2);
    spisok.add(student3);
    spisok.add(student4);


    Headmaster headmaster = new Headmaster("Viktoria","Gizi",spisok);
        System.out.println(headmaster);

}



public void printName(List<Student>spisok){
    for (int i = 0; i < spisok.size(); i++) {
        System.out.println("Имя студента "+spisok.get(i).name+" ,фамилия студента"+spisok.get(i).surname);

}}
    public void printPredmet(List<String> programm,List<Student> spisok ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название предмета");
        String predmet = scanner.nextLine();

        for (int i = 0; i < spisok.size(); i++) {
            if(programm.contains(predmet)==true){
                System.out.println("Имя студента "+spisok.get(i).name+" ,фамилия студента "+spisok.get(i).surname);
            }
        }
    }
    public void printTest(List<String> test,List<Student> spisok ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название зачета");
        String predmet = scanner.nextLine();

        for (int i = 0; i < spisok.size(); i++) {
            if(test.contains(predmet)==true){
                System.out.println("Имя студента "+spisok.get(i).name+" ,фамилия студента "+spisok.get(i).surname);
            }
        }
    }
    public void printExams(List<String> exams,List<Student> spisok ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название экзамена");
        String predmet = scanner.nextLine();

        for (int i = 0; i < spisok.size(); i++) {
            if(exams.contains(predmet)==true){
                System.out.println("Имя студента "+spisok.get(i).name+" ,фамилия студента "+spisok.get(i).surname);
            }
        }
    }
    public void printNameIn(List<Student> spisok,List<Student> spisokOtch, List<Integer> rating){

        int sum = 0;
        for (int i = 0; i < rating.size(); i++) {
            sum +=rating.get(i);
        }
        double sr=sum/rating.size();
        for (int i = 0; i < spisok.size(); i++) {
            System.out.println("Имя студента "+spisok.get(i).name+" ,фамилия студента"+spisok.get(i).surname+" средняя оценка"+sr);
        }
        for (int i = 0; i < spisok.size(); i++) {
            if (sr<4 && spisok.get(i).homework == false){
                spisokOtch.add(spisok.get(i));
            }
        }

    }}


