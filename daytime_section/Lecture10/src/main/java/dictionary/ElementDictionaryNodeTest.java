package dictionary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElementDictionaryNodeTest {
  IDictionary<String, Integer> empty, onePair, twoPair;
  @Before
  public void setUp() throws Exception {
    empty = new EmptyDictionaryNode<>();
    onePair = new ElementDictionaryNode<>("A", 0);
    twoPair = new ElementDictionaryNode<>("A", 0, new ElementDictionaryNode<>("B", 1));
  }

  @Test
  public void add() {
    assertEquals(0, empty.size());
    assertEquals(1, onePair.size());
    assertEquals(2, twoPair.size());
    empty = empty.put("B", 1);
    onePair = onePair.put("B", 1);
    twoPair = twoPair.put("C", 1);
    assertEquals(1, empty.size());
    assertEquals(2, onePair.size());
    assertEquals(3, twoPair.size());
  }

  @Test
  public void duplicateAdd() {
    assertEquals(2, twoPair.size());
    twoPair = twoPair.put("B", 1);
    assertEquals(2, twoPair.size());
  }

  @Test
  public void getKey() {

  }

  @Test
  public void getValue() {
  }

  @Test
  public void getValueOf() throws NoSuchKeyException {
    assertEquals(new Integer(0), onePair.getValue("A"));
    assertEquals(new Integer(1), twoPair.getValue("B"));
  }

  @Test(expected=NoSuchKeyException.class)
  public void invalidKey() throws NoSuchKeyException {
    empty.getValue("1");
  }


  @Test
  public void containsKey() {
    assertFalse(empty.containsKey("A"));
    assertTrue(onePair.containsKey("A"));
    assertTrue(twoPair.containsKey("A"));
  }
}