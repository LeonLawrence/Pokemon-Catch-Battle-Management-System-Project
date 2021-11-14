package controller;

import model.Bag;
import model.Pokeball;

public class PokemonManagementSystem {

    private Randomisor randomisor = new Randomisor();
    private Bag bag = new Bag();

    public void addPokeballToBag(Pokeball pokeball) {
        bag.bagIsFull();
        bag.addPokeballToBag(pokeball);
    }

    public void getPokeballPokemonDetail() {
        bag.showPokemon();
    }

}


