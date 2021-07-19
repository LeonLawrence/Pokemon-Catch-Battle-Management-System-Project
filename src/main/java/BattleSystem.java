import java.util.Scanner;

public class BattleSystem {
    PokemonManagementSystem pokemonManagementSystem = new PokemonManagementSystem();
    Bag bag;

    public void userPokemon() {
        System.out.println("YOUR SELECTED POKEMON TO BATTLE");
        bag.showFirstPokemonIndexFromPokeball();
    }

    public void cpuPokemon() {
        Pokemon pokemon = pokemonManagementSystem.findRandomPokemon();
        pokemon.pokemonInfo();
        System.out.println("CPU PLAYER: " + pokemon.pokemonInfo());
        pokemon.deductHealth();
        System.out.println("CPU PLAYER: " + pokemon.pokemonInfo());
    }



    public void battleStart() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();





    }
}
