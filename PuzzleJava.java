import java.util.Arrays; 
import java.util.ArrayList; 
import java.util.Random; 

public class PuzzleJava {

    Random randMachine = new Random();

    public void getTenRolls() {
        for(int i = 0; i < 10; i++) {
            int randomNumber = 1 + randMachine.nextInt(20); 
            System.out.println(randomNumber); 
        }
    }

    public char getRandomLetter() {
        char[] letter = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
            'u', 'v', 'w', 'x', 'y', 'z'
            }; 
            int randomNumber = randMachine.nextInt(25); 
        return letter[randomNumber]; 
    }


    public String generatePassword() {
        String password = ""; 
        for(int i = 0; i < 8; i++) {
            password = password + this.getRandomLetter(); 
        }
        return password; 
    }


    public void getNewPasswordSet(int length) {
        String[] listOfPassword = new String[length]; 

        for(int i = 0; i < length; i++) {
            listOfPassword[i] = this.generatePassword(); 
            System.out.println(listOfPassword[i]); 
        }
    }









}