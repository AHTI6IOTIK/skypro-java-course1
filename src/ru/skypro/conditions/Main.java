package ru.skypro.conditions;

public class Main {
    public static void main(String[] args) {
        Main.task1();
        System.out.println();
        System.out.println();
        Main.task2();
        System.out.println();
        Main.task3();
    }

    private static void task1() {
        int i = 0;
        int steps = 10;
        while (i++ < steps) {
            System.out.print(i);
            if (!(i >= steps)) {
                System.out.print(" ");
            }
        }

        System.out.println();

        for (i--; i > 0; i--) {
            System.out.print(i);
            if (i - 1 > 0) {
                System.out.print(" ");
            }
        }
    }

    private static void task2() {
        int fridayNum = 5;
        int weekDays = 7;

        int currentDay = 10;
        int monthDays = 31;

        while (currentDay <= monthDays) {
            if (currentDay % weekDays == fridayNum) {
                System.out.printf(
                        "Сегодня пятница, %s-е число. Необходимо подготовить отчет.%n",
                        currentDay
                );
            }
            currentDay++;
        }
    }

    private static void task3() {
        int cometShown = 79;
        int currentYear = 2022;

        int lastYears = 200;
        int frontYears = 100;

        int step = 1;

        for (int i = currentYear - lastYears; i < currentYear + frontYears; i += step) {
            if (i % cometShown == 0) {
                System.out.println(i);

                if (step != cometShown) {
                    step = cometShown;
                }
            }
        }
    }
}
