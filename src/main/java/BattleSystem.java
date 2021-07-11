public class BattleSystem {
    private Pokeball pokeball = new Pokeball();
    private PokemonManagementSystem pokemonManagementSystem = new PokemonManagementSystem();
    private Pokemon pokemon;

    public void userPokemon() {
        System.out.println("Your Turn To Make A Move");
        System.out.println("you have attacked");
        deductHealthFromPokemon();

    }

    public void cpuPokemon() {
        Pokemon pokemon = pokemonManagementSystem.findRandomPokemon();

        System.out.println("CPU: ");
        pokemon.pokemonInfo();
        System.out.println("Opponent attacked");
        pokemon.pokemonInfo();
        deductHealthFromPokemon();
    }

    public void deductHealthFromPokemon() {
        pokemon.deductHealth();
    }
}