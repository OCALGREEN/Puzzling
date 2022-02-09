import java.util.Arrays; 
import java.util.ArrayList; 
import java.util.Random; 

public class TestMain {
    public static void main(String[] arts) {

        PuzzleJava runFunction = new PuzzleJava(); 


        System.out.println("\n---- Generate Random Number Between 1 - 20 ----");
        runFunction.getTenRolls(); 


        System.out.println("\n---- Generate Random Letter ----");
        char randomLetter = runFunction.getRandomLetter(); 
        System.out.println("Random Letter Generated: " + randomLetter); 


        System.out.println("\n---- Generate Random Password ----");
        System.out.println("Randomly Generated Password: " + runFunction.generatePassword()); 


        System.out.println("\n---- Generate List of Random Passwords ----");
        runFunction.getNewPasswordSet(8); 

    }
}