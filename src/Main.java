//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Домашняя работа № 5\n");
        System.out.println("Задача № 1 ");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        }


        System.out.println("Задача № 2 ");
        int ClientOS = 0;
        int year = 20112;
        if (ClientOS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        } else if (ClientOS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if (ClientOS == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        }


        System.out.println("Задача № 3 ");
        int Year = 2026;
        if (Year > 1584) {
            if (year % 4 == 0) {
                System.out.println(Year + " Год является високосным \n");
            } else if (Year % 100 == 0) {
                System.out.println(Year + " Год не является високосным \n");
            } else if (Year % 400 == 0) {
                System.out.println(Year + " Год является високосным \n");
            } else {
                System.out.println(Year + " Год должен быть больше 1584\n");
            }


            System.out.println("Задача № 4");
            int deliveryDistance = 95;
            int DeliveryTime = 1;
            if (deliveryDistance > 100) {
                System.out.println(" Доставки нема \n");
            } else {
                if (deliveryDistance > 20) {
                    DeliveryTime++;
                } else {
                }
                if (deliveryDistance > 60) {
                    DeliveryTime++;
                } else {
                }
                System.out.println(" Потребуется дней : " + DeliveryTime + "\n");
            }


            System.out.println(" Задача № 5 ");
            char numberOfMonthsInYear = 7;
            if (numberOfMonthsInYear > 1 || numberOfMonthsInYear >12) {
                System.out.println(" Значение не верно. Исправьте ошибку.\n");
            }
            switch (numberOfMonthsInYear) {
                case 12:
                case 1:
                case 2:
                    System.out.println(" Сезон - Зима \n");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("  Сезон - Весна \n");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(" Сезон - Лето \n");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(" Сезон - Осень\n");
                    break;

            }


        }

    }
}

