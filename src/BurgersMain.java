import java.util.Scanner;

public class BurgersMain {
    public static void main(String[] args) {
        Burgers regularBurger = new Burgers("Булочка", true, "Сир чеддер", "Зелень");
        Burgers dietBurger = new Burgers("Здорова булочка", 1, false, "Сир без жиру", "Зелень");
        Burgers doubleMeatBurger = new Burgers("Булочка", 2, true, "Сир","Зелень");

        System.out.println("Склад бургерів: ");
        System.out.println("Звичайний бургер: " + regularBurger);
        System.out.println("Дієтичний бургер: " + dietBurger);
        System.out.println("Бургер з подвійним м'ясом: " + doubleMeatBurger);
        System.out.println("_______________________________________________");

        Scanner scanner = new Scanner(System.in);
        while (true){
            burgersMenu();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                   System.out.println("Ви замовили звичайний бургер");
                    System.out.println(regularBurger);
                    return;
                case 2:
                    System.out.println("Ви замовили дієтичний бургер");
                    System.out.println(dietBurger);
                    return;
                case 3:
                   System.out.println("Ви замовили бургер з подвійним м'ясом");
                    System.out.println(doubleMeatBurger);
                    return;
               case 4:
                    return;
            }
        }
    }

    public static void burgersMenu(){
        System.out.println("Будь ласка зробіть вибір: ");
        System.out.println("1. Звичайний бургер");
        System.out.println("2. Дієтичний бургер");
        System.out.println("3. Бургер з подвійним м'ясом");
        System.out.println("4. Вихід з меню");
   }
}
