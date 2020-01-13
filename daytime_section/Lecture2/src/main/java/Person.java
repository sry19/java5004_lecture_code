/**
 * Simple class Person, that includes private instance variables firstName and lastName.
 * */
public class Person {

  private Name personsName;
  private String address;

  public Person(Name personsName, String address) {
    this.personsName = personsName;
    this.address = address;
  }

  public void setPersonsName(Name personsName) {
    this.personsName = personsName;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Name getPersonsName() {
    return personsName;
  }

  public String getAddress() {
    return address;
  }
}

