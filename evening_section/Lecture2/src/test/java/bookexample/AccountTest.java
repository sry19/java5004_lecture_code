package bookexample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    Account account;

    @Before
    public void setUp() throws Exception {
        Name name = new Name("Darth", "Vader");
        Email email = new Email("lordvader@darkside.com");
        account = new Account(name, email, "darkside4eva");
    }

    @Test
    public void getName() {
        Name accountName = account.getName();
        assertEquals("Darth", accountName.getFirstName());
        assertEquals("Vader", accountName.getLastName());
    }

    @Test
    public void getLoginEmail() {
        Email accountEmail =  account.getLoginEmail();
        assertEquals("lordvader@darkside.com", accountEmail.getAddress());
    }

    @Test
    public void isUser() {
        Email sameEmail =  new Email("lordvader@darkside.com");
        String samePassword =  "darkside4eva";
        assertTrue(account.isUser(sameEmail, samePassword));
    }

    @Test
    public void isNotUser() {
        Email sameEmail = new Email("lordvader@darkside.com");
        String diffPassword = "password";
        assertFalse(account.isUser(sameEmail, diffPassword));
    }
}