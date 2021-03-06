/**
 * Simple class Person, that includes private instance variables firstName and lastName.
 * */
public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
