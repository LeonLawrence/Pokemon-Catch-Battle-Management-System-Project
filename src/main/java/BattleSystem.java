public class BattleSystem {

    public Pokeball pokeball;

    public void userPokemon() {
        System.out.println("Your Turn To Make A Move");

    }

    public void cpuPokemon() {
        System.out.println("Opponent Turn To Make A Move");

    }

    public void deductHealth() {

    }

    public void releasePokemonToBattle() {
//        pokeball.releasePokemon();
    }

    public void deductHealthFromPokemon() {
        Pokemon pokemon = new Pokemon();
        pokemon.deductHealth();
    }
}