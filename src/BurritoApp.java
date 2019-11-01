import java.util.ArrayList;

public class BurritoApp {
    public static void main(String[] args) {
        Burrito burrito1 = new Burrito();
        burrito1.setRice("White rice");
        burrito1.setBean("Black beans");
        burrito1.setMeat("Chicken");
        burrito1.setSalsa("Mild salsa");
        burrito1.setVeggies("Fajitas");
        for (int i=0; i<25; i++) {
            burrito1.displayText(i);
        }

        ArrayList<Burrito> burritos = new ArrayList<>();
        Burrito[] burritos1 = new Burrito[25];
    }





}
