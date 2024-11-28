public class mainMenu {
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String PURPLE = "\u001B[35m";
    public static final String BOLD = "\u001B[1m";
    public static final String BLINK = "\u001B[5m";

    public static void loadingAnimation() throws InterruptedException {
        String[] loadingDots = {"|", "/", "-", "\\"};
        for (int i = 0; i < 10; i++) {
            System.out.print("\rLoading " + loadingDots[i % 4]);
            Thread.sleep(200);
        }
        System.out.println("\rLoading Complete!     ");
    }

    public static void sessionHandler(){
        int sessions;

    }

    public static void main(String[] args) throws InterruptedException {
        // Display the ASCII logo
        Logo.displayLogo();

        // Display Welcome Message
        System.out.println(CYAN + BOLD + "Welcome to the Cyber-Attendance-Manager!" + RESET);

        // Run loading animation
        loadingAnimation();

        // Display Main Menu
        mainMenu.displayMenu();
    }
}
