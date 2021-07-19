import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class BattleManagementSystem {
    PokemonManagementSystem pokemonManagementSystem = new PokemonManagementSystem();
    Pokemon pokemon;
    ProgramPauseService programPauseService = new ProgramPauseService();
    Bag bag;

    Scanner scanner = new Scanner(System.in);

    public void userPokemon() {
        System.out.println("YOUR POKEMON TO BATTLE");
        pokemonManagementSystem.getPokeballPokemonDetail();

    }

    public void cpuPokemon() {
        Pokemon cpuPokemon = pokemonManagementSystem.findRandomPokemon();
            ProgramPauseService programPauseService = new ProgramPauseService();
            for (int i = 0; i <= 5; i++) {
                System.out.println("CPU PLAYER: " + cpuPokemon.pokemonInfo());
                cpuPokemon.deductHealth();
                programPauseService.pause_2S();
            }

        System.out.println("CPU POKEMON DEAD");
        System.out.println("RETURNING TO MAIN MENU");
        programPauseService.consoleLoadingScreen();
        MenuSystem menuSystem = new MenuSystem();
        menuSystem.startMenu();
    }


    public void battleStart() {
        userPokemon();
        programPauseService.pause_2S();
        cpuPokemon();
    }
}
