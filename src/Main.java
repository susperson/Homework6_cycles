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

        int deposit2 = 29_000;
        float total2 = 0F;

        for (int i = 1; i <= 12; i++) {
            total2 = total2 * 1.01F;
            total2 = total2 + deposit2;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
    }
}