import java.util.ArrayList;

public class Randomisor {
    private PokemonManagementSystem pokemons;

    public void randomPokemonPicker(PokemonManagementSystem pokemonManagementSystem) {
        int index = (int) (Math.random() * pokemonManagementSystem.pokemons.size());
        System.out.println("index: " + index);
        System.out.println("Pokemon size: " + pokemonManagementSystem.pokemons.size());
        System.out.println("A wild pokemon appeared: " + pokemonManagementSystem.pokemons.get(index).pokemonInfo());

    }

}
