package view;

import controller.PokemonManagementSystem;
import database.Database;
import model.Pokeball;
import model.Pokemon;

import java.util.Scanner;

public class MenuSystem {

    private Scanner scanner = new Scanner(System.in);
    private Database database = new Database();
    private PokemonManagementSystem pokemonManagementSystem = new PokemonManagementSystem();
    private BattleSystemView battleSystem = new BattleSystemView();

    public void startMenu() {
        System.out.println("\nType in 1, CATCH POKEMON\nType in 2, VIEW INVENTORY\nType in 3, FIND BATTLE");

        while (true) {
            String text = scanner.next();

            if (text.equals("1")) {
                Pokemon pokemon = database.findRandomPokemon();
                Pokeball pokeball = new Pokeball();
                pokeball.catchPokemon(pokemon);
                pokemonCatchMenu(pokeball);

            } else if (text.equals("2")) {
                System.out.println("YOUR INVENTORY: ");
                pokemonManagementSystem.getPokeballPokemonDetail();
                startMenu();
            } else if (text.equals("3")) {
                battleStartMenu();
            } else {
                System.out.println("ENTRY NOT VALID");
            }
        }
    }

    public void pokemonCatchMenu(Pokeball pokeball) {
        System.out.println("\nType in 1, CONFIRM CAPTURE\nType in 2, BACK TO MAIN MENU");

        String text = scanner.next();
        if (text.equals("1")) {
            System.out.println("\nPOKEMON CAPTURED AND PLACED IN INVENTORY");
            pokemonManagementSystem.addPokeballToBag(pokeball);
            battleSystem.changeBagStatus();
            startMenu();
        } else if (text.equals("2")) {
            startMenu();
        } else {
            System.out.println("ENTRY NOT VALID");
        }
    }

    public void battleStartMenu() {
        System.out.println("Type in 1, CONFIRM BATTLE\nType in 2, BACK TO MAIN MENU");

        while (true) {
            String text = scanner.next();
            if (text.equalsIgnoreCase("1")) {
                battleSystem.battleSystemValidation();
            } else if (text.equalsIgnoreCase("2")) {
                startMenu();
            } else {
                System.out.println("ENTRY NOT VALID");
            }
        }
    }
}