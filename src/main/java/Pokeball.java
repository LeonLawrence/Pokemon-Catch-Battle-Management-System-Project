import java.util.ArrayList;

public class Pokeball {
    private Pokemon pokemon;

    public void catchPokemon(Pokemon pokemon) {
        if (this.pokemon == null) {
            this.pokemon = pokemon;
            System.out.println("POKEMON STORED IN POKEBALL: " + pokemon.pokemonInfo());
        } else {
            System.out.println("POKEBALL FULL");
        }
    }

    public Pokemon releasePokemon() {
        if (pokemon != null) {
            pokemon = null;
            System.out.println("Pokemon Released: " + pokemon.pokemonInfo());
        } else {
            System.out.println("There was nothing in the Pokeball to release");
        }
        return pokemon;
    }

    public void showPokemon() {
        System.out.println(pokemon.pokemonInfo());
    }

}
