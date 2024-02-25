/*
Author: Christopher Windrow
Description: Week 5 OOP assignment to call classes into main method to provide output.
 */

package week5;

public class MainWeek5 {
    //Main Method
    public static void main(String[] args) {
        Cat kitty = new Cat();
        Dog puppy = new Dog();
        Chihuahua buffy = new Chihuahua();
        Cow bessie = new Cow();
        Sheep aSheep = new Sheep();
        Fox littleFox = new Fox();

        kitty.Speak();
        puppy.Speak();
        buffy.Speak();
        bessie.Speak();
        aSheep.Speak();
        littleFox.Speak();

        System.out.println("The cow produces " + bessie.Milk() + " Gallons today.");

        trySwimming(puppy);
        trySwimming(buffy);
        trySwimming(kitty);
        trySwimming(bessie);
        trySwimming(aSheep);
        trySwimming(littleFox);
    }
    //Try swimming method

    private static void trySwimming(Mammal currentMammal) {
        if (currentMammal instanceof Dog || currentMammal instanceof Fox) {
            System.out.println("Splash, paddle paddle");
            currentMammal.Speak();
        } else if (currentMammal instanceof Cat) {
            System.out.println("hiss");
        } else {
            currentMammal.Speak();
        }
    }
}
