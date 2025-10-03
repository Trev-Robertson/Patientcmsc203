
public class Procedure {
  private String procedureName;
  private String date;
  private String practitionerName;
  private double charge;

  public Procedure() {
  }

  public Procedure(String newProcedureName, String newDate) {
    procedureName = newProcedureName;
    date = newDate;
  }

  public Procedure(String newProcedureName, String newDate, String newPractitionerName, double newCharge) {
    procedureName = newProcedureName;
    date = newDate;
    practitionerName = newPractitionerName;
    charge = newCharge;
  }

  public String toString() {
    String allProcedureInformation = String.format("\tProcedure: %s%n\tProcedureDate=%s%n\tPractitioner=%s%n\tCharge=%s", procedureName, date, practitionerName, charge);
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

  public double getCharge() {
    return charge;
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

  public void setCharge(double changedCharge) {
    charge = changedCharge;
  }
  
}
