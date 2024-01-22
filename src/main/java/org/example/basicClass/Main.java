package org.example.basicClass;

public class Main {
    public static void main(String[] args) {
        University ENU = new University("Первый", "Евразийский Национальный Университет", "ЕНУ", 1985, StudyProfile.TEACHER);
        Student Ivanov = new Student("Петров Иван", "Первый", 3, 4.2f);
        System.out.println(ENU);
        System.out.println(Ivanov);

    }
}