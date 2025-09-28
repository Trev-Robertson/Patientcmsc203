public class Procedure {
  private String procedureName;
  private String date;
  private String practitionerName;
  private String charges;

  public Procedure() {
  }

  public Procedure(String newProcedureName, String newDate) {
    procedureName = newProcedureName;
    date = newDate;
  }

  public Procedure(String newProcedureName, String newDate, String newPractitionerName, String newCharges) {
    procedureName = newProcedureName;
    date = newDate;
    practitionerName = newPractitionerName;
    charges = newCharges;
  }

  public String toString() {
    String allProcedureInformation = String.format("%s%n%s%n%s%n%s", procedureName, date, practitionerName, charges);
    System.out.println(allProcedureInformation);
    return allProcedureInformation;
  }

  public String getProcedureName() {
    return procedureName;
  }

  public String getDate() {
    return date;
  }

  public String getPractitionerName() {
    return practitionerName;
  }

  public String getCharges() {
    return charges;
  }

  public void setProcedureName(String changedProcedureName) {
    procedureName = changedProcedureName;
  }

  public void setDate(String changedDate) {
    date = changedDate;
  }
  
  public void setPractitionerName(String changedPractitionerName) {
    practitionerName = changedPractitionerName;
  }

  public void setCharges(String changedCharges) {
    charges = changedCharges;
  }
  
}
