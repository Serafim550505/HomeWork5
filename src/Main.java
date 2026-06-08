//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Домашняя работа № 5\n");
        System.out.println("Задача № 1 ");
        int client = 1;
        if (client == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (client == 1) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        }


        System.out.println("Задача № 2 ");
        int clientVersionApplication = 1;
        int age = 2011;
        if (clientVersionApplication == 1 && age < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        } else if (clientVersionApplication == 0 && age < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if (clientVersionApplication == 1 && age >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        }


        System.out.println("Задача № 3 ");
        int year = 2026;
        if (year > 1584)
            if (year % 4 == 0) {
                System.out.println(year + " Год является високосным \n");
            } else if (year % 100 == 0) {
                System.out.println(year + " Год не является високосным \n");
            } else if (year % 400 == 0) {
                System.out.println(year + " Год является високосным \n");
            } else {
                System.out.println(year + " Год должен быть больше 1584\n");

            }


        System.out.println("Задача № 4");

        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется\n");
        } else if (deliveryDistance > 60) {
            deliveryTime++;
            deliveryTime++;
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        } else if (deliveryDistance > 20) {
            deliveryTime++;
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        }


        System.out.println("Задача № 5");
        int monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон - Зима\n");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон - Весна\n");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон - Лето\n");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон - Осень\n");
                break;
            default:
                System.out.println("Значение не верно. Исправьте ошибку.\n");


        }


    }
}


