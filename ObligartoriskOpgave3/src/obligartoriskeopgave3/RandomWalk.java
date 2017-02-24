

package obligartoriskeopgave3;
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class RandomWalk {
    int currentX, currentY, max, stepsTaken, edge;
    private int maxDistance;
    
    
    public RandomWalk (int max, int edge) {
        currentX = 0;
        currentY = 0;
        this.max = max;
        this.edge = edge;
        this.stepsTaken = 0;
        maxDistance = 0;
    }

    public RandomWalk(int max, int edge, int startX, int startY) {
        currentX = startX;
        currentY = startY;
        this.max = max;
        this.edge = edge;
        stepsTaken = 0;
        maxDistance = 0;
    }
    
    public void takeStep() {
        double direction;
        direction = (Math.random() * 4) + 1;
        //System.out.println((int) direction);
        switch ((int) direction) {
            case 1: // right
                this.currentX++;
                System.out.println("Moving right...");
                break;
            case 2: // left
                this.currentX--;
                System.out.println("Moving left...");
                break;
            case 3: // up
                this.currentY++; 
                System.out.println("Moving up...");
                break; 
            case 4: // down
                this.currentY--;
                System.out.println("Moving down...");
                break;
        }
        stepsTaken++;
        
        maxDistance = max(maxDistance, Math.max(Math.abs(currentX), Math.abs(currentY)));
    }
    
    
    
    private int max(int num1, int num2){
        if(num1 > num2){
            return num1;
        
        }else{
            return num2;
        }
       
        
   
}
    // This is the getMaxDistance method which will return the maxDistance from the takeStep method
    public int getMaxDistance(){
        return maxDistance;
    }


    
    // returns true if the number of steps taken is less than the maximum number; returns false otherwise
    public boolean moreSteps() {
        if (stepsTaken<max) { return true;}
        return false;
    }
    
    // returns true if the current position is on the square (include the boundary as part of the square); returns false otherwise.
   public boolean inBounds() {
        if (currentX<edge && currentY<edge) { return true;}
        return false;
    }
    
    // Add to the RandomWalk class a method named walk that has no parameters and returns nothing. 
    // Its job is to simulate a complete random walk.
    // This should be a very simple loop (while or do... while) 
    // --- you will need to call the methods takeStep, moreSteps, and inBounds.
    public void walk() {
        while(moreSteps() && inBounds()){
            takeStep();
           System.out.println(this.toString());
        }
        if (!moreSteps()) { System.out.println("Out of steps"); }
        if (!inBounds()) { System.out.println("Out of bounds"); }
    }
    
    public int getX(){
       return currentX; 
    }
    
    public int getY(){
       return currentY;
    }
    
    
    
    
    
    @Override
    public String toString() {
        return "Current X = " + currentX + ", Current Y = " + currentY + ", Max Steps = " + max + ", Steps Taken = " + stepsTaken + ", edge = " + edge + '}';
    }


    
}
