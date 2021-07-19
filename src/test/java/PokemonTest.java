import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokemonTest {

    @Test
    public void shouldDeductHealth() {
        Pokemon pokemon = new Pokemon("Pikachu", 100);
        System.out.println(pokemon.pokemonInfo());
        assertEquals("NAME: Pikachu\tHEALTH: 100", pokemon.pokemonInfo());
        pokemon.deductHealth();
        System.out.println(pokemon.pokemonInfo());
        assertEquals("NAME: Pikachu\tHEALTH: 80", pokemon.pokemonInfo());
    }

}
