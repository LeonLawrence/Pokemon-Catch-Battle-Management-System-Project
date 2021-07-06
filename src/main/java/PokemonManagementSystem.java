import java.awt.*;
import java.util.ArrayList;

public class PokemonManagementSystem {
    public ArrayList<Pokemon> pokemons = new ArrayList<>();
    private Bag bag1 = new Bag();
    private Randomisor randomisor = new Randomisor();

    PokemonManagementSystem() {
        Pokemon pokemon1 = new Pokemon("Pikachu", 100);
        Pokemon pokemon2 = new Pokemon("Charizard", 100);
        Pokemon pokemon3 = new Pokemon("Eevee", 100);
        Pokemon pokemon4 = new Pokemon("Snorlax", 100);
        Pokemon pokemon5 = new Pokemon("Squirtle", 100);
        Pokemon pokemon6 = new Pokemon("Lucario", 100);
        Pokemon pokemon7 = new Pokemon("Bulbasaur", 100);
        Pokemon pokemon8 = new Pokemon("Gyarados", 100);
        Pokemon pokemon9 = new Pokemon("Jigglypuff", 100);
        Pokemon pokemon10 = new Pokemon("Dragonite", 100);

        pokemons.add(pokemon1);
        pokemons.add(pokemon2);
        pokemons.add(pokemon3);
        pokemons.add(pokemon4);
        pokemons.add(pokemon5);
        pokemons.add(pokemon6);
        pokemons.add(pokemon7);
        pokemons.add(pokemon8);
        pokemons.add(pokemon9);
        pokemons.add(pokemon10);
    }

    public Pokemon findRandomPokemon() {
        int pokemonIndex = randomisor.randomPokemonPicker(getPokemonIndexSize());
        return pokemons.get(pokemonIndex);
    }

    public void getPokeballPokemonDetails() {
//            bag1.showPokeballInBag();
        bag1.showPokemon();
    }

    public void addPokeballToBag(Pokeball pokeball) {
        bag1.addPokeball(pokeball);
    }


    public void displayInventory() {
        bag1.showPokeballInBag();
    }

    public int getPokemonIndexSize() {
        return pokemons.size();
    }

}


