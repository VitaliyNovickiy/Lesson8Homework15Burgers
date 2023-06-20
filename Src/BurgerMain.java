public class BurgerMain {
        public static void main(String[] args) {

            Burger burger1 = new Burger("Булочка з кунжутом,", "свинина,",
                    "чедар,", "зелень,", "майнонез");

            Burger burger2 = new Burger("Булочка бездріжджова,", "яловичина,",
                    "моцарелла,", "зелень");

            Burger burger3 = new Burger("Булочка ,", "свинина,", "яловичина,", "сулугуні,",
                    "зелень,", "майонез");

            System.out.println(burger1.regularBurgerInfo());
            System.out.println();
            System.out.println(burger2.dietBurgerInfo());
            System.out.println();
            System.out.println(burger3.twoMeatBurgerInfo());

        }
    }
