public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        //task6();
        //task7();
        //task8();
    }
    public static void task1() {
        System.out.println("Задача 1");

        char clientOs = '0'; //0 — iOS, 1 — Android
        if (clientOs == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == '1') {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");

        int clientDeviceYear = 2016;
        char clientOs = '1'; //0 — iOS, 1 — Android

        if (clientOs == '0' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOs == '0' && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (clientOs == '1' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientOs == '1' && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        System.out.println();
        }

    public static void task3() {
        System.out.println("Задача 3");

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 21 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance >=101) {
            System.out.println("Доставки нет");
        }
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");

        int monthNumber = 2;

        switch (monthNumber) {
            case 1:
                System.out.println("Месяц январь относится к зимнему сезону");
                break;
            case 2:
                System.out.println("Месяц февраль относится к зимнему сезону");
                break;
            case 3:
                System.out.println("Месяц март относится к весеннему сезону");
                break;
            case 4:
                System.out.println("Месяц апрель относится к весеннему сезону");
                break;
            case 5:
                System.out.println("Месяц май относится к весеннему сезону");
                break;
            case 6:
                System.out.println("Месяц июнь относится к летнему сезону");
                break;
            case 7:
                System.out.println("Месяц июль относится к летнему сезону");
                break;
            case 8:
                System.out.println("Месяц август относится к летнему сезону");
                break;
            case 9:
                System.out.println("Месяц сентябрь относится к осеннему сезону");
                break;
            case 10:
                System.out.println("Месяц октябрь относится к осеннему сезону");
                break;
            case 11:
                System.out.println("Месяц ноябрь относится к осеннему сезону");
                break;
            case 12:
                System.out.println("Месяц декабрь относится к зимнему сезону");
                break;
            default:
                System.out.println("В году не бывает больше 12 месяцев");

            /* Еще один вариант решения
            case 1:
            case 2:
            case 12:
                System.out.println("Указанный месяц относится к зимнему сезону");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Указанный месяц относится к весеннему сезону");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Указанный месяц относится к летнему сезону");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Указанный месяц относится к осеннему сезону");
                break;
            default:
                System.out.println("В году не бывает больше 12 месяцев");
              */
        }

    }
}

