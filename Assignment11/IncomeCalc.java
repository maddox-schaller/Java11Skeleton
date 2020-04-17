import java.util.Scanner;

class incomeCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double wage, hrsWorked, grossPay, tax, netPay;
        //input
        System.out.println("Enter Wage:");
        wage = scan.nextDouble();
        System.out.println("Enter hours worked:");
        hrsWorked = scan.nextDouble();
        //find grosspay
        grossPay = wage * hrsWorked;
        //find tax
        tax = grossPay * 0.3;
        //find net pay
        netPay = grossPay - tax;
        //output
        System.out.println("Gross pay: " + grossPay + "    Tax: " + tax + "    Net pay: " + netPay);
    }
}