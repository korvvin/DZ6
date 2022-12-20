import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int a = 2000;
        searchYears(a);
        boolean clientOS = false; //false(0)-android , true(1)-IOS
        short year = 2020;
        checkUpdate(clientOS, year);
        int deliveryDistance = 15;
        System.out.println(calculateDays(deliveryDistance));

    }

    public static void searchYears(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " год - високосный");
        } else {
            System.out.println(a + " год - не високосный");
        }
    }

    public static void checkUpdate(boolean clientOS, short year) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS && year < currentYear) {
            System.out.println("Установите упрощеную версию приложения для iOS по ссылке");
        } else if (clientOS && year == currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (!clientOS && year == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (!clientOS && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static String calculateDays(int deliveryDistance) {
        String howManyDays = " ";
        if (deliveryDistance <= 20) {
            howManyDays = "потребуется 1 день";
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            howManyDays = "потребуется 2 дня";
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            howManyDays = "потребуется 3 дня";
        } else {
            howManyDays = "доставки нет";
        }
        return howManyDays;
    }
}