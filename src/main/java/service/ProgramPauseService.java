package service;

public class ProgramPauseService {

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println("An error has occurred, please restart program.");
        }
    }

    private static void pause_2S() {
        sleep(2000);
    }

    private static void pause_3S() {
        sleep(3000);
    }

    public void consoleLoadingScreen3S() {
        for (int i = 0; i < 6; i++) {
            pause_3S();
            System.out.print("...");
        }
    }

    public void consoleLoadingScreen2S() {
        for (int i = 0; i < 6; i++) {
            pause_2S();
            System.out.print("...");
        }
    }
}
