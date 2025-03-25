package com.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "Beginner");
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
        this(name, surname, expirienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    

    public void printInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void printInfo(int detailLevel) {
        if (detailLevel > 1) {
            System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + expirienceInYears + " лет, Уровень англ. языка: " + englishLevel + ", Зарплата: " + salary);
        } else {
            printInfo();
        }
    }

    public void printInfo(String format) {
        if ("short".equals(format)) {
            printInfo();
        } else {
            System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + expirienceInYears + " лет");
        }
    }

    public static String StaticMethod() {
        return "пример";
    }
}
