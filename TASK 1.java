//TASK 1: RANDOM NUMBER GENERATION GAME USING JAVA
// USED 'RANDOM' METHOD FOR GENERATION OF THE NUMBER AND SCANNER INPUT FOR USER'S GUESS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner S= new Scanner(System.in);
         Random R = new Random();
    int N1 = R.nextInt(100)+1; //GENERATES NUMBERS FROM 1 to 100. 
        int N=S.nextInt();//USER INPUT 
        System.out.println("Random Number was:"+N1);
        System.out.println("You Guessed:"+N);
        if (N1!=N){
            System.out.println("Wrong Guess!\n");
        }
        else{
            System.out.println("Correct Guess!\n");
        }
    
    }
}
