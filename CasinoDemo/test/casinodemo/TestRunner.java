/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casinodemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tim
 */
public class TestRunner {
    
    public TestRunner() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
     public void diceRollTest() {
         Dice singleDie = new Dice();
         int rolledNumber;
         for(int i = 0; i < 20; i++) { 
            rolledNumber = singleDie.roll();
            assertTrue("A d6 should return a number between 1 and 6", 
                    rolledNumber >= 1 && rolledNumber <= 6);
         }
     }
}