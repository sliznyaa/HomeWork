public class Burgers {
    public String burgerBun;
    public int meat = 1;
    public boolean mayoe;
    public String cheese;
    public String lettuce;

    public Burgers(String burgerBun, int meat, boolean mayoe, String cheese, String lettuce) {
        this.burgerBun = burgerBun;
        this.meat = meat;
        this.mayoe = mayoe;
        this.cheese = cheese;
        this.lettuce = lettuce;
    }

    public Burgers(String burgerBun, int meat, String cheese, String lettuce) {
        this.burgerBun = burgerBun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
    }

    public Burgers(String burgerBun, boolean mayoe, String cheese, String lettuce) {
        this.burgerBun = burgerBun;
        this.mayoe = mayoe;
        this.cheese = cheese;
        this.lettuce = lettuce;
    }

    @Override
    public String toString() {
        return
                    burgerBun + ", " +
                            (meat > 1 ? "Котлет х" + meat : "1 котлета") + ", " +
                            (mayoe ? "Майонез" : "Без майонезу" ) + ", " +
                     cheese + ", " +
                     lettuce + ".";

    }
}
