package database;

import model.Pokemon;

import java.util.ArrayList;

public class Database {

    private ArrayList<Pokemon> pokemons = new ArrayList<>();


    public Database() {
        Pokemon pikachu = new Pokemon("Pikachu", 100);
        Pokemon charizard = new Pokemon("Charizard", 100);
        Pokemon eevee = new Pokemon("Eevee", 100);
        Pokemon snorlax = new Pokemon("Snorlax", 100);
        Pokemon squirtle = new Pokemon("Squirtle", 100);
        Pokemon lucario = new Pokemon("Lucario", 100);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 100);
        Pokemon gyarados = new Pokemon("Gyarados", 100);
        Pokemon jigglypuff = new Pokemon("Jigglypuff", 100);
        Pokemon dragonite = new Pokemon("Dragonite", 100);

        pokemons.add(pikachu);
        pokemons.add(charizard);
        pokemons.add(eevee);
        pokemons.add(snorlax);
        pokemons.add(squirtle);
        pokemons.add(lucario);
        pokemons.add(bulbasaur);
        pokemons.add(gyarados);
        pokemons.add(jigglypuff);
        pokemons.add(dragonite);
    }

    public Pokemon findRandomPokemon() {
        int pokemonIndex = randomPokemonPicker(getPokemonIndexSize());
        return pokemons.get(pokemonIndex);
    }

    public int getPokemonIndexSize() {
        return pokemons.size();
    }

    public int randomPokemonPicker(int size) {
        return (int) (Math.random() * size);
    }
}
