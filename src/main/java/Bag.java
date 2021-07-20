import java.util.ArrayList;

public class Bag {

    private ArrayList<Pokeball> pokeballs = new ArrayList<>();
    private Randomisor randomisor = new Randomisor();
    public boolean bagStatus;

    public void addPokeballToBag(Pokeball pokeball) {
        pokeballs.add(pokeball);;
        System.out.println("POKEBALL ADDED TO BAG");
    }

    public Pokeball removePokeballFromBag(Pokeball pokeball) {
        pokeballs.remove(pokeball);
        System.out.println("POKEBALL REMOVED FROM BAG");
        return pokeball;
    }

    public boolean bagIsFull() {
        return bagStatus;
    }



    public void showPokemon() {
        for (int i = 0; i < pokeballs.size(); i++) {
            pokeballs.get(i).showPokemon();
        }
    }

    public Pokeball findRandomPokemonFromInventory() {
        int pokemonIndex = randomisor.randomPokemonPicker(getPokemonIndexSize());
        return pokeballs.get(pokemonIndex);
    }

    public int getPokemonIndexSize() {
        return pokeballs.size();
    }
}
