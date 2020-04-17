public class BinarySearch {
    public static void main(String[] args) {
        final int originalMax = 100000;
        final int originalMin = 0;
        int randomNum = (int)((Math.random() * originalMax));
       
        System.out.println(randomNum);
        int min = originalMin;
        int max = originalMax;
        
        for (int i = 0; true; i++) {
        int guess = (max + min) / 2;
        
        if (guess == randomNum) {
            System.out.println("CORRECT!");
            System.out.println("Tries taken: " + i);
            break;
        } else if (guess < randomNum) {
            min = guess + 1;
        } else {
            max = guess - 1;
        }
    }
    }
}