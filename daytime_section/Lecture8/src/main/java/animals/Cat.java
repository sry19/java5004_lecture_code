package animals;

public class Cat extends AbstractDomestic {

  /**
   * Makes the animal talk
   *
   * @return A representation of what the animal would say
   */
  @Override
  public String talk() {
    return "meow";
  }

  public String purr() {
    return "purrrrr";
  }
}
