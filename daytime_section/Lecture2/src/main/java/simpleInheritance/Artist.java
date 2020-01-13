package simpleInheritance;

public class Artist extends Person {

  private String emailAddress;
  private String[] artCollection;

  public Artist(Name personsName, String address, String emailAddress, String[] artCollection) {
    super(personsName, address);
    this.emailAddress = emailAddress;
    this.artCollection = artCollection;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public String[] getArtCollection() {
    return artCollection;
  }
}
