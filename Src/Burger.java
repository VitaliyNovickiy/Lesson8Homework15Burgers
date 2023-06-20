public class Burger {

    public String bun;
    public String meat;
    public String meat1;
    public String cheese;
    public String greens;
    public String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    public String regularBurgerInfo() {
        return "Звичайний бургер має такий склад : " + bun + meat + cheese + greens + mayonnaise
                + ".";
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
    }


    public String dietBurgerInfo() {
        return "Дієтичний бургер має такий склад: " + bun + meat + cheese + greens
                + ".";
    }

    public Burger(String bun, String meat, String meat1, String cheese,
                  String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    public String twoMeatBurgerInfo() {
        return "Бургер з подвійним м'ясом має такий склад: " + bun + meat
                + meat1 + cheese + greens + mayonnaise + ".";
    }
}

