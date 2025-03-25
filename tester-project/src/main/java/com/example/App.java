package com.example;

public class App {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Иван", "Иванов");
        Tester tester2 = new Tester("Пётр", "Петров", 3);
        Tester tester3 = new Tester("Анна", "Сидорова", 5, "Средний", 60000);

        tester1.printInfo();
        tester2.printInfo(2);
        tester3.printInfo("подробно");

        System.out.println("Компания: " + Tester.StaticMethod());
    }
}
