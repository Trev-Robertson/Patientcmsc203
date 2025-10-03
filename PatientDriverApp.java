import java.util.Scanner;

public class PatientDriverApp {
  final private static Scanner KEYBOARD = new Scanner(System.in);

  // private static boolean isDateValid = false;

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
    // createProcedure(procedure2);
    // createProcedure(procedure3);

    System.out.println("Patient info:");
    displayPatient(newPatient);
  }
  

  public static void displayProcedure(Procedure proc1, Procedure proc2, Procedure proc3){
    System.out.println(proc1.toString());
    System.out.println(proc2.toString());
    System.out.println(proc3.toString());
  }
  
  public static String calculateTotalCharges(String charge1, String charge2, String charge3) {
    return charge1;
  }

  public static  String displayPatient(Patient finishedPatient) {
    return finishedPatient.toString();
  }

  private static void createNewPatient(Patient newPatient) {
    
    System.out.print("First Name:  ");
    newPatient.setFirstName(KEYBOARD.nextLine());

    System.out.print("\nMiddle Name:  ");
    newPatient.setMiddleName(KEYBOARD.nextLine());

    System.out.print("\nLast Name:  ");
    newPatient.setLastName(KEYBOARD.nextLine());

    System.out.print("\nStreet Address:  ");
    newPatient.setStreetAddress(KEYBOARD.nextLine());

    System.out.print("\nCity:  ");
    newPatient.setCity(KEYBOARD.nextLine());

    System.out.print("\nState:  ");
    newPatient.setState(KEYBOARD.nextLine());

    while (true) { 
      System.out.print("\n5-digit Zipcode:  ");
      String zipcode = KEYBOARD.nextLine();
    if (checkStringIsValidNumber(zipcode, 5)) {
        newPatient.setZipcode(zipcode);
        break;
      }
      else {
        System.out.print("Invalid entry, please try again\n");
      }
    }

    System.out.print("\nPhone Number (no spaces or dashes):  ");
    newPatient.setPhoneNumber(KEYBOARD.nextLine());

    System.out.print("\nEmergency Contact Name:  ");
    newPatient.setEmergencyContactName(KEYBOARD.nextLine());

    System.out.println("\n10 digit Emergency Contact Number:  ");
    newPatient.setEmergencyContactNumber(KEYBOARD.nextLine());
  }

    

  private static void createProcedure(Procedure newProcedure) {
    System.out.println("\nEnter Procedure information\n\n");

    System.out.println("Procedure Name:");
    newProcedure.setProcedureName(KEYBOARD.nextLine());

    System.out.println("\nDate");
    newProcedure.setDate((KEYBOARD.nextLine()));
      

    System.out.println("\nPractitioner:");
    newProcedure.setPractitionerName(KEYBOARD.nextLine());

    System.out.println("\nCharge: ");
    newProcedure.setCharge(KEYBOARD.nextLine());

  }


  private static boolean checkStringIsValidNumber(String stringToConvert, double desiredLength) {
    try {
      if (stringToConvert.length() == desiredLength) {
        Double.parseDouble(stringToConvert);
        return true;
      } else {
        return false;
      }
    } catch (NumberFormatException | NullPointerException e) {
      return false;
    }
  }
  
  // private static LocalDate dateFormatter(String dateAsString) {
  //   String datePattern = "MM/dd/yyyy";
  //   DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePattern);
  //   try {
  //     isDateValid = true
  //     return LocalDate.parse(dateAsString, formatter);
       
  //   } catch (IllegalArgumentException | DateTimeParseException e) {
  //     isDateValid = false
  //   }
  // }
  

}
