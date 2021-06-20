public class Randomisor {
    private PokemonManagementSystem pokemons;
    private int index;

//    public void randomPokemonPickertest(PokemonManagementSystem pokemonManagementSystem) {
//        int index = (int) (Math.random() * pokemonManagementSystem.pokemons.size());
//        System.out.println("index: " + index);
//        System.out.println("Pokemon size: " + pokemonManagementSystem.pokemons.size());
//        System.out.println("A wild pokemon appeared: " + pokemonManagementSystem.pokemons.get(index).pokemonInfo());
//    }

    public void randomPokemonPicker(PokemonManagementSystem pokemonManagementSystem) {
        index = (int) (Math.random() * pokemonManagementSystem.getPokemonIndexSize());
//        System.out.println("index: " + index);
    }

    int getPokemonIndex() {
        return this.index;
    }

}

