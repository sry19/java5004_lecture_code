/**
 * New class Author_Problem2, that includes a private object Person as a field (instance) variable.
 */

public class Author_Problem2 {

    private Person person;
    private String email;
    private String address;

    /**
     * Constructor 1: creates a new author given an object Person and email and address as strings.
     *
     * @param person the author's first and last name
     * @param email the author's email address
     * @param address the authors physical address
     */
    public Author_Problem2(Person person, String email, String address) {
        this.person = person;
        this.email = email;
        this.address = address;
    }

    /**
     * Constructor 2: creates a new author given strings firstName, lastName, email and address.
     *
     * @param firstName the author's first name
     * @param lastName the author's last name
     * @param email the author's email address
     * @param address the authors physical address
     */
    public Author_Problem2(String firstName, String lastName, String email, String address) {
        this.person = new Person(firstName, lastName);
        this.email = email;
        this.address = address;
    }

    /**
     * @return the name
     */
    public Person getPerson() {
        return this.person;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }
}
