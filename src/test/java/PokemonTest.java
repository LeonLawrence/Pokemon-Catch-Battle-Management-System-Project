import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokemonTest {

    @Test
    public void shouldDeductHealth() {
        Pokemon pokemon = new Pokemon("Pikachu", 100);
        pokemon.deductHealth2();
        assertEquals("NAME: Pikachu\tHEALTH: 80", pokemon.pokemonInfo());
    }

    @Test
    public void shouldPrintHealthStatus() {
        Pokemon myPokemon = new Pokemon("Pig", 100);
        System.out.println(myPokemon.healthStatus());
        myPokemon.deductHealth2();
        System.out.println(myPokemon.healthStatus());
    }

    @Test
    public void battleValidation() {
        Bag bag = new Bag();
        System.out.println(bag.bagIsFull());
        System.out.println(!bag.bagIsFull());
    }

}
