package com.tneshcheret;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    /*1) Написать класс Person, у которого есть следующие поля:
 Фамилия, Имя, Отчество, дата рождения.
Написать конструкторы:
- на все поля,
- только на ФИО
- который принимает 1 параметр - строку с полным именем "Иванов Иван Иванович", и задает отдельные значения в поля Фамилия, Имя, Отчество.
Написать методы:
- который возвращает полное ФИО типа "Иванов Иван Иванович"
- краткое ФИО типа "Иванов И. И."

*/
    private final String surname;
    private final String name;
    private final String patronymic;
    private String fullName;
    private String dateBirth;

    public Person(String surname, String name, String patronymic, String dateBirth) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
    }

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }


    public Person(String fullName) {
        this.fullName = fullName;
        String[] fullNameArr = fullName.split("\\s+");
        surname = fullNameArr[0].trim();
        name = fullNameArr[1].trim();
        patronymic = fullNameArr[2].trim();
    }

    public Person(String fullName, String dateBirth) {
        this.fullName = fullName;
        String[] fullNameArr = fullName.split("\\s+");
        surname = fullNameArr[0].trim();
        name = fullNameArr[1].trim();
        patronymic = fullNameArr[2].trim();
        this.dateBirth = dateBirth;
    }

    public StringBuilder getFullName() {
        StringBuilder builderFullName = new StringBuilder();
        return builderFullName.append(surname).append(" ").append(name).append(" ").append(patronymic);
    }

    public StringBuilder getShortName() {
        StringBuilder builderShortName = new StringBuilder();
        char firstNameLetter = name.charAt(0);
        char firstPatronymicLetter = surname.charAt(0);
        return builderShortName.append(surname).append(" ").append(firstNameLetter).append(".").append(firstPatronymicLetter).append(".");
    }

    public int getAge() {
       /* 2*) Дата рождения задается как строка типа "18.12.1985"
             - добавить метод который выводит количество полных лет*/
        if (dateBirth != null) {
            String[] dateBirthArr = this.dateBirth.split("\\.");
            int yearBirth = Integer.parseInt(dateBirthArr[0].trim());
            int monthBirth = Integer.parseInt(dateBirthArr[1].trim());
            int dayBirth = Integer.parseInt(dateBirthArr[2].trim());
            LocalDate dateBirth = LocalDate.of(yearBirth, monthBirth, dayBirth);
            Period period = Period.between(dateBirth, LocalDate.now());
            return period.getYears();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}
