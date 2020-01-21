/**
 * New class Author_Problem4, that includes private objects Person, Email and Address as field (instance) variables.
 * */
    public class Author_Problem4 {

        private Person person;
        private Email email;
        private Address address;

        /**
         * Constructor 1: creates a new author given objects Person, Email and Address.
         *
         * @param person the author's first and last name
         * @param email the author's email address
         * @param address the authors physical address
         */
        public Author_Problem4(Person person, Email email, Address address) {
            this.person = person;
            this.email = email;
            this.address = address;
        }

        /**
         * Constructor 2: creates a new author given strings firstName, lastName, loginName, domain and an object Address.
         * Please notice that we don't have a constructor that takes all of the building blocks of an Object Address, and then constructs an
         * instance of Address, that is then used to initialize instance variable address of an object Author_Problem4.
         * We could easily implement such a constructor, and this constructor it is omitted here simply because
         * it is somewhat tedious - you'd really want to deal with too many input arguments.
         *
         * @param firstName the author's first name
         * @param lastName the author's last name
         * @param loginName the login name used in the author's email address
         * @param domain the domain used in the author's email address
         * @param address the authors physical address
         */
        public Author_Problem4(String firstName, String lastName, String loginName, String domain, Address address) {
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
        public Address getAddress() {
            return this.address;
        }
    }
