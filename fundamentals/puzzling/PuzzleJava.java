import java.util.Random;
import java.sql.Array;
import java.util.ArrayList;

public class PuzzleJava {
    // create Random object
    Random random = new Random();

    // create 10 random integers between 1 and 20
    public int[] getTenRolls() {
        int[] randomArray = new int[10];
        for(int i= 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(19)+1;
        }
        return randomArray;
    }

    // create an array with all 26 letters of the alphabet and return a random letter
    public char getRandomLetter() {
        char[] alphaArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char alpha = alphaArray[random.nextInt(25)+1];
        return alpha;
    }

    // create randomized password
    public String generatePassword() {
        String password = new String();
        for(int i = 0; i < 8; i++){
            password += getRandomLetter();
        }
        return password;
    }

    // generates a random password with a random length
    public String[] getNewPasswordSet(int arrayLength) {
        String[] passwordArray = new String[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            passwordArray[i] = generatePassword();
        }
        return passwordArray;
    }
}
