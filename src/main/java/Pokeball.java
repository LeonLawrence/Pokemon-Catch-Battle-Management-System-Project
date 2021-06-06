import java.util.ArrayList;

public class Pokeball {
    ArrayList<Pokemon> pokemons = new ArrayList<>();

    private int counter;

    public void catchPokemon(Pokemon pokemon) {
        if (counter == 0) {
            pokemons.add(pokemon);
            counter++;
            System.out.println("POKEMON STORED IN POKEBALL: " + pokemon.pokemonInfo());
        } else if (counter == 1) {
            System.out.println("POKEBALL FULL, USE ANOTHER POKEBALL");

        }
    }

    public void releasePokemon(Pokemon pokemon) {
        if (counter == 1) {
            pokemons.remove(pokemon);
            System.out.println("Pokemon Released: " + pokemon.pokemonInfo());
            counter--;
        } else if (counter == 0)
            System.out.println("There was nothing in the Pokeball to release");
    }
}
