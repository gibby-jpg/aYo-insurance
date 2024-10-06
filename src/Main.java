import java.util.Scanner;

public class Main {
    public static void welcome() {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to aYo Recharge with care. \n" +
                "Get cover when buying airtime\n" +
                "1. Sign up\n" +
                "2. Agent Assisted Sign Up\n" +
                "3. What is Recharge with care\n" +
                "4. Claim\n" +
                "0. Exit");
        input = scanner.nextInt();
        switch (input) {
            case 1: System.out.println("Choose Cover\n" +
                            "1. My Hospital\n" +
                            "2. My Life\n" +
                            "3. Both\n" +
                            "0. Back");
                    input = scanner.nextInt();
                    if (input == 1) {
                        Hospital hospital = new Hospital();
                    } else if (input == 2) {
                        Life life = new Life();
                    } else if (input == 3) {
                        Both both = new Both();
                    } else {
                        welcome();
                    }
                    break;

            case 2: System.out.println("This is for agent assisting with Sign Up\n" +
                    "Please enter your code: ");
                    input = scanner.nextInt();
                    System.out.println("Sorry Agent does not exist");
                    welcome();
                    break;
        }
    }
    public static void main(String[] args) {
        welcome();
    }
}