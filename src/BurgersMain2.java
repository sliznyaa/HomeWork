public class BurgersMain2 {
    public static void main(String[] args) {
        Burgers regularBurger = new Burgers("Булочка", true, "Сир чеддер", "Зелень");
        Burgers dietBurger = new Burgers("Здорова булочка", 1, "Сир без жиру", "Зелень");
        Burgers doubleMeatBurger = new Burgers("Булочка", 2, true, "Сир", "Зелень");

        System.out.println("Склад бургерів: ");
        System.out.println("Звичайний бургер: " + regularBurger);
        System.out.println("Дієтичний бургер: " + dietBurger);
        System.out.println("Бургер з подвійним м'ясом: " + doubleMeatBurger);
    }
}
