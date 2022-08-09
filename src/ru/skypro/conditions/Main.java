package ru.skypro.conditions;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2014;
        int year = 2012;
        int deliveryDistance = 95;

        task1(year);
        task2(clientOS, clientDeviceYear);
        System.out.printf("Потребуется дней: %s%n", Main.task3(deliveryDistance));
    }

    private static void task1(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%s год является високосным%n", year);
        } else {
            System.out.printf("%s год не является високосным%n", year);
        }
        System.out.println();
    }

    private static void task2(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = Main.getOsName(clientOS);
        if (clientDeviceYear < currentYear) {
            System.out.printf("Установите облегченную версию приложения для %s по ссылке%n", osName);
            System.out.println();
            return;
        }

        Main.printLinkByClientOs(clientOS);
    }

    private static int task3(int deliveryDistance) {
        int deliveryDays = 0;

        if (deliveryDistance > 0) {
            deliveryDays++;
        }

        if (deliveryDistance > 20) {
            deliveryDays++;
        }

        if (deliveryDistance > 60) {
            deliveryDays++;
        }

        return deliveryDays;
    }

    private static void printLinkByClientOs(int clientOS) {
        System.out.printf(
                "Установите версию приложения для %s по ссылке%n",
                Main.getOsName(clientOS)
        );
        System.out.println();
    }

    /**
     * Возвращает название ос по id
     * @return void
     */
    private static String getOsName(int clientOS) {
        if (clientOS > 0) {
            return "Android";
        } else {
            return "iOS";
        }
    }

    /**
     * проверяет является ли год високосным
     * @param year int
     * @return bool
     */
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 || year % 400 == 0) && year % 100 != 0;
    }
}
