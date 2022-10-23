public class Main {
    public static void main(String[] args) {
        //Задание 1.1
        System.out.println("Задание 1.1:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задание 1.2
        System.out.println("\nЗадание 1.2:");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //Задание 1.3
        System.out.println("\nЗадание 1.3:");

        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        //Задание 1.4
        System.out.println("\nЗадание 1.4:");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Задание 2.1
        System.out.println("\nЗадание 21:");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        //Задание 2.2
        System.out.println("\nЗадание 2.2:");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        //Задание 2.3
        System.out.println("\nЗадание 2.3:");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        //Задание 3.1
        System.out.println("\nЗадание 3.1:");

        int deposit = 29_000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        //Задание 3.2
        System.out.println("\nЗадание 3.2:");

        int deposit2 = 15_000;
        float total2 = 0F;
        int i = 0;

//        for (; i <= 12; i++) {
//            total2 = total2 * 1.01F;
//            total2 = total2 + deposit2;
//            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
//        }

// ДЗ 7
        //Задание 1.1
        System.out.println("\nДЗ7. Задание 1.1:");

        while (total2 < 2_459_000) {
            total2 = total2 * 1.01F;
            total2 = total2 + deposit2;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }

        //Задание 1.2
        System.out.println("\nДЗ7. Задание 1.2:");

        int count = 0;
        while (count < 10) {
            count++;
            System.out.print(count + " ");
        }

        System.out.println();
        for (;count > 0; count--) {
            System.out.print(count + " ");
        }

        //Задание 1.3
        System.out.println("\nДЗ7. Задание 1.3:");
        int population = 12_000_000;
        int birthrate = 17;
        int deathrate = 8;
        int populationGrowth = birthrate - deathrate;

        for (int year = 1; year < 11; year++) {
            population += population * populationGrowth / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        //Задание 2.1
        System.out.println("\nДЗ7. Задание 2.1:");
        float depositRate = 0.07F;
        int depositAmount = 15_000;
        int month = 1;

//        while (depositAmount < 12_000_000) {
//            depositAmount += depositAmount*depositRate;
//            System.out.println("Месяц " + month + ": сумма на депозите " + depositAmount);
//            month++;
//        }

        //Задание 2.2
        System.out.println("\nДЗ7. Задание 2.2:");

//        while (depositAmount < 12_000_000) {
//            depositAmount += depositAmount*depositRate;
//            if (month % 6 == 0) {
//                System.out.println("Месяц " + month + ": сумма на депозите " + depositAmount);
//            }
//            month++;
//        }
//        System.out.println("Месяц " + month + ": сумма на депозите " + depositAmount);

        //Задание 2.3
        System.out.println("\nДЗ7. Задание 2.3:");

        for (; month < 109; month++) {
            depositAmount += depositAmount*depositRate;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ": сумма на депозите " + depositAmount);
            }
        }

        //Задание 2.4
        System.out.println("\nДЗ7. Задание 2.4:");

        int firstFridayDate = 7;

        for (int date = 1; date < 32; date++) {
            if ((date - firstFridayDate) % 7 == 0) {
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.");
            }
        }

        //Задание 3.1
        System.out.println("\nДЗ7. Задание 3.1:");

        int currentYear = 2022;
        int startPeriodYear = currentYear - 200;
        int finishPeriodYear = currentYear + 100;

        for (int year = startPeriodYear; year <= finishPeriodYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

        //Задание 3.2
        System.out.println("\nДЗ7. Задание 3.2:");

        for (int a = 1; a < 11; a++) {
            System.out.println("2*" + a + "=" + 2*a);
        }
    }
}