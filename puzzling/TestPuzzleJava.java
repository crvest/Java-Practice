import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args) {
        // create test app object
        PuzzleJava appTest = new PuzzleJava();

        // test getTenRolls
        System.out.println("----Test Get Ten Rolls----");
        int[] randomArray = appTest.getTenRolls();
        for(int i = 0; i < randomArray.length; i++){
            System.out.println(randomArray[i]);
        }

        // test getRandomLetter
        System.out.println("----Test Get Random Letter----");
        System.out.println(appTest.getRandomLetter());

        // test generatePassword
        System.out.println("----Test Generate Password----");
        System.out.println(appTest.generatePassword());

        // test getNewPasswordSet
        System.out.println("----Test Get New Password Set----");
        String[] arr = appTest.getNewPasswordSet(4);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
