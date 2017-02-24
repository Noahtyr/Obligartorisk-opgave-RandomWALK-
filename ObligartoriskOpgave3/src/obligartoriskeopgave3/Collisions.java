package obligartoriskeopgave3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author virk04
 */
public class Collisions {
    private int counter;
        
    public Collisions() {
        
        // At Stated in the assignment, these objects are allowed to be hardcoded, because their parameters will not
        // change over the course of the exercise
        RandomWalk part1 = new RandomWalk(100000, 2000000, -3, 0);
        RandomWalk part2 = new RandomWalk(100000, 2000000, 3, 0);
        
        
        
        // A while loop, which determines that wether there are more steps from the particles
        // and if the particles are more steps, then they will keep going.
        while((part1.moreSteps()==true) || (part2.moreSteps()==true)){
            part1.takeStep();
            part2.takeStep();       
            
            // This if statement will counter one up evertime the particles have collided. 
            // We will then have a clear picture of how many times they collide
            if(samePosition(part1, part2))
                counter++;
            
            // These System out print lines will tell us the current position of the particles
            System.out.println(("Particle 1 : (" + part1.getX() + "," + part1.getY() + ")"));
            System.out.println(("Particle 2 : (" + part2.getX() + "," + part2.getY() + ")"));
            
            
    }                    
       // This boolean method is the code to determine wether or not the particles have collided with each other
       // When both the x and the y coordinates from both particles equals the same, then the particles have
       // collided, which will be counted up in the above standing counter
       // Since this is a boolean, this means the method will only return true or false
    }
public static boolean samePosition(RandomWalk part1, RandomWalk part2){
   if((part1.getX()==part2.getX()) && (part1.getY()==part2.getY())){
       
       return true;  
   }else{
       return false;
   }
         
        
       
   }
   
    @Override
    public String toString(){
        return " The Particles have collided " + counter + " times. Resulting in the second big bang ";
    
}
}


