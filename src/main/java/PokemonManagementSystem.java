import java.util.ArrayList;

public class PokemonManagementSystem {
    private ArrayList<Pokemon> pokemons = new ArrayList<>();
    private Randomisor randomisor = new Randomisor();
    private Bag bag = new Bag();

    PokemonManagementSystem() {
        Pokemon pokemon1 = new Pokemon("Pikachu", 100);
        Pokemon pokemon2 = new Pokemon("Charizard", 100);

        pokemons.add(pokemon1);
        pokemons.add(pokemon2);
    }

    public void addPokeballToBag(Pokeball pokeball) {
        bag.addPokeballToBag(pokeball);
    }

    public void getPokeballPokemonDetail() {
        bag.showPokemon();
    }

    public Pokemon findRandomPokemon() {
        int pokemonIndex = randomisor.randomPokemonPicker(getPokemonIndexSize());
        return pokemons.get(pokemonIndex);
    }

    public int getPokemonIndexSize() {
        return pokemons.size();
    }
}


