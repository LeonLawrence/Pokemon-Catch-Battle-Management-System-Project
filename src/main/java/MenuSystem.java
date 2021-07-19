import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

class MenuSystem {

    private Scanner scanner = new Scanner(System.in);
    private PokemonManagementSystem pokemonManagementSystem = new PokemonManagementSystem();
    private BattleManagementSystem battleSystem = new BattleManagementSystem();


    public void startMenu() {
        System.out.println("\nType in 1, CATCH POKEMON\nType in 2, VIEW INVENTORY\nType in 3, FIND BATTLE");

        while (true) {
            String text = scanner.next();

            if (text.equals("1")) {
                Pokemon pokemon = pokemonManagementSystem.findRandomPokemon();
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
        System.out.println("Type in 1, CONFIRM CAPTURE\nType in 2, BACK TO MAIN MENU");

        String text = scanner.next();
        if (text.equals("1")) {
            System.out.println("\nPOKEMON CAPTURED AND PLACED IN INVENTORY");
            pokemonManagementSystem.addPokeballToBag(pokeball);
            startMenu();
        } else if (text.equals("2")) {
            startMenu();
        }
    }


    public void battleStartMenu() {
        System.out.println("Type in 1, CONFIRM BATTLE\nType in 2, BACK TO MAIN MENU");

        while (true) {
            String text = scanner.next();
            if (text.equalsIgnoreCase("1")) {
              battleSystem.battleStart();
            } else if (text.equalsIgnoreCase("2")) {
                startMenu();
            } else {
                System.out.println("invalid input, try again");
            }
        }

    }
}