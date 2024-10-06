import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Both {
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
    public void Amount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Choose your premium Amount for MyHospital cover:
                1. GHC 1
                2. GHC 2
                3. GHC 3
                4. GHC 4
                5. GHC 5
                6. GHC 6""");
        int input = sc.nextInt();

    }
public void Both(){
    Scanner sc = new Scanner(System.in);
    String fname; String lname; int input;
    System.out.println("Please enter your First name");
    fname = sc.nextLine();
    System.out.println("Please enter your Last name");
    lname = sc.nextLine();
    System.out.println("Please enter your date of birth (Must be between 18 and 65)");
    date();
    }
}
