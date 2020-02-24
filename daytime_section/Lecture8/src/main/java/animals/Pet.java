package animals;

import java.util.ArrayList;

public class Pet<T extends Animal> {
  private String name;
  private T species;

  public Pet(String name, T species) {
    this.name = name;
    this.species = species;
  }

  public String sayHello() {
    return this.name + " says " + this.species.talk();
  }


  public static void main(String[] args) {
    Pet mittens = new Pet("Mittens", new Cat());
    Pet fido = new Pet("Fido", new Dog());
    Pet smokey = new Pet("Smokey", new Bear());
;

    System.out.println(mittens.sayHello());
    System.out.println(fido.sayHello());
    System.out.println(smokey.sayHello());

  }
}
