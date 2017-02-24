/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligartoriskeopgave3;


public class DrunkenWalk {
    
private int outOfBounds;
  
    public DrunkenWalk(int drunks, int steps, int bounds) {
        // This constructor and its parameters will determine the amount of drunks we are testing, the amount
        // of stpes and the size of the bounds
        
       
        for (int i = 0; i < drunks; i++) {
            // This for-loop will keep running until a set amount of drunks have been chosen. this is done in our
            // Main class TestWalk
         // New RandomWalk object.
         RandomWalk drunk = new RandomWalk(steps,bounds);
         drunk.walk();
          System.out.println(drunk.toString());
            // This if statement will tell us if the drunk person fell out of bounds
               if(drunk.inBounds()==false) {
                   outOfBounds++;
                   System.out.println("The Drunk fell out of bounds! ");   
                     
             
               }
             
        } 
    
    }
    @Override
    public String toString() {
        return "\nThis guy is Drunk as hell" + "\nThe drunk fell off this many times : "+ outOfBounds;
    }
}
