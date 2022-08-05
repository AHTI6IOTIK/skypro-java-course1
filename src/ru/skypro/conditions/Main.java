package ru.skypro.conditions;

public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanov", middleName = "Ivan", lastName = "Ivanovich";

        // TASK 1
        String fullName = String.format("%s %s %s", firstName, middleName, lastName);
        System.out.println("ФИО сотрудника — " + fullName);

        // TASK 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        // TASK 3
        fullName = "Иванов Семён Семёнович".replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
