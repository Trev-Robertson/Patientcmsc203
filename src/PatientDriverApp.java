import java.util.Scanner;

public class PatientDriverApp {
  final private static Scanner KEYBOARD = new Scanner(System.in);
  final private static String FIRST_NAME__STRING = "First Name";
  final private static String MIDDLE_NAME__STRING = "Middle Name";
  final private static String LAST_NAME__STRING = "Last Name";
  final private static String STREET_ADDRESS_STRING = "Street Address";
  final private static String CITY_STRING = "City";
  final private static String STATE__STRING = "State";
  final private static String FIVE_DIGIT_ZIPCODE = "5-digit Zipcode";
  final private static String PATIENT_PHONE_STRING = "10 digit Phone Number (no spaces or dashes)";
  final private static String EMERGENCY_NAME_STRING = "Emergency Contact Name";
  final private static String EMERGENCY_NUMBER_STRING = "10 digit Emergency Contact Number (no spaces or dashes)";
  final private static String INVALID_STRING_INPUT = "Invalid input, please enter %s again.";
  final private static String PROCEDURE_NAME_STRING = "Procedure Name";
  final private static String PROCEDURE_DATE_STRING = "Date (MM/dd/yyy)";
  final private static String PRACTITIONER_STRING = "Practitioner";
  final private static String CHARGE_STRING = "Charge";

  public static void main(String[] args) {
    Patient newPatient = new Patient();
  
    Procedure procedure1 = new Procedure();
    Procedure procedure2 = new Procedure();
    Procedure procedure3 = new Procedure();
    System.out.println("""
        "Welcome to Patient Records.

        Please enter the following patient information:
          """);
    
    createNewPatient(newPatient);
    System.out.println();
    createProcedure(procedure1);
    createProcedure(procedure2);
    createProcedure(procedure3);

    System.out.println("\nPatient info:");
    displayPatient(newPatient);
    System.out.println();
    displayProcedures(procedure1, procedure2, procedure3);
    System.out.println();
    displayTotalProceduresCost(procedure1, procedure2, procedure3);
    System.out.print("""
        \n
        Student Name: Trevahr Robertson
        MC#: M21240049
        Due Date: 10/03/2025\n\n
        """);

  }

  public static void displayTotalProceduresCost(Procedure proc1ForCost, Procedure proc2ForCost, Procedure proc3ForCost) {
    System.out.printf("%nTotal Charges: $%s", proc1ForCost.getCharge() + proc2ForCost.getCharge() + proc3ForCost.getCharge());
  }

  public static void displayProcedures(Procedure proc1, Procedure proc2, Procedure proc3){
    System.out.printf("%s%n%n%s%n%n%s", proc1.toString(), proc2.toString(), proc3.toString());
  }
  
  public static String calculateTotalCharges(String charge1, String charge2, String charge3) {
    return charge1;
  }

  public static  void displayPatient(Patient finishedPatient) {
     System.out.println(finishedPatient.toString());
  }

  private static void createNewPatient(Patient newPatient) {
    newPatient.setFirstName(inputValidationLoop(FIRST_NAME__STRING));
    System.out.println();
    newPatient.setMiddleName(inputValidationLoop(MIDDLE_NAME__STRING));
    System.out.println();
    newPatient.setLastName(inputValidationLoop(LAST_NAME__STRING));
    System.out.println();
    newPatient.setStreetAddress(inputValidationLoop(STREET_ADDRESS_STRING));
    System.out.println();
    newPatient.setCity(inputValidationLoop(CITY_STRING));
    System.out.println();
    newPatient.setState(inputValidationLoop(STATE__STRING));
    System.out.println();
    newPatient.setZipcode(intNumberInputLoop(FIVE_DIGIT_ZIPCODE, 5));
    newPatient.setPhoneNumber(intNumberInputLoop(PATIENT_PHONE_STRING, 10));
    System.out.println();
    newPatient.setEmergencyContactName(inputValidationLoop(EMERGENCY_NAME_STRING));
    System.out.println();
    newPatient.setEmergencyContactNumber(intNumberInputLoop(EMERGENCY_NUMBER_STRING, 10));
  }

    

  private static void createProcedure(Procedure newProcedure) {
    System.out.println();
    System.out.println("\nEnter Procedure information.\n");
    newProcedure.setProcedureName(inputValidationLoop(PROCEDURE_NAME_STRING));
    System.out.println();
    newProcedure.setDate(inputValidationLoop(PROCEDURE_DATE_STRING));
    System.out.println();
    newProcedure.setPractitionerName(inputValidationLoop(PRACTITIONER_STRING));
    System.out.println();
    newProcedure.setCharge(numberInputLoop(CHARGE_STRING));
  }

  private static String inputValidationLoop(String stringToLoop) {
    while (true) {
      System.out.print(stringToLoop + ":  ");
      String input = KEYBOARD.nextLine().strip();
      if (!input.isBlank()) {
        return input;
      }
      System.out.printf("%n" + INVALID_STRING_INPUT + "%n%n", stringToLoop);
    }
  }

  private static double numberInputLoop(String promptToShow) {
    while (true) {
      System.out.print(promptToShow + ":  ");
      String userNumberInput = KEYBOARD.nextLine().strip();
      if (userNumberInput.isBlank()) {
        System.out.printf("%n" + INVALID_STRING_INPUT + "%n%n", promptToShow);
        continue;
      }
      try {
          System.out.println();
          return Double.parseDouble(userNumberInput);
      } catch (NumberFormatException | NullPointerException e) {
        System.out.printf("%n" + INVALID_STRING_INPUT + "%n%n", promptToShow);
      }

    }
  }
  

  
  private static int intNumberInputLoop(String promptToShow, int digitsNeeded) {
    while (true) {
      System.out.print(promptToShow + ":  ");
      String userNumberInput = KEYBOARD.nextLine().strip();
      if (userNumberInput.isBlank() || userNumberInput.length() != digitsNeeded) {
        System.out.printf("%n" + INVALID_STRING_INPUT + "%n%n", promptToShow);
        continue;
      }
      try {
          System.out.println();
          return Integer.parseInt(userNumberInput);
      } catch (NumberFormatException | NullPointerException e) {
        System.out.printf("%n" + INVALID_STRING_INPUT + "%n%n", promptToShow);
      }

    }
  }

  public static String phoneNumberBuilder(double tenDigitNumber) {
    String phoneToString = String.valueOf(tenDigitNumber);
    return phoneToString.substring(0,3) 
                                    + "-" + phoneToString.substring(3,6)
                                    + "-" + phoneToString.substring(6);
  }


}
