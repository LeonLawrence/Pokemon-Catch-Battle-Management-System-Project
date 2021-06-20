import java.awt.*;
import java.util.ArrayList;

public class PokemonManagementSystem {
    private int index;
    public ArrayList<Pokemon> pokemons = new ArrayList<>();
    private Bag bag1 = new Bag();
    private Pokeball pokeBall1 = new Pokeball();
    private Pokeball pokeBall2 = new Pokeball();
    private Pokeball pokeBall3 = new Pokeball();
    private Randomisor randomisor = new Randomisor();
    //    private Pokeball pokeBall2 = new Pokeball();
    private MenuSystem menuSystem;

    public void pokemonCreator() {
//        while(true) {
//            pokemons.add(new Pokemon("Pikachu", 100));
//            System.out.println(pokemons.size());
//        }

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
        Pokemon pokemon11 = new Pokemon("Dito", 100);

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

    public void findRandomPokemon() {
        pokemonCreator();
        randomisor.randomPokemonPicker(this);
        getPokemonDetails();
//        bag1.addPokeball(pokeBall1);
//        System.out.println("Pokemon size: " + pokemons.size());
//        System.out.println("A wild pokemon appeared: " + pokemons.get(index).pokemonInfo());

    }

    public void getPokemonDetails() {
        System.out.println("A wild pokemon appeared: " + pokemons.get(randomisor.getPokemonIndex()).pokemonInfo());
//        System.out.println("index: " + randomisor.getPokemonIndex());
//        System.out.println("Pokemon size: " + pokemons.size());
    }


    public void displayInventory() {
        bag1.showPokeballInBag();
    }

    public int getPokemonIndexSize() {
        return pokemons.size();
    }

}
