import java.util.Scanner;

public class PatientDriverApp {
  final private static Scanner KEYBOARD = new Scanner(System.in);
  final private Object CURRENT_USER = null;

  public static void main(String[] args) {
    String menuSelection = "";
    int intMenuSelection = 0;
    Scanner KEYBOARD = new Scanner(System.in);

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

      menuSelection = KEYBOARD.nextLine();
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
    patient.setFirstName(KEYBOARD.nextLine());

    System.out.println("\nMiddle Name:");
    patient.setMiddleName(KEYBOARD.nextLine());

    System.out.println("\nLast Name:");
    patient.setLastName(KEYBOARD.nextLine());

    System.out.println("\nStreet Address");
    patient.setStreetAddress(KEYBOARD.nextLine());

    System.out.println("\ncity");
    patient.setCity(KEYBOARD.nextLine());

    System.out.println("\nState");
    patient.setState(KEYBOARD.nextLine());

    System.out.println("\nZipcode");
    patient.setZipcode(KEYBOARD.nextLine());

    System.out.println("\nPhone Number");
    patient.setPhoneNumber(KEYBOARD.nextLine());

    System.out.println("\nEmergency Contact Name");
    patient.setEmergencyContactName(KEYBOARD.nextLine());

    System.out.println("\nEmergency Contact Number");
    patient.setEmergencyContactName(KEYBOARD.nextLine());

    // createProcedures();

  }

  // private void createProcedures() {
  
  // }

  public void displayPatient() {

  }
  
  public void displayProcedure() {

  }
  
  public String calculateTotalCharges(String charge1, String charge2, String charge3) {
    return charge1;
  }

}
