package org.computermentors.chriswillingham.pezdispensor;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("We are making a new PEZ dispenser!");
        PezDispenser dispenser = new PezDispenser("Iceman");
        System.out.println(dispenser.getCharacterName());
        if (dispenser.isEmpty()){
            System.out.println("Dispenser is Empty. Filling dispenser...");
            dispenser.fill();
        }

        while (dispenser.dispense()){
            System.out.println("CHOMP!");
        }

        System.out.println("We ate all the PEZ...");

        try {
            dispenser.fill(100);
        } catch (IllegalArgumentException iae){
            System.out.printf("The error was %s", iae.getMessage());
        }

        dispenser.fill(5);
        dispenser.fill(3);

        while (dispenser.dispense()){
            System.out.println("CHOMP!");
        }

        System.out.println("We ate all the PEZ...");
    }
}
