package bookexample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailTest {
    Email validEmail;
    // The following are used to test all the ways and email can be invalid, according to the Email class
    Email noAt;
    Email noDot;

    @Before
    public void setUp() throws Exception {
        validEmail = new Email("someone@example.com");
        noAt = new Email("someone.com");
        noDot = new Email("someone@example");
    }

    @Test
    public void getAddress() {
        assertEquals("someone@example.com", validEmail.getAddress());
    }

    @Test
    public void missingAt() {
        assertEquals("Invalid email", noAt.getAddress());
    }

    @Test
    public void missingDot() {
        assertEquals("Invalid email", noDot.getAddress());
    }
}