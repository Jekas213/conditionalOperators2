public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1; // 1 - android, 0 - iOS
        int clientDeviceYear = 2020;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }


    }

    public static void task4 () {
        System.out.println("Задача 4");
        int distance = 110;
        if (distance < 20) {
            System.out.println("карту доставим в течении суток");
        } else if (distance < 60) {
            System.out.println("карту доставят в течении двух суток");
        } else if (distance <= 100) {
            System.out.println("карту доставят в течении трех суток");
        } else {
            System.out.println("Доставки нет");
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "й месяц пренадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "й месяц пренадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "й месяц пренадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "й месяц пренадлежит к сезону осень");
                break;
            default:
                System.out.println("такого месяца нет");
        }

    }
}