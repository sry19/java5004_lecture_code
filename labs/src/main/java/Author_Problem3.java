/**
 * New class Author_Problem3, that includes private objects Person and Email as field (instance) variables.
 */

public class Author_Problem3 {

    private Person person;
    private Email email;
    private String address;

    /**
     * Constructor 1: creates a new author given objects Person and Email, and address as a String.
     *
     * @param person the author's first and last name
     * @param email the author's email address
     * @param address the authors physical address
     */
    public Author_Problem3(Person person, Email email, String address) {
        this.person = person;
        this.email = email;
        this.address = address;
    }

    /**
     * Constructor 2: creates a new author given strings firstName, lastName, loginName, domain and address.
     *
     * @param firstName the author's first name
     * @param lastName the author's last name
     * @param loginName the login name used in the author's email address
     * @param domain the domain used in the author's email address
     * @param address the authors physical address
     */
    public Author_Problem3(String firstName, String lastName, String loginName, String domain, String address) {
        this.person = new Person(firstName, lastName);
        this.email = new Email(loginName, domain);
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
    public Email getEmail() {
        return this.email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }
}