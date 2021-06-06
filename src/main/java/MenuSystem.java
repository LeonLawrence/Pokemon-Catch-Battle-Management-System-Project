import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.Locale;
import java.util.Scanner;

public class MenuSystem {
    private Scanner scanner = new Scanner(System.in);

    public void userInput() {
        while (true) {
            System.out.println("Type in 1, CATCH WILD POKEMON \nType in 2, DISPLAY INVENTORY \nType in 3, BATTLE");

            if (scanner.nextInt() == 1) {
                System.out.println("catch pokemon");
            } else {
                System.out.println("invalid input, try again");
            }
        }
    }
    }

