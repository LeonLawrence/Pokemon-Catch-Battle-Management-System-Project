public class ProgramPauseService {

    public static void main(String[] args) {
//        System.out.println("HELLO TEST");
//        System.out.println("PAUSE TEST");
//        sleep(5000);
//        System.out.println("MY NAME IS LEON TEST");
    }

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {}

    }

    public static void pause_2S() {
        sleep(2000);
    }

    public static void pause_3S() {
        sleep(3000);
    }

    public static void pause_4S() {
        sleep(4000);
    }

    public void consoleLoadingScreen() {
        for(int i  = 0; i < 6; i++) {
            pause_3S();
            System.out.print("...");
        }
    }
}
