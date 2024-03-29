package view;

import controller.PokemonManagementSystem;
import model.Bag;
import model.Pokemon;
import service.Randomisor;

import java.util.Scanner;

public class BattleManagementSystem {
    private PokemonManagementSystem pokemonManagementSystem = new PokemonManagementSystem();
    private Randomisor.ProgramPauseService programPauseService = new Randomisor.ProgramPauseService();
    private Scanner scanner = new Scanner(System.in);
    private Bag bag = new Bag();

    private Pokemon cpuPokemon = pokemonManagementSystem.findRandomPokemon();
    private Pokemon playerPokemon = pokemonManagementSystem.findRandomPokemon();

    public void battleStart() {
        displayStartBattleDetailsMessage();
        displayUpdatedPokemonHealth();
        while (true) {
            userPokemon();
            cpuPokemon();
            if (playerPokemon.healthStatus() <= 0) {
                System.out.println("\nYOU LOST THE POKEMON BATTLE");
                defeatLoadingMenu();
            } else if (cpuPokemon.healthStatus() <= 0) {
                programPauseService.consoleLoadingScreen2S();
                System.out.println("\nCPU POKEMON FAILED TO ATTACK. DID NOT DO ANY DAMAGE...");
                System.out.println("YOU WON THE POKEMON BATTLE");
                defeatLoadingMenu();
            }
        }
    }

    public void displayStartBattleDetailsMessage() {
        System.out.println("WELCOME TO THE POKEMON BATTLE SYSTEM");
        System.out.println("LOADING UP BATTLE DETAILS");
        programPauseService.consoleLoadingScreen2S();
    }

    public void displayUpdatedPokemonHealth() {
        System.out.println("\n**UPDATED POKEMON DETAILS BELOW***");
        System.out.println("PLAYER POKEMON: " + playerPokemon.pokemonInfo());
        System.out.println("CPU POKEMON: " + cpuPokemon.pokemonInfo());
    }

    public void userPokemon() {
        while (true) {
            System.out.println("\nTYPE IN 1, TO ATTACK CPU");
            String text = scanner.next();
            if (text.equals("1")) {
                System.out.println("YOU ARE NOW ATTACKING");
                cpuPokemon.deductHealth2();
                displayUpdatedPokemonHealth();
                break;
            } else {
                System.out.println("ENTRY NOT VALID");
            }
        }
    }

    public void cpuPokemon() {
        while (true) {
            System.out.println("\nTYPE IN 1, CPU IS ATTACKING YOU, CONFIRM THIS ACTION");
            String text = scanner.next();
            if (text.equals("1")) {
                System.out.println("\nCPU POKEMON IS NOW ATTACKING");
                playerPokemon.deductHealth1();
                displayUpdatedPokemonHealth();
                break;
            } else {
                System.out.println("ENTRY NOT VALID");
            }
        }
    }

    public void defeatLoadingMenu() {
        System.out.println("RETURNING TO MAIN MENU");
        programPauseService.consoleLoadingScreen3S();
        MenuSystem menuSystem = new MenuSystem();
        menuSystem.startMenu();
    }

    public void battleSystemValidation() {
        if (!bag.bagIsFull()) {
            System.out.println("YOU NEED TO OBTAIN A POKEMON BEFORE YOU CAN USE THIS MODE");
            MenuSystem menuSystem = new MenuSystem();
            menuSystem.startMenu();
        } else {
            battleStart();
        }
    }

    public void changeBagStatus() {
        bag.changeBagStatus();
    }
}

