/*
 * Peter Horne-Deus
 * Cycles through a set of Four-Tuples until one of them equals zero
 * FourTuple.java
 * April 15, 2020
 */

package four.tuple;

import javax.swing.*;

/**
 *
 * @author Peter
 */
public class FourTuple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int[] num = new int[4];
        int cycles = 1;
        
        //Getting user entered data
        for(int i = 0; i < 4; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Enter a non negative integer"));
        }
        
        //Ensuring validity of data
        for(int i = 0; i < 4; i++){
            if(num[i] == 0){
                System.out.println("Number of cycles and the final set 0(" 
                        + num[0] + "," + num[1] + "," + num[2] + "," 
                        + num[3] + "}");
                
                break;
            }
        }
        
        //Calling the method to cycle the number
        cycle(num,cycles);
    }
    /**
     * This method cycles the numbers by taking the absolute value of the 
     * integer and removing the value of the previous integer until an integer 
     * equals zero
     * @param num
     * @param cycles 
     */
    public static void cycle(int[] num, int cycles){        
        //Varaibles
        int end = 0;
        int[] old = new int[4];
        
        //Running through the list of number
        for(int i = 0; i < 4; i++){
            //Adding to an array inorder to ensure that the subtraction later is 
            //possible
            old[i] = num[i];
            
            //Base case and final output
            if(num[i] == 0){
                System.out.println("Number of cycles and the final set " + cycles
                        + "(" + num[0] + "," + num[1] + "," + num[2] + "," 
                        + num[3] + "}");
                
                end = 1;
                break;
            }
        }
        
        //The cycling of the numbers
        if(end != 1){
            //Adding the number of cycles we are on
            cycles++;
            
            //Doing the math for the values of the numbers in the list
            for(int i = 0; i < 4; i++){
                if(i == 3){
                    num[i] = Math.abs(num[i] - old[0]);  
                }
                else{
                    num[i] = Math.abs(num[i] - old[i + 1]);
                }
                
            }
            //Recalling the method to run again until one of the values equal zero
            cycle(num,cycles);
        }
    
    
    }
}
