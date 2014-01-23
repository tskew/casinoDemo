/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casinodemo;

import java.util.Random;

/**
 *
 * @author Tim
 */
public class Dice {
    private int numberOfSides;
    private int lastRoll;
    private Random randomNumbers;
    
    //If the number of sides is not included, assume a d6
    public Dice() {
        numberOfSides = 6;
        randomNumbers = new Random();
    }
    
    public int roll() {
        //nexInt returns a number between 0 and Sides - 1
        lastRoll = 1 + randomNumbers.nextInt(numberOfSides);
        return lastRoll;
    }
    
}
