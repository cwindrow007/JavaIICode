
/*
Author: Christopher Windrow
Description: Week 5 OOP assignment Cow Class.
 */
package week5;

import java.util.Random;

public class Cow extends Mammal {
    @Override
    public void Speak() {
        System.out.println("Moo");
    }
    //Random num generator to generate a number between 2 and 5
    public int Milk() {
        Random random = new Random();
        return random.nextInt(4) + 2;
    }
}
