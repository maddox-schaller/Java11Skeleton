import java.util.Scanner;

class LibraryFine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double A = 0.1, B = 0.25, C = 0.5, D = 1, E = 2, F = 5;
        double fineAmount;
        int daysOverdue = 1;
        char choice;
        String fineCatagory;

        //loop while book has some amount of days overdue
        while (daysOverdue > 0) {
            //get input
            System.out.println("How many days is this book overdue: ");
            daysOverdue = scan.nextInt();

            scan.nextLine();
            //stop if days overdue is 0
            if (daysOverdue == 0) {
                break;
            }

            System.out.print("Enter the fine catagory: ");
            fineCatagory = scan.nextLine();

            fineCatagory = fineCatagory.trim();
            fineCatagory = fineCatagory.toUpperCase();
            choice = fineCatagory.charAt(0);


            switch (choice) {
                //find the correct case
                case 'A':
                fineAmount = daysOverdue * A;
                break;
                case 'B':
                fineAmount = daysOverdue * B;
                break;
                case 'C':
                fineAmount = daysOverdue * C;
                break;
                case 'D':
                fineAmount = daysOverdue * D;
                break;
                case 'E':
                fineAmount = daysOverdue * E;
                break;
                case 'F':
                fineAmount = daysOverdue * F;
                break;
                default:
                System.out.println("Invalid input");
                continue;
            }

            //output
            System.out.println("Your fine is $" + fineAmount);
        }
    }
}