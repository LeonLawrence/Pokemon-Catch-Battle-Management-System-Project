package orignal_code;

import java.util.ArrayList;

public class Bag {
    ArrayList<Pokeball> pokeballs = new ArrayList<>();
    private int counter;
    private boolean isFull = false;

    public void addPokeball(Pokeball pokeball) {
        if (!isFull) {
            pokeballs.add(pokeball);
            counter++;
            System.out.println("BAG STORED A POKEBALL");
        }
        if (counter == 6) {
            isFull = true;
            System.out.println("bag is full");
        }
    }

    public Pokeball removePokeball(Pokeball pokeball) {
        if (counter > 0) {
            pokeballs.remove(pokeball);
            counter--;
            System.out.println("Taken out pokeball from bag");
        }
        if (counter == 0) {
            System.out.println("Bag is empty");
        }
        return pokeball;
    }

    private int numberOfPokeballs() {
        return pokeballs.size();
    }

    public void showPokeballInBag() {
        System.out.println("Number of pokeballs in bag: " + numberOfPokeballs());
        System.out.println();
    }

    public void showPokemon() {
        for (int i = 0; i < pokeballs.size(); i++) {
            pokeballs.get(i).showPokemon();
        }

    }


}
