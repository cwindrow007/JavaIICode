/*
Author: Christopher Windrow
Description: Week 5 OOP assignment Fox class
 */

package week5;

import java.util.Scanner;

public class Fox extends Mammal {
    private static Scanner scanner = new Scanner(System.in); // Make scanner static to avoid closing System.in

    @Override
    public void Speak() {
        System.out.println("What does the fox say?");
        if (scanner.hasNextLine()) { // Check if input is available
            String sound = scanner.nextLine();
            System.out.println(sound + "!");
        }
    }
}


