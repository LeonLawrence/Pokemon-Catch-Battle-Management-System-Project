public class Randomisor {
//    public void randomPokemonPickertest(PokemonManagementSystem pokemonManagementSystem) {
//        int index = (int) (Math.random() * pokemonManagementSystem.pokemons.size());
//        System.out.println("index: " + index);
//        System.out.println("Pokemon size: " + pokemonManagementSystem.pokemons.size());
//        System.out.println("A wild pokemon appeared: " + pokemonManagementSystem.pokemons.get(index).pokemonInfo());
//    }

    public int randomPokemonPicker(int size) {
        return (int) (Math.random() * size);
    }

}

