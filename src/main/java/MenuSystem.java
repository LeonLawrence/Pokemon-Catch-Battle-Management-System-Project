import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.Locale;
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
                pokemonManagementSystem.randomPokemonPicker();
            } else if (text.equalsIgnoreCase("2")) {
                System.out.println("displaying everything inside bag");

            } else if (text.equalsIgnoreCase("3")) {
                System.out.println("starting battle system");
            } else {
                System.out.println("invalid input, try again");
            }
        }
    }
}


