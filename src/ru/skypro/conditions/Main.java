package ru.skypro.conditions;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Main {
    private static final int MAX_MONTH_DAYS = 31;
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray();
        task1(randomArray);
        task2(randomArray);
        task3(randomArray);
        task4();
    }

    private static void task1(int[] intArray) {
        if (isCorrectMonthLength(intArray)) {
            return;
        }

        int sum = Arrays.stream(intArray).sum();
        System.out.printf(
                "Сумма трат за месяц составила %s рублей.%n",
                sum
        );
    }

    private static void task2(int[] intArray) {
        if (isCorrectMonthLength(intArray)) {
            return;
        }
        OptionalInt min = Arrays.stream(intArray).min();
        OptionalInt max = Arrays.stream(intArray).max();

        System.out.printf(
                "Минимальная сумма трат за день составила %s рублей.%nМаксимальная сумма трат за день составила %s рублей.%n",
                min.isEmpty() ? 0 : min.getAsInt(),
                max.isEmpty() ? 0 : max.getAsInt()
        );
    }

    private static void task3(int[] intArray) {
        if (isCorrectMonthLength(intArray)) {
            return;
        }

        OptionalDouble avg = Arrays.stream(intArray).average();

        if (avg.isEmpty()) {
            System.out.println("Не удалось получить среднюю сумму");
            return;
        }

        System.out.printf(
                "Средняя сумма трат за месяц составила %s рублей.%n",
                avg.getAsDouble() / intArray.length
        );
    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        System.out.println(
                new StringBuilder(String.valueOf(reverseFullName)).reverse()
        );

        char[] correctFullName = new char[reverseFullName.length];
        for (int i = correctFullName.length - 1, j = 0; i >= 0; i--, j++) {
            correctFullName[j] = reverseFullName[i];
        }

        System.out.println(correctFullName);
    }

    private static boolean isCorrectMonthLength(int[] array) {
        if (array.length > MAX_MONTH_DAYS) {
            System.out.printf("В месяце не может быть %s дней%n", array.length);
            return true;
        }

        return false;
    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
