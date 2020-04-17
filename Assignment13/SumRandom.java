import java.util.Scanner;
import java.util.Random;

class SumRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();

        int num, sum = 0;
        //loop 100 times
        for (int i = 0; i < 100; i++) {
            //random number from 1-25 (inclusive)
            num = generaterandom.nextInt(25) + 1;
            //add num to the sum
            sum += num;
        }
        //print sum
        System.out.println("The sum of all the numbers is " + sum);
    }
}