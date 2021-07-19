public class Pokeball {
    public Pokemon pokemon;

    public void catchPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
        System.out.println("\n**CONFIRM TO CATCH POKEMON**\n" + pokemon.pokemonInfo());
    }

    public void showPokemon() {
        System.out.println(pokemon.pokemonInfo());
    }

}
