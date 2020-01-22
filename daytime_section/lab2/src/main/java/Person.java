public class Person {

  protected Name name;
  protected Integer age;
  protected Double height;
  protected String phoneNumber;

  public Person(Name name, Integer age, Double height, String phoneNumber) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.phoneNumber = phoneNumber;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void printName (){
    System.out.println(this.name.toString());
  }
}
