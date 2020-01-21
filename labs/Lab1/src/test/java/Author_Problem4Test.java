import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Author_Problem4Test {
  private Person testPerson;
  private Email testEmail;
  private Address testAddress;
  private Author_Problem4 testAuthor;

  @Before
  public void setUp() throws Exception {
    testPerson = new Person("Amelia", "Bedelia");
    testEmail = new Email("amelia.bedelia", "hmail.com");
    testAddress = new Address(225, "Terry Ave N", "Seattle", "WA", 98109, "USA");
    testAuthor = new Author_Problem4(testPerson, testEmail, testAddress);
  }


  @Test
  public void getPerson() {
    //This test test getPerson getter, and also indirectly getter getFirstName and getLastName
    TestCase.assertEquals("Amelia", testAuthor.getPerson().getFirstName());
    TestCase.assertEquals("Bedelia", testPerson.getLastName());
  }

  @Test
  public void getEmail() {
    //This test test getEmail getter, and also indirectly getter getLoginName and getDomain
    TestCase.assertEquals("amelia.bedelia", testAuthor.getEmail().getLoginName());
    TestCase.assertEquals("hmail.com", testAuthor.getEmail().getDomain());
  }

  @Test
  public void getAddress() {
    TestCase.assertEquals(testAddress, testAuthor.getAddress());
  }
}