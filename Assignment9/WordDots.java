import java.util.Scanner;

class WordDots {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String word1, word2;
        
        int numberOfDots, word1Length, word2Length;
        int currentDotNumber = 1;
        // ask for words
        System.out.println("Enter first word:");
        word1 = scan.nextLine();
        System.out.println("Enter second word:");
        word2 = scan.nextLine();
        // find length of both words
        word1Length = word1.length();
        word2Length = word2.length();
        // find number of dots that should be printed
        numberOfDots = 30 - word1Length - word2Length;
        
        System.out.print(word1);
        // print out "." while "currentDotNumber" is less than or equal to "numberOfDots"
        while (currentDotNumber <= numberOfDots) {
            System.out.print(".");
            currentDotNumber++;
        }
        System.out.print(word2);
    }
}