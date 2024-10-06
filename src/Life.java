import java.net.ProtocolFamily;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Life {
    public void date(){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDate birthDate = null;
        boolean validDate = false;
        while (!validDate) {
            try {
                // Request date of birth from the user
                System.out.print("Please enter your date of birth (ddMMyyyy): ");
                String dobInput = sc.nextLine();

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
    public void Amount() {

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Choose your premium Amount for Hospital cover:
                1. GHC 1
                2. GHC 2
                3. GHC 3
                4. GHC 4
                5. GHC 5
                6. GHC 6""");
        input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("""
                        A premium of GHC 1 will be deducted
                        everytime you recharge.
                        1. Accept
                        0. Back""");
                input = sc.nextInt();
                if (input == 1) {
                    premium1();
                } else {
                    Amount();
                }
                break;
            case 2:
                System.out.println("""
                        A premium of GHC 2 will be deducted
                        everytime you recharge.
                        1. Accept
                        0. Back""");
                if (input == 1) {
                    premium2();
                } else {
                    Amount();
                }
                break;
            case 3:
                System.out.println("""
                        A premium of GHC 3 will be deducted
                        everytime you recharge.
                        1. Accept
                        0. Back""");
                if (input == 1) {
                    premium3();
                } else {
                    Amount();
                }
                break;
            case 4:
                System.out.println("""
                        A premium of GHC 4 will be deducted
                        everytime you recharge.
                        1. Accept
                        0. Back""");
                if (input == 1) {
                    premium4();
                } else {
                    Amount();
                }
                break;
            case 5:
                System.out.println("""
                        A premium of GHC 5 will be deducted
                        everytime you recharge.
                        1. Accept
                        0. Back""");
                if (input == 1) {
                    premium5();
                } else {
                    Amount();
                }
                break;
            case 6:
                System.out.println("""
                        A premium of GHC 6 will be deducted
                        everytime you recharge.
                        1. Accept
                        0. Back""");
                if (input == 1) {
                    premium6();
                } else {
                    Amount();
                }
                break;
        }
    }
        public void premium1(){
            int input;
            Scanner in = new Scanner(System.in);
            System.out.println("""
                    You will enjoy a benefit of GHC 1000
                    whenever you file for MyLife claim T&C.
                    1. Continue
                    0. Back""");
            input = in.nextInt();
            if (input == 1){
                Family();
            }else{
                Amount();
            }
        }
        public void premium2(){
            int input;
            Scanner in = new Scanner(System.in);
            System.out.println("""
                    You will enjoy a benefit of GHC 2000
                    whenever you file for MyLife claim T&C.
                    1. Continue
                    0. Back""");
            input = in.nextInt();
            if (input == 1){
                Family();
            }else{
                Amount();
            }
        }
        public void premium3(){
            int input;
            Scanner in = new Scanner(System.in);
            System.out.println("""
                    You will enjoy a benefit of GHC 3000
                    whenever you file for MyLife claim T&C.
                    1. Continue
                    0. Back""");
            input = in.nextInt();
            if (input == 1){
                Family();
            }else{
                Amount();
            }
        }
        public void premium4(){
            int input;
            Scanner in = new Scanner(System.in);
            System.out.println("""
                    You will enjoy a benefit of GHC 4000
                    whenever you file for MyLife claim T&C.
                    1. Continue
                    0. Back""");
            input = in.nextInt();
            if (input == 1){
                Family();
            }else{
                Amount();
            }
        }
        public void premium5(){
            int input;
            Scanner in = new Scanner(System.in);
            System.out.println("""
                    You will enjoy a benefit of GHC 5000 per night
                    whenever you file for MyLife claim T&C.
                    1. Continue
                    0. Back""");
            input = in.nextInt();
            if (input == 1){
                Family();
            }else{
                Amount();
            }
        }
        public void premium6(){
            int input;
            Scanner in = new Scanner(System.in);
            System.out.println("""
                    You will enjoy a benefit of GHC 6000 per night
                    whenever you file for MyLife claim T&C.
                    1. Continue
                    0. Back""");
            input = in.nextInt();
            if (input == 1){
                Family();
            }else{
                Amount();
            }
        }
    public void Family(){
        int input;
        Scanner in = new Scanner(System.in);
        String fname; String lname; String num; String dobInput = "";
        System.out.println("""
                Thank You. Do you want to cover a family member?(Must be between 18 and 65 yrs old)
                1. Yes
                2. No
                3. What is a family member?""");
        input = in.nextInt();
        if (input == 1){
        System.out.println("Enter the firstname of family member");
        fname = in.nextLine();
        System.out.println("Enter the lastname of family member");
        lname = in.nextLine();
        System.out.println("Enter the date of birth of family member(ddmmyyyy) must be between 18 and 65 yrs old");
        date();
        System.out.println("Enter phone number of family member");
        num = in.nextLine();
        System.out.println("Please confirm the family member details:\n" +
                "Name: "+fname + " "+ lname+"\n" +
                "dob: "+dobInput+"\n" +
                "Number: "+num+"\n" +
                "1. Confirm\n" +
                "0. Back");
            input = in.nextInt();
                if (input == 1){
                    beneficiary();
                }else{
                    Amount();
                }
        }else if (input == 2){

        }else {

        }
    }
    public void beneficiary(){
        int input; String fname; String lname; String num; String dobInput = "";
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Do you want to cover a beneficiary?(Must be between 18 and 65 yrs old)
                1. Yes
                2. No
                3. What is beneficiary?""");
        input = in.nextInt();
        if (input == 1){
            System.out.println("Enter the firstname of beneficiary");
            fname = in.nextLine();
            System.out.println("Enter the lastname of beneficiary");
            lname = in.nextLine();
            System.out.println("Enter the date of birth of beneficiary(Must be between 18 and 65 yrs old)");
            date();
            System.out.println("Enter phone number of beneficiary");
            num = in.nextLine();
            System.out.println("Please confirm the family member details:\n" +
                    "Name: "+fname + " "+ lname+"\n" +
                    "dob: "+dobInput+"\n" +
                    "Number: "+num+"\n" +
                    "1. Confirm\n" +
                    "0. Back");
            input = in.nextInt();
            if (input == 1){
                CareTaker();
            }else{
                Amount();
            }
        }
    }
    public void CareTaker(){
        int input; String fname; String lname;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Thank You. Do you want to add a Caretaker? (Must be between 18 and 65 yrs old)
                1. Yes
                2. No
                3. What is Caretaker?""");
        input = in.nextInt();
        if (input == 1){
            System.out.println("What is the first name of Caretaker?");
            fname = in.nextLine();
            System.out.println("What is the last name of Caretaker?");
            lname = in.nextLine();
            System.out.println("Enter the Date of birth of Caretaker?(ddmmyy)");
            date();
        }else if (input == 2){
            Hospital.accept();
        }
    }
//    public void accept(){
//
//    }

    Life() {
        Scanner sc = new Scanner(System.in);
        String fname;
        String lname;
        System.out.println("Please enter your firstname");
        fname = sc.nextLine();
        System.out.println("Please enter your lastname");
        lname = sc.nextLine();
        System.out.println("Please enter your date of birth (ddmmyyyy) Must be between 18 and 65");
        date();
    }
}
