package ru.skypro.conditions;

public class Main {
    public static void main(String[] args) {
        // TASK 1
        int[] arrInts = new int[3];

        arrInts[0] = 1;
        arrInts[1] = 2;
        arrInts[2] = 3;

        float[] arrFloats = new float[]{ 1.57f, 7.654f, 9.986f };

        String[] arrStrings = new String[]{ "1s", "2s", "3s" };

        // TASK 2

        for (int i = 0; i < arrInts.length; i++) {
            System.out.print(arrInts[i]);
            if (i != arrInts.length - 1) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }

        for (int i = 0; i < arrFloats.length; i++) {
            System.out.print(arrFloats[i]);
            if (i != arrFloats.length - 1) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }

        for (int i = 0; i < arrStrings.length; i++) {
            System.out.print(arrStrings[i]);
            if (i != arrStrings.length - 1) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }

        // TASK 3

        for (int i = arrInts.length -1 ; i >= 0 ; i--) {
            System.out.print(arrInts[i]);
            if (i != 0) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }

        for (int i = arrFloats.length -1 ; i >= 0 ; i--) {
            System.out.print(arrFloats[i]);
            if (i != 0) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }

        for (int i = arrStrings.length -1 ; i >= 0 ; i--) {
            System.out.print(arrStrings[i]);
            if (i != 0) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }

        // TASK 4

        for (int i = 0 ; i < arrInts.length ; i++) {
            if (arrInts[i] % 3 == 0) {
                arrInts[i]++;
            }

            System.out.print(arrInts[i]);

            if (i != arrInts.length - 1) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }
    }

}
