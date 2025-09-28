import java.util.Scanner;
import java.util.UUID;

public class PatientDriverApp {
  final private Scanner KEYBOARD = new Scanner(System.in);
  final private String CURRENT_USER = "";

  public static void main(String[] args) {
    String menuSelection = "";
    int intMenuSelection = 0;
    Scanner keyboard = new Scanner(System.in);

    while (true) {
      Boolean exitToMenu = false;

      System.out.println("""
          "Welcome to Patient Records.
          Please select a number from the the following options:

            1. Create new Patient.
            2. Edit Patient
            3. Show Current User Information
            4. EXIT.

            """);

      menuSelection = keyboard.nextLine();
      try {
        intMenuSelection = Integer.parseInt(menuSelection);
      } catch (NumberFormatException e) {
        System.out.println("Invalid Entry\n Please choose again.");
        continue;
      }

      switch (Integer.parseInt(menuSelection)) {
        case 1:
          createNewPatient();
          break;
        case 2:
          break;
        case 3:
          break;
        default:
          exitToMenu = true;
          System.out.println("Invalid Entry\n Please choose again.");
          continue;
      }

    }

  }

  private static void createNewPatient() {
    Patient patient = new Patient();

    System.out.println("New Patient Intake\n\n");

    System.out.println("First Name:");
    patient.setFirstName(keyboard.nextLine());

    System.out.println("\nMiddle Name:");
    patient.setMiddleName(keyboard.nextLine());

    System.out.println("\nLast Name:");
    patient.setLastName(keyboard.nextLine());

    System.out.println("\nStreet Address");
    patient.setStreetAddress(keyboard.nextLine());

    System.out.println("\ncity");
    patient.setCity(keyboard.nextLine());

    System.out.println("\nState");
    patient.setState(keyboard.nextLine());

    System.out.println("\nZipcode");
    patient.setZipcode(keyboard.nextLine());

    System.out.println("\nPhone Number");
    patient.setPhoneNumber(keyboard.nextLine());

    System.out.println("\nEmergency Contact Name");
    patient.setEmergencyContactName(keyboard.nextLine());

    System.out.println("\nEmergency Contact Number");
    patient.setEmergencyContactName(keyboard.nextLine());

    createProcedures();

  }

  private void createProcedures() {
    key
  }

  public void displayPatient() {

  }
  
  public void displayProcedure() {

  }
  
  public String calculateTotalCharges(String charge1, String charge2, String charge3) {
    return charge1;
  }

}
