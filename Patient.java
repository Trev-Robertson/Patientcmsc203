public class Patient {
  private String firstName;
  private String middleName;
  private String lastName;
  private String streetAddress;
  private String city;
  private String state;
  private String zipcode;
  private String phoneNumber;
  private String emergencyContactName;
  private String emergencyContactNumber;

  public Patient() {

  }
  
  public Patient(String firstName, String middleName, String lastName) {

  }

  public Patient(String firstName,
                String middleName,
                String lastName,
                String streetAddress,
                String city,
                String state,
                String zipcode,
                String phoneNumber,
                String emergencyContactName,
      String emergencyContactNumber) {

  }
  
  public String buildFullName() {
    return firstName + " " + lastName;
  }

  public String buildAddress() {
    return streetAddress + " " + city + " " + state + " " + zipcode;
  }

  public String buildEmergencyContact() {
    return emergencyContactName + " " + emergencyContactNumber;
  }

//////////////////////////////////
  // public String toString() {
    
  // }
///////////////////////////////////
  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;  
  }

  public String getLastName() {
    return lastName;  
  }

  public String getStreetAddress() {
    return streetAddress;  
  }

  public String getCity() {
    return city;  
  }

  public String getState() {
    return state;  
  }

  public String getZipcode() {
    return zipcode;  
  }

  public String getPhoneNumber() {
    return phoneNumber;  
  }

  public String getEmergencyContactName() {
    return emergencyContactName;  
  }

  public String getEmergencyContactNumber() {
    return emergencyContactNumber;
  }
  
  //////////////////////////////////////////////////////////////

  public void setFirstName(String changedFirstName) {
     firstName = changedFirstName;
  }

  public void setMiddleName(String changedMiddleName) {
     middleName = changedMiddleName;  
  }

  public void setLastName(String changedLastName) {
     lastName = changedLastName;  
  }

  public void setStreetAddress(String changedStreetAddress) {
     streetAddress = changedStreetAddress;  
  }

  public void setCity(String changedCity) {
     city   = changedCity;
  }

  public void setState(String changedState) {
    state = changedState;
  }

  public void setZipcode(String changedZipcode) {
     zipcode = changedZipcode;  
  }

  public void setPhoneNumber(String changedPhoneNumber) {
     phoneNumber = changedPhoneNumber;  
  }

  public void setEmergencyContactName(String changedEmergencyContactName) {
     emergencyContactName = changedEmergencyContactName;  
  }

  public void setEmergencyContactNumber(String changedEmergencyContactNumber) {
     emergencyContactNumber = changedEmergencyContactNumber;  
  }
  
}
