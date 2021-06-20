import java.util.Scanner;

public class MenuSystem {
    private Scanner scanner = new Scanner(System.in);
    private Pokeball pokeball = new Pokeball();
    private PokemonManagementSystem pokemonManagementSystem = new PokemonManagementSystem();
    private Randomisor randomisor = new Randomisor();

    private Bag bag = new Bag();

    public void startMenu() {
        System.out.println("Type in 1, CATCH WILD POKEMON \nType in 2, DISPLAY INVENTORY \nType in 3, BATTLE");
        while (true) {
            String text = scanner.next();
            if (text.equalsIgnoreCase("1")) {
                System.out.println("Looking for  wild Pokemon ... ");
                pokemonManagementSystem.findRandomPokemon();
                pokemonCatchMenu();
            } else if (text.equalsIgnoreCase("2")) {
                System.out.println("displaying everything inside bag");
                pokemonManagementSystem.displayInventory();
            } else if (text.equalsIgnoreCase("3")) {
                System.out.println("starting battle system");
            } else {
                System.out.println("invalid input, try again");
            }
        }
    }

    public void pokemonCatchMenu() {
        System.out.println("Type in 1, CONFIRM\nType in 2, BACK TO MAIN MENU");
        String text = scanner.next();
        if (text.equals("1")) {
            System.out.println("Pokemon Captured and placed in INVENTORY");
            pokemonManagementSystem.addPokeballToBag();
            startMenu();
        } else if (text.equals("2")) {
            startMenu();
        }
    }
}


