import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Hospital {
    public void date(){
        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDate birthDate;
        boolean validDate = false;
        while (!validDate) {
            try {
                // Request date of birth from the user
                System.out.print("Please enter your date of birth (ddMMyyyy): ");
                String dobInput = in.nextLine();

                // Parse the date of birth
                birthDate = LocalDate.parse(dobInput, formatter);

                // Calculate the user's age
                LocalDate currentDate = LocalDate.now();
                int age = Period.between(birthDate, currentDate).getYears();

                // Check if age is between 18 and 65
                if (age >= 18 && age <= 65) {
                    validDate = true;
                    Amount();
                } else {
                    System.out.println("You must be between 18 and 65 years old. Your age is: " + age);
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter your date of birth in ddMMyyyy format.");
            }
        }
    }
    int input;
    public void Amount(){
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Choose your premium Amount for Hospital cover:
                1. GHC 1
                2. GHC 2
                3. GHC 3
                4. GHC 4
                5. GHC 5
                6. GHC 6""");
        input = in.nextInt();
        switch (input){
            case 1: System.out.println("""
                    A premium of GHC 1 will be deducted
                    everytime you recharge.
                    1. Accept
                    0. Back""");
                    input = in.nextInt();
                    if (input == 1){
                        premium1();
                    }else{
                        Amount();
                    }
            break;
            case 2: System.out.println("""
                    A premium of GHC 2 will be deducted
                    everytime you recharge.
                    1. Accept
                    0. Back""");
                input = in.nextInt();
                if (input == 1){
                    premium2();
                }else{
                    Amount();
                }
            break;
            case 3: System.out.println("""
                    A premium of GHC 3 will be deducted
                    everytime you recharge.
                    1. Accept
                    0. Back""");
                input = in.nextInt();
                if (input == 1){
                    premium3();
                }else{
                    Amount();
                }
            break;
            case 4: System.out.println("""
                    A premium of GHC 4 will be deducted
                    everytime you recharge.
                    1. Accept
                    0. Back""");
                input = in.nextInt();
                if (input == 1){
                    premium4();
                }else{
                    Amount();
                }
                break;
            case 5: System.out.println("""
                    A premium of GHC 5 will be deducted
                    everytime you recharge.
                    1. Accept
                    0. Back""");
                input = in.nextInt();
                if (input == 1){
                    premium5();
                }else{
                    Amount();
                }
            break;
            case 6: System.out.println("""
                    A premium of GHC 6 will be deducted\s
                    everytime you recharge.
                    1. Accept
                    0. Back""");
                input = in.nextInt();
                if (input == 1){
                    premium6();
                }else{
                    Amount();
                }
                break;
        }
    }
    public void premium1(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                You will enjoy a benefit of GHC 20 per night
                whenever you file for MyHospital claim T&C.
                1. Continue
                0. Back""");
        input = in.nextInt();
        if (input == 1){
            CareTaker();
        }else{
            Amount();
        }
    }
    public void premium2(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                You will enjoy a benefit of GHC 40 per night
                whenever you file for MyHospital claim T&C.
                1. Continue
                0. Back""");
        input = in.nextInt();
        if (input == 1){
            CareTaker();
        }else{
            Amount();
        }
    }
    public void premium3(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                You will enjoy a benefit of GHC 60 per night
                whenever you file for MyHospital claim T&C.
                1. Continue
                0. Back""");
        input = in.nextInt();
        if (input == 1){
            CareTaker();
        }else{
            Amount();
        }
    }
    public void premium4(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                You will enjoy a benefit of GHC 80 per night
                whenever you file for MyHospital claim T&C.
                1. Continue
                0. Back""");
        input = in.nextInt();
        if (input == 1){
            CareTaker();
        }else{
            Amount();
        }
    }
    public void premium5(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                You will enjoy a benefit of GHC 100 per night
                whenever you file for MyHospital claim T&C.
                1. Continue
                0. Back""");
        input = in.nextInt();
        if (input == 1){
            CareTaker();
        }else{
            Amount();
        }
    }
    public void premium6(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                You will enjoy a benefit of GHC 120 per night
                whenever you file for MyHospital claim T&C.
                1. Continue
                0. Back""");
        input = in.nextInt();
        if (input == 1){
            CareTaker();
        }else{
            Amount();
        }
    }
    public void CareTaker(){
        int input; //String fname; String lname;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Thank You. Do you want to add a Caretaker? (Must be between 18 and 65 yrs old)
                1. Yes
                2. No
                3. What is Caretaker?""");
        input = in.nextInt();
        if (input == 1){
            System.out.println("What is the first name of Caretaker?");
            String fname = in.nextLine();
            System.out.println("What is the last name of Caretaker?");
            String lname = in.nextLine();
            System.out.println("Enter the Date of birth of Caretaker?(ddmmyy)");
            date();
        }else if (input == 2){
        accept();
        }
    }
    public static void accept(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Accept our T&C (available at ayo.com.gh), agree that\s
                MTN can shara your data with aYo & confirm you are between 18 and 65 yrs old
                1. Accept
                2. Reject""");
        input = in.nextInt();
        if (input == 1){
            lastpage();
        }else{
            return;
        }
    }
    public static void lastpage(){
        System.out.println("Welcome to aYo! Keep recharging your airtime to accumulate higher\n" +
                "cover. Please visit www.ayo.com.gh to view T&Cs.");
    }
    Hospital() {
        Scanner in = new Scanner(System.in);
        String fname;
        String lname;
        System.out.println("Please enter your first name: ");
        fname = in.nextLine();
        System.out.println("Please enter your last name: ");
        lname = in.nextLine();
        System.out.println("Please enter your date of birth (ddmmyyyy) (must be between 18 and 65)");
        date();
    }
}
