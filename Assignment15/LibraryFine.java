import java.util.Scanner;

class LibraryFine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double A = 0.1, B = 0.25, C = 0.5, D = 1, E = 2, F = 5;
        double fineAmount;
        int daysOverdue = 1;
        char choice;
        String fineCatagory;

        while (daysOverdue > 0) {
            System.out.print("How many days is this book overdue: ");
            fineCatagory = scan.nextLine();

            System.out.print("Enter the fine catagory: ");
            fineCatagory = scan.nextLine();

            fineCatagory = fineCatagory.trim();
            fineCatagory = fineCatagory.toUpperCase();
            choice = fineCatagory.charAt(0);

            while (true) {
                switch (choice) {
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
                    System.out.print("Invalid imput");
                    continue;
                }
                
            }
            System.out.print("Your fine is $" + fineAmount);
        }
    }
}