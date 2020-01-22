public class Student extends Person {

  public Student(Name name, Integer age, Double height, String phoneNumber) {
    super(name, age, height, phoneNumber);
  }

  @Override
  public void printName() {
    System.out.println("I don't weant to print the name!");
  }
}
