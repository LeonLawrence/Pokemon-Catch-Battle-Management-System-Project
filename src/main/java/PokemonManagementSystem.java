import java.util.ArrayList;

public class PokemonManagementSystem {
    private ArrayList<Pokemon> pokemons = new ArrayList<>();

    private void pokemonCreator() {
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

    public void randomPokemonPicker() {
        pokemonCreator();
        int index = (int) (Math.random() * pokemons.size());

        System.out.println("A wild pokemon appeared: "
                + pokemons.get(index).pokemonInfo());
    }
}
