/**
 * 
 * @author Nickolas Gadomski
 *
 */
public class SeparateFile {

  private String firstName = null;
  private String lastName = null;

  /**
   * Gets First Name
   * 
   * @return firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets First Name
   * 
   * @param firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Gets Last Name
   * 
   * @return lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets Last Name
   * 
   * @param lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * initiates constructor
   * 
   * @param argA
   * @param argB
   */
  public SeparateFile(String argA, String argB) {

    this.firstName = argA;
    this.lastName = argB;

  }

  /**
   * @param argA
   */
  public SeparateFile(String argA) {// constructor

    this.firstName = argA;

  }

  public SeparateFile() { // overloaded constructor
    this.firstName = null;
    this.lastName = null;
  } // no args constructor

  public void printName() {

    System.out.print(this.firstName + " ");

    if (this.lastName != null)
      System.out.print(lastName);

  }

}
