import java.util.Scanner;
class CYearsInDays {
    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        long age, days, weeks, months, leapYears;
        
        System.out.println("Enter your age in years:");
        age = scan.nextInt();
        
        leapYears = age / 4;
        
        days = age * 365 + leapYears;
        weeks = age * 52;
        months = age * 12;
        
        
        
        System.out.println("your age in days is " + days + ", your age in weeks is " + weeks + ", your age in months is " + months);
     }     
    }  