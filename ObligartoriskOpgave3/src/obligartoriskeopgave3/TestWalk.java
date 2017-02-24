package obligartoriskeopgave3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

// IF YOU WANT TO TEST THE DIFFERENT CLASSES, YOU HAVE TO UNQUOTE THE CODE 
public class TestWalk {

 
    public static void main(String[] args) {
       int maxSteps;
        int maxCoord;
        int x, y;

        
            Scanner scan = new Scanner(System.in);

        // maximum number of steps in a walk
        // the maximum x and y coordinate
        // starting x and y coordinates for a walk
            System.out.print("Enter the boundary for the square: ");
            maxCoord = scan.nextInt();
            System.out.print("Enter the maximum number of steps: ");
            maxSteps = scan.nextInt();
            System.out.print("Enter the starting x and y coordinates with "
                    + "a space between: ");
            x = scan.nextInt();
            y = scan.nextInt();

            RandomWalk walk1 = new RandomWalk(5, 10);
            RandomWalk walk2 = new RandomWalk(maxCoord, maxSteps, x, y);

            System.out.println(walk1);
            System.out.println(walk2);

            for (int i = 0; i < 5; i++) {
                walk1.takeStep();
                System.out.println(walk1.toString());
                walk2.takeStep();
                System.out.println(walk2.toString());
                
                
                
                
            System.out.println(("Walk1 (" + walk1.getX() + "," + walk1.getY() + ")"));
            System.out.println(("Walk2: (" + walk2.getX() + "," + walk2.getY() + ")"));
            }
            
            // This is how we are testing our getMaxDistance Methoed we made in the RandomWalk Class. This should tell us the 
            // maximum distance of each of the coordinates.
            System.out.println("The maximum distance for x is : " + walk1.getMaxDistance());
            
            System.out.println("The maximum distance for y is : " + walk2.getMaxDistance());
            

        

          
       
       
       // This for loop shows a random walk being done 100 times, which will give us an overview over the performance
       // of the random walk.   This Loop works is using our RandomWalk Class
       
//           for (int i = 0; i < 100; i++) {
//           RandomWalk walk3 = new RandomWalk(200, 10);
                   
          
//        walk3.walk();
            
//       System.out.println(walk3);
            
//       }
        
        
  
      // These three DrunkenWalk objects are the testers for our DrunkenWalks. these will show the statistics we need  
//       DrunkenWalk drunk1 = new DrunkenWalk(30, 200, 10);
//       DrunkenWalk drunk2 = new DrunkenWalk(30, 500, 10);
//       DrunkenWalk drunk3 = new DrunkenWalk(30, 200, 50);
//        System.out.println(drunk1);
//        System.out.println(drunk2);
//        System.out.println(drunk3);


            
     // this is our Collisions object, this object will help testing our collisions class. too see if it works properly
     // currently, the program should tell us which way either particle goes, and their current position and when out of steps
     // tell us how many times they collided.
     // The chance for collision is relatively low, given the high boundary compared to steps. so the program has also been tested
     // with a smaller boundary, resulting in a higher amount of collisions
       
//        Collisions part1 = new Collisions();
//        System.out.println(part1);

        
    }
    
}



