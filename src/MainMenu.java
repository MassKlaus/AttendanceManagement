import java.util.Scanner;


public class mainMenu {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u001B[36mWelcome to CyberAttendance\u001B[0m");
        System.out.println("╔══════════════════════╗");
        System.out.println("║   Main-Login-Menu    ║");
        System.out.println("╠══════════════════════╣");
        System.out.println("║ 1. Check In          ║");
        System.out.println("║ 2. Check Out         ║");
        System.out.println("║ 3. View Attendance   ║");
        System.out.println("║ 4. Exit              ║");
        System.out.println("╚══════════════════════╝");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Check In.");
                break;
            case 2:
                System.out.println("You selected Check Out.");
                break;
            case 3:
                System.out.println("You selected View Attendance.");
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

public void login(){
    String pw = "test";
    boolean isLoggedin;
    int usrLoggedon = 0;
    Scanner pwscan = new Scanner(System.in);

    System.out.println("Please enter your login creds: ");
    if(pw == "test")
    {
        isLoggedin = true;
        usrLoggedon++;
    }
}

public String usr, usnm;

public void logout(){
    boolean isLoggedout = true;
    usr = usnm;
    System.out.println( usnm + " has logged out. Goodbye, " + usnm);
}

public void main() {

}
