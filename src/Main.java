import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int a = 2000;
        task1(a);
        boolean clientOS = false; //false(0)-android , true(1)-IOS
        short age = 2020;
        task2(clientOS, age);
        int deliveryDistance = 15;
        task3(deliveryDistance);

    }

    public static void task1(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " год - високосный");
        } else {
            System.out.println(a + " год - не високосный");
        }
    }

    public static void task2(boolean clientOS, short age) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS && age < currentYear) {
            System.out.println("Установите упрощеную версию приложения для iOS по ссылке");
        } else if (clientOS && age == currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (!clientOS && age == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (!clientOS && age < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("потребуется 3 дня");
        } else {
            System.out.println("доставки нет");
        }
    }
}