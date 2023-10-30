public class Burgers {
    public String burgerBun;
    public String meat;
    public String mayoe;
    public String cheese;
    public String lettuce;

    public Burgers(String burgerBun, String meat, String mayoe, String cheese, String lettuce) {
        this.burgerBun = burgerBun;
        this.meat = meat;
        this.mayoe = mayoe;
        this.cheese = cheese;
        this.lettuce = lettuce;
    }
    public static Burgers createUsualBurger (){
        return new Burgers("Звичайна булочка", "1 котлета", "Майонез", "Сир чеддер", "Зелень");
    }
    public static Burgers createDietBurger (){
        return new Burgers("Здорова булочка", "1 котлета", "Без майонезу", "Сир без жиру", "Зелень");
    }
    public static Burgers createDoubleMeatBurger (){
        return new Burgers("Звичайна булочка", "2 котлети", "Майонез", "Сир чеддер", "Зелень");
    }

    @Override
    public String toString() {
        return
                    burgerBun + ", " +
                     meat + ", " +
                     mayoe + ", " +
                     cheese + ", " +
                     lettuce + ".";

    }
}
