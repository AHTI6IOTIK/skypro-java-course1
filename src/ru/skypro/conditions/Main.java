package ru.skypro.conditions;

public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2014;
        int year = 2012;
        int deliveryDistance = 95;
        int monthNumber = 12;

        Main.task1(clientOS);
        Main.task2(clientOS, clientDeviceYear);
        Main.task3(year);
        Main.task4(deliveryDistance);
        Main.task5(monthNumber);
    }

    private static void task1(int clientOS) {
        System.out.printf("Установите версию приложения для %s по ссылке%n", Main.getOsName(clientOS));
        System.out.println();
    }

    private static void task2(int clientOS, int clientDeviceYear) {
        String osName = Main.getOsName(clientOS);
        if (clientDeviceYear < 2015) {
            System.out.printf("Установите облегченную версию приложения для %s по ссылке%n", osName);
            System.out.println();
            return;
        }

        Main.task1(clientOS);
    }

    private static void task3(int year) {
        if (year % 4 == 0) {
            System.out.printf("%s год является високосным%n", year);
        } else {
            System.out.printf("%s год не является високосным%n", year);
        }
        System.out.println();
    }

    private static void task4(int deliveryDistance) {
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

        System.out.printf("Потребуется дней: %s%n", deliveryDays);
        System.out.println();
    }

    private static void task5(int monthNumber) {
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("не корректный месяц");

        }
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
}
