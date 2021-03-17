package com.tneshcheret;

public class Main {

    public static void main(String[] args) {
        Person ivanov = new Person("Иванов Иван Иванович", "1988.03.18");
        System.out.println(ivanov.toString());
        System.out.println(ivanov.getAge());

        Person petrov = new Person("Петров", "Петр", "Петрович");
        System.out.println(petrov.getFullName());
        System.out.println(petrov.getAge());

        Person vasin = new Person("Васин Василий Васильевич", "1995.06.26");
        System.out.println(vasin.getShortName());
        System.out.println(vasin.getAge());
    }
}
