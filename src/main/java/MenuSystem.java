import java.util.Scanner;

public class MenuSystem {
    private Scanner scanner = new Scanner(System.in);
    private PokemonManagementSystem pokemonManagementSystem = new PokemonManagementSystem();

    public void startMenu() {
        System.out.println("Type in 1, CATCH WILD POKEMON \nType in 2, DISPLAY INVENTORY \nType in 3, BATTLE");

        while (true) {
            String text = scanner.next();
            if (text.equalsIgnoreCase("1")) {
                System.out.println("Looking for  wild Pokemon ... ");
                Pokemon pokemon = pokemonManagementSystem.findRandomPokemon();
                Pokeball pokeball = new Pokeball();
                pokeball.catchPokemon(pokemon);
                System.out.println(pokeball);
                pokemonCatchMenu(pokeball);
            } else if (text.equalsIgnoreCase("2")) {
                System.out.println("displaying everything inside bag");
                pokemonManagementSystem.displayInventory();
            } else if (text.equalsIgnoreCase("3")) {
                battleStartMenu();
            } else {
                System.out.println("invalid input, try again");
            }
        }
    }

    public void pokemonCatchMenu(Pokeball pokeball) {
        System.out.println("Type in 1, CONFIRM\nType in 2, BACK TO MAIN MENU");

        String text = scanner.next();
        if (text.equals("1")) {
            System.out.println("Pokemon Captured and placed in INVENTORY");
            pokemonManagementSystem.addPokeballToBag(pokeball);
            startMenu();
        } else if (text.equals("2")) {
            startMenu();
        }
    }

    public void battleStartMenu() {
        System.out.println("Type in 1, BATTLE RANDOM POKEMON \nType in 2, VIEW POKEMON'S IN YOUR BAG \nType in 3, BACK TO MAIN MENU");

        while (true) {
            String text = scanner.next();
            if (text.equalsIgnoreCase("1")) {
                System.out.println("starting battle system");
                pokemonManagementSystem.getPokeballPokemonDetails();


            } else if (text.equalsIgnoreCase("2")) {
                pokemonManagementSystem.getPokeballPokemonDetails();
            } else if (text.equalsIgnoreCase("3")) {
                startMenu();
            } else {
                System.out.println("invalid input, try again");
            }

        }

    }
}


