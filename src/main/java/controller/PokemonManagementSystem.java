package controller;

import model.Bag;
import model.Pokeball;
import model.Pokemon;
import service.Randomisor;

import java.util.ArrayList;

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


