package problem1;

/**
 * Represents an X-wing fighter. An X-wing fighter has a remaining fuel level, a destruction level,
 * and an indicator for whether or not it has been destroyed.
 */
public class XWingFighter extends ResistanceStarship {

  private static final int X_WING_ATTACK_MIN = 0;
  private static final int X_WING_ATTACK_MAX = 40;

  /**
   * Constructs a new XWingFighter object and initializes it with the given fuel level, destruction
   * level, and also determines whether or not the starship has been destroyed.
   *
   * @param fuelLevel the X-wing fighter's remaining fuel level.
   * @param destructionLevel the X-wing fighter's destruction level.
   * @throws Exception if the given fuel level is not in the proper range [REMAINING_FUEL_MIN,
   *     REMAINING_FUEL_MAX] or the given destruction level is not in the proper range
   *     [DESTRUCTION_LEVEL_MIN, DESTRUCTION_LEVEL_MAX].
   */
  public XWingFighter(Integer fuelLevel, Integer destructionLevel) throws Exception {
    super(fuelLevel, destructionLevel);
  }

  /**
   * Return a new X-wing fighter that is identical to the original X-wing fighter, except with its
   * remaining fuel level increased by the given amount (fuel level cannot exceed the starship's
   * maximum). Return null if exception is thrown.
   *
   * @param addAmount the amount of fuel to add to this X-wing fighter.
   * @return a new X-wing fighter that is identical to the original X-wing fighter, except with its
   *     remaining fuel level increased by the given amount (fuel level cannot exceed the starship's
   *     maximum). Return null if exception is thrown.
   * @throws Exception if the given amount of fuel to add is negative, if the X-wing fighter's
   *     fuel level is not in the proper range [REMAINING_FUEL_MIN, REMAINING_FUEL_MAX], or the
   *     X-wing fighter's destruction level is not in the proper range [DESTRUCTION_LEVEL_MIN,
   *     DESTRUCTION_LEVEL_MAX].
   */
  @Override
  public IStarship increaseFuel(Integer addAmount) throws Exception {
    int totalFuel;

    try {
      totalFuel = this.increaseFuelHelper(addAmount);
    } catch (InvalidFuelException e) {
      System.err.println(e.getMessage());
      return null;
    }

    try {
      return new XWingFighter(totalFuel, this.destructionLevel);
    } catch (Exception e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  /**
   * Return a new X-wing fighter that is identical to the original X-wing fighter, except with its
   * remaining fuel level decreased by the given amount (fuel level cannot be less than the
   * starship's minimum). Return null if exception is thrown.
   *
   * @param subAmount the amount of fuel to decrease from this X-wing fighter.
   * @return a new X-wing fighter that is identical to the original X-wing fighter, except with its
   *     remaining fuel level decreased by the given amount (fuel level cannot be less than the
   *     starship's minimum). Return null if exception is thrown.
   * @throws Exception if the given amount of fuel to decrease is negative, if the X-wing
   *     fighter's fuel level is not in the proper range [REMAINING_FUEL_MIN, REMAINING_FUEL_MAX],
   *     or the X-wing fighter's destruction level is not in the proper range
   *     [DESTRUCTION_LEVEL_MIN, DESTRUCTION_LEVEL_MAX].
   */
  @Override
  public IStarship decreaseFuel(Integer subAmount) throws Exception {
    int totalFuel;

    try {
      totalFuel = this.decreaseFuelHelper(subAmount);
    } catch (InvalidFuelException e) {
      System.err.println(e.getMessage());
      return null;
    }

    try {
      return new XWingFighter(totalFuel, this.destructionLevel);
    } catch (Exception e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  /**
   * Return a new X-wing fighter that is identical to the original X-wing fighter, except with its
   * destruction level increased by the given amount (destruction level cannot exceed the starship's
   * maximum). If the  X-wing fighter's destruction level has reached its max, the returned X-wing
   * fighter will also indicate it has been destroyed. Return null if exception is thrown.
   *
   * @param addAmount the amount to add to this X-wing fighter's destruction level.
   * @return a new X-wing fighter that is identical to the original X-wing fighter, except with its
   *     destruction level increased by the given amount (destruction level cannot exceed the
   *     starship's maximum). If the  X-wing fighter's destruction level has reached its max, the
   *     returned  X-wing fighter will also indicate it has been destroyed. Return null if exception
   *     is thrown.
   * @throws Exception if the given amount of destruction level to add is negative, if the
   *     X-wing fighter's fuel level is not in the proper range [REMAINING_FUEL_MIN,
   *     REMAINING_FUEL_MAX], or the X-wing fighter's destruction level is not in the proper range
   *     [DESTRUCTION_LEVEL_MIN, DESTRUCTION_LEVEL_MAX].
   */
  @Override
  public IStarship increaseDestructionLevel(Integer addAmount) throws Exception {
    int totalDestructionLevel;

    try {
      totalDestructionLevel = this.increaseDestructionLevelHelper(addAmount);
    } catch (InvalidDestructionLevelException e) {
      System.err.println(e.getMessage());
      return null;
    }

    try {
      return new XWingFighter(this.fuelLevel, totalDestructionLevel);
    } catch (Exception e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  /**
   * Return a new opponent starship that is identical to the given opponent starship, except with
   * its destruction level increased by the given attack power of this X-wing fighter (opponent's
   * destruction level cannot exceed that starship's maximum). If the opponent's destruction level
   * reached its max, the returned starship will also indicate it has been destroyed. Return null if
   * exception is thrown. NOTE- an X-wing fighter is allowed to attack EVERY other type of starship
   * (including types of itself). For example, an X-wing fighter can attack an A-wing fighter,
   * X-wing fighter, Tie fighter, or a Star destroyer.
   *
   * @param opponent the starship that is being attacked.
   * @param attackPower the level of attack power that this X-wing fighter delivers.
   * @return a new opponent starship that is identical to the given opponent starship, except with
   *     its destruction level increased by the given attack power of this X-wing fighter
   *     (opponent's destruction level cannot exceed that starship's maximum). If the opponent's
   *     destruction level reached its max, the returned starship will also indicate it has been
   *     destroyed. Return null if exception is thrown.
   * @throws Exception if the given attack power is not in the proper range [X_WING_ATTACK_MIN,
   *     X_WING_ATTACK_MAX], the given starship's fuel level is not in the proper range
   *     [REMAINING_FUEL_MIN, REMAINING_FUEL_MAX], or the given starship's destruction level is not
   *     in the proper range [DESTRUCTION_LEVEL_MIN, DESTRUCTION_LEVEL_MAX].
   */
  @Override
  public IStarship attack(IStarship opponent, Integer attackPower) throws Exception {
    if (attackPower < X_WING_ATTACK_MIN || attackPower > X_WING_ATTACK_MAX) {
      throw new IllegalAttackPowerException(
          "Given attack power must be in the range [" + X_WING_ATTACK_MIN + ", " + X_WING_ATTACK_MAX
              + "]");
    }

    try {
      return opponent.increaseDestructionLevel(attackPower);
    } catch (Exception e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  /**
   * Return a formatted string that summarizes a X-wing fighter starship with its fuel level,
   * destruction level, whether or not it has been destroyed, and its type/subtype of starship
   * (resistance and X-wing fighter).
   *
   * @return a formatted string as specified above.
   */
  @Override
  public String toString() {
    return super.toString() + "Subtype- X-wing fighter\n";
  }

  /**
   * Return whether or not the given object is the same as this object.
   *
   * @param obj the object to be compared to for equality.
   * @return whether or not the given object is the same as this object.
   */
  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  /**
   * Return the hash value of this object.
   *
   * @return the hash value of this object.
   */
  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
