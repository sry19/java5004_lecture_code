/**
 * Starting class Author, copied from the lab assignment.
 * */
public class Author_Problem1 {

    private String name;
    private String email;
    private String address;

    /**
     * Creates a new author given the author's name, email and address as strings.
     *
     * @param name the author's name
     * @param email the author's email address
     * @param address the authors physical address
     */
    public Author_Problem1(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
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
