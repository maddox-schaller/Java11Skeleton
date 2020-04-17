import java.util.Scanner;
import java.io.*;

class GetNumbersFromFile {

    public static void main(String[] args) throws IOException {
        
        int gender, males=0, females=0, totalPeople=0, iq, averageIq=0, height, averageHeight=0, age, malesSixFtAnd140IQ=0, oldest=0, youngest=0;
        
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        //run the code once outside the loop to declare the first person as the yougest and the oldest
        age = scan.nextInt();
        youngest = age;
        oldest = age;
            
        iq = scan.nextInt();
        averageIq += iq;
            
        gender = scan.nextInt();
        if (gender == 0) {
                females++;
        } else if (gender == 1) {
                males++;
        }
            
        height = scan.nextInt();
        averageHeight += height;
            
        if (gender == 1 && height >= 72 && iq >= 140) {
            malesSixFtAnd140IQ++;
        }
            
        totalPeople++;
        
        while (scan.hasNextInt()) {
            //test if person is new oldest or yougest
            age = scan.nextInt();
            if (age == -1) {
                break;
            } else if (age < youngest) {
                youngest = age;
            } else if (age > oldest) {
                oldest = age;
            }
            //add iq to average iq
            iq = scan.nextInt();
            averageIq += iq;
            //find gender
            gender = scan.nextInt();
            if (gender == 0) {
                females++;
            } else if (gender == 1) {
                males++;
            }
            //add height to average height
            height = scan.nextInt();
            averageHeight += height;
            //test if is a males over six feet and with at least 140 iq
            if (gender == 1 && height >= 72 && iq >= 140) {
                malesSixFtAnd140IQ++;
            }
            //add 1 to tatal people
            totalPeople++;
        }
        scan.close();
        //divide total iq by total people to find average iq
        averageIq = averageIq / totalPeople;
        //divide total height by total people to find the average height
        averageHeight = averageHeight / totalPeople;
        //output
        System.out.println("total number of people: " +  totalPeople + " total males: " +  males + " total females: " +  females + " Number of males over 6 feet with an IQ greater than 140: " +  malesSixFtAnd140IQ + " Average IQ: " + averageIq  + " Average height: " +  averageHeight + " oldest person: " + oldest  + " youngest person: " + youngest);
    }
}