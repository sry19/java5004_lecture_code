package animals;

public class Bear extends AbstractWild {

  /**
   * Makes the animal talk
   *
   * @return A representation of what the animal would say
   */
  @Override
  public String talk() {
    return "roar";
  }
}
