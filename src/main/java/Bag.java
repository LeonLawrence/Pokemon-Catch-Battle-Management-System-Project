import java.util.ArrayList;

public class Bag {

    private ArrayList<Pokeball> pokeballs = new ArrayList<>();

    public void addPokeballToBag(Pokeball pokeball) {
        pokeballs.add(pokeball);
        System.out.println("POKEBALL ADDED TO BAG\n");
    }

    public Pokeball removePokeballFromBag(Pokeball pokeball) {
        pokeballs.remove(pokeball);
        System.out.println("POKEBALL REMOVED FROM BAG");
        return pokeball;
    }

    public void showPokemon() {
        for (int i = 0; i < pokeballs.size(); i++) {
            pokeballs.get(i).showPokemon();
        }


    }

    public void showFirstPokemonIndexFromPokeball() {
        pokeballs.size();
        pokeballs.get(1).showPokemon();
    }
}
