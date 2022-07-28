package ru.skypro.course1;

public class Main {

    public static void main(String[] args) {
        Main.task1();
        Main.task2();
        Main.task3();
        Main.task4();
        Main.task5();
    }

    private static void task1() {
        byte byteVariable = 1;
        short shortVariable = 1;
        int intVariable = 1;
        long longVariable = 1L;

        float floatVariable = 1.2f;
        double doubleVariable = 1;

        char charVariable = 1;
        boolean booleanVariable = true;

        System.out.println("Задание #1");
        System.out.printf("Значение переменной byteVariable = %s%n", byteVariable);
        System.out.printf("Значение переменной shortVariable = %s%n", shortVariable);
        System.out.printf("Значение переменной intVariable = %s%n", intVariable);
        System.out.printf("Значение переменной longVariable = %s%n", longVariable);
        System.out.printf("Значение переменной floatVariable = %s%n", floatVariable);
        System.out.printf("Значение переменной doubleVariable = %s%n", doubleVariable);
        System.out.printf("Значение переменной charVariable = %s%n", charVariable);
        System.out.printf("Значение переменной booleanVariable = %s%n", booleanVariable);
        System.out.println();
    }

    private static void task2() {
       float boxerOne = 78.2f;
       float boxerTwo = 82.7f;

        System.out.println("Задание #2");
        System.out.printf("Общий вес двух бойцов %.2f кг%n", boxerOne + boxerTwo);
        System.out.printf("Разницу между весами бойцов %.2f кг%n", boxerTwo - boxerOne);
        System.out.println();
    }

    /**
     * – Бананы – 5 штук (1 банан - 80 грамм); = 400
     * – Молоко – 200 мл (100 мл = 105 грамм); 210
     * – Мороженое пломбир – 2 брикета по 100 грамм; = 200
     * – Яйца сырые – 4 яйца (1 яйцо - 70 грамм). = 280
     */
    private static void task3() {
        int gramsPerKilogram = 1000;
        int countBanana = 5;
        int countMilk = 200;
        int countIceCream = 2;
        int countEggs = 4;

        int weightPortionBanana = 80;
        float weightPortionMilk = 100f / 105f; // вес 100 мл молока = 105г
        int weightPortionIceCream = 100;
        int weightPortionEggs = 70;

        float allWeight = (countBanana * weightPortionBanana)
                + (countMilk / weightPortionMilk)
                + (countIceCream * weightPortionIceCream)
                + (countEggs * weightPortionEggs);

        System.out.println("Задание #3");
        System.out.printf("Вес коктейля %.2f кг%n", allWeight / gramsPerKilogram);
        System.out.println();
    }

    private static void task4() {
        int loseWeight = 7;
        float minLoseWeight = .25f;
        float maxLoseWeight = .5f;

        int minLoseWeightDays = (int)(loseWeight / minLoseWeight);
        int maxLoseWeightDays = (int)(loseWeight / maxLoseWeight);

        System.out.println("Задание #4");
        System.out.printf("При похудении %sг в день понадобится %s дней%n", minLoseWeight, minLoseWeightDays);
        System.out.printf("При похудении %sг в день понадобится %s дней%n", maxLoseWeight, maxLoseWeightDays);
        System.out.printf("В среднем понадобится %s дней%n", (minLoseWeightDays + maxLoseWeightDays) / 2);
        System.out.println();
    }

    private static void task5() {
        float indexingPerYearPercent = 1.1f;
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        int indexingSalaryMasha = (int)(salaryMasha * indexingPerYearPercent);
        int indexingSalaryDenis = (int)(salaryDenis * indexingPerYearPercent);
        int indexingSalaryKristina = (int)(salaryKristina * indexingPerYearPercent);

        System.out.println("Задание #5");
        System.out.printf(
                "Маша теперь получает %s рублей. Годовой доход вырос на %s рублей%n",
                indexingSalaryMasha,
                (indexingSalaryMasha * 12) - (salaryMasha * 12)
        );
        System.out.printf(
                "Денис теперь получает %s рублей. Годовой доход вырос на %s рублей%n",
                indexingSalaryDenis,
                (indexingSalaryDenis * 12) - (salaryDenis * 12)
        );
        System.out.printf(
                "Кристина теперь получает %s рублей. Годовой доход вырос на %s рублей%n",
                indexingSalaryKristina,
                (indexingSalaryKristina * 12) - (salaryKristina * 12)
        );

        System.out.println();
    }
}
