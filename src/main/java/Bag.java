import java.util.ArrayList;

public class Bag {

    private ArrayList<Pokeball> pokeballs = new ArrayList<>();
    private boolean bagStatus;

    public void addPokeballToBag(Pokeball pokeball) {
        pokeballs.add(pokeball);
        System.out.println("POKEBALL ADDED TO BAG");
    }

    public void showPokemon() {
        for (int i = 0; i < pokeballs.size(); i++) {
            pokeballs.get(i).showPokemon();
        }
    }

    public void changeBagStatus() {
        this.bagStatus = true;
    }

    public boolean bagIsFull() {
        return bagStatus;
    }
}