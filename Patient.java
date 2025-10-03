/**
 * Represents a patient containing personal and contact information.
 *
 * This class stores a patient's information such as name (first, middle, last), address
 * (street, city, state, zipcode), phone number, and an emergency contact
 * (name and phone number). It provides accessors and getters for each
 * field, as well as several methods to build formatted strings such as a patient's full name, address, and emergency contact details.
 *
 *
 * @author Trevahr Robertson
 */
public class Patient {
  private String firstName; // Patient's first name.
  private String middleName;// Patient's middle name.
  private String lastName;// Patient's last name.
  private String streetAddress;// Patient's street address.
  private String city;// Patient's city.
  private String state;// Patient's state.
  private String zipcode;// Patient's zip code.
  private String phoneNumber;// Patient's phone number.
  private String emergencyContactName;// Patient's emergency contact.
  private String emergencyContactNumber;// Patient's emergency contact's phone number.
  

  /**
   * Creates an empty Patient instance
   */
  public Patient() {

  }
  

  /**
   * Creates a Patient with first middle and last name.
   *
   * @param firstNameGiven the patient's first name
   * @param middleNameGiven the patient's middle name
   * @param lastNameGiven the patient's last name
   */
  public Patient(String firstNameGiven, String middleNameGiven, String lastNameGiven) {
    firstName = firstNameGiven;
    middleName = middleNameGiven;
    lastName = lastNameGiven;
  }

  /**
   * Creates a Patient with all available fields initialized.
   *
   * @param firstNameGiven the patient's first name
   * @param middleNameGiven the patient's middle name
   * @param lastNameGiven the patient's last name
   * @param streetAddressGiven the patient's street address
   * @param cityGiven the patient's city
   * @param stateGiven the patient's state
   * @param zipcodeGiven the patient's zipcode / postal code
   * @param phoneNumberGiven the patient's phone number
   * @param emergencyContactNameGiven the emergency contact's name
   * @param emergencyContactNumberGiven the emergency contact's phone number
   */
  public Patient(String firstNameGiven,
                String middleNameGiven,
                String lastNameGiven,
                String streetAddressGiven,
                String cityGiven,
                String stateGiven,
                String zipcodeGiven,
                String phoneNumberGiven,
                String emergencyContactNameGiven,
                String emergencyContactNumberGiven) 
{
  firstName = firstNameGiven;
  middleName = middleNameGiven;
  lastName = lastNameGiven;
  streetAddress = streetAddressGiven;
  city = cityGiven;
  state = stateGiven;
  zipcode = zipcodeGiven;
  phoneNumber = phoneNumberGiven;
  emergencyContactName = emergencyContactNameGiven;
  emergencyContactNumber = emergencyContactNumberGiven;
}
  
  /**
   * Builds a full name string by concatenating first, middle and last names
   * separated by spaces.
   *
   * @return a single-line string containing the patient's full name
   */
  public String buildFullName() {
    return String.format("%s %s %s", firstName, middleName, lastName);
  }

  /**
   * Builds a single-line address string from street, city, state and zipcode.
   *
   * @return a single-line string containing address details and phone number.
   */
  public String buildAddress() {
    return String.format("%s %s %s %s", streetAddress, city, state, zipcode);
  }

  /**
   * Builds a single-line emergency contact string containing the contact name
   * and phone number.
   *
   * @return emergency contact name and number separated by a space
   */
  public String buildEmergencyContact() {
    return String.format("%s %s", emergencyContactName, emergencyContactNumber);
  }


  /**
   * Prints and returns a string of all patient information
   *
   * @return all patient information.
   */
  public String toString() {
    String allPatientInfo = String.format("  Name: %s%n Address: %s%n  Emergency Contact: %s%n", buildFullName(), buildAddress(), buildEmergencyContact());
    System.out.println(allPatientInfo);
    return allPatientInfo;
  }

  /**
   * Returns the patient's first name.
   *
   * @return first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Returns the patient's middle name.
   *
   * @return middle name.
   */
  public String getMiddleName() {
    return middleName;  
  }

  /**
   * Returns the patient's last name.
   *
   * @return last name.
   */
  public String getLastName() {
    return lastName;  
  }

  /**
   * Returns the patient's street address.
   *
   * @return street address.
   */
  public String getStreetAddress() {
    return streetAddress;  
  }

  /**
   * Returns the city portion of the patient's address.
   *
   * @return city, or {@code null} if not set
   */
  public String getCity() {
    return city;  
  }

  /**
   * Returns the state portion of the patient's address.
   *
   * @return state.
   */
  public String getState() {
    return state;  
  }

  /**
   * Returns the ZIP/postal code for the patient's address.
   *
   * @return zipcode.
   */
  public String getZipcode() {
    return zipcode;  
  }

  /**
   * Returns the patient's phone number.
   *
   * @return phone number.
   */
  public String getPhoneNumber() {
    return phoneNumber;  
  }

  /**
   * Returns the emergency contact's name.
   *
   * @return emergency contact name.
   */
  public String getEmergencyContactName() {
    return emergencyContactName;  
  }

  /**
   * Returns the emergency contact's phone number.
   *
   * @return emergency contact phone number.
   */
  public String getEmergencyContactNumber() {
    return emergencyContactNumber;
  }

  /**
  * Sets the patient's first name.
  *
  * @param changedFirstName new first name
  */
  public void setFirstName(String changedFirstName) {
    firstName = changedFirstName;
  }

  /**
  * Sets the patient's middle name.
  *
  * @param changedMiddleName new middle name
  */
  public void setMiddleName(String changedMiddleName) {
    middleName = changedMiddleName;  
  }

  /**
  * Sets the patient's last name.
  *
  * @param changedLastName new last name
  */
  public void setLastName(String changedLastName) {
    lastName = changedLastName;  
  }

  /**
  * Sets the patient's street address.
  *
  * @param changedStreetAddress new street address
  */
  public void setStreetAddress(String changedStreetAddress) {
    streetAddress = changedStreetAddress;  
  }

  /**
  * Sets the city portion of the address.
  *
  * @param changedCity new city
  */
  public void setCity(String changedCity) {
    city   = changedCity;
  }

  /**
   * Sets the state portion of the address.
   *
   * @param changedState new state
   */
  public void setState(String changedState) {
    state = changedState;
  }

  /**
  * Sets the zipcode/postal code.
  *
  * @param changedZipcode new zipcode
  */
  public void setZipcode(String changedZipcode) {
    zipcode = changedZipcode;  
  }

  /**
  * Sets the patient's phone number.
  *
  * @param changedPhoneNumber new phone number
  */
  public void setPhoneNumber(String changedPhoneNumber) {
    phoneNumber = changedPhoneNumber;  
  }

  /**
  * Sets the emergency contact's name.
  *
  * @param changedEmergencyContactName new emergency contact name
  */
  public void setEmergencyContactName(String changedEmergencyContactName) {
    emergencyContactName = changedEmergencyContactName;  
  }

  /**
  * Sets the emergency contact's phone number.
  *
  * @param changedEmergencyContactNumber new emergency contact phone number
  */
  public void setEmergencyContactNumber(String changedEmergencyContactNumber) {
    emergencyContactNumber = changedEmergencyContactNumber;  
  }
  
}
