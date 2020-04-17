import java.util.Scanner;

class InfoPrinted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name, address, city, province, postalCode;
        //input
        System.out.println("Name:");
        name = scan.nextLine();
        //output
        System.out.println(name);
        //input
        System.out.println("Address:");
        address = scan.nextLine();
        //output
        System.out.println(address);
        //input
        System.out.println("City:");
        city = scan.nextLine();
        //output
        System.out.println(city);
        //input
        System.out.println("Province:");
        province = scan.nextLine();
        //output
        System.out.println(province);
        //input
        System.out.println("Postal code:");
        postalCode = scan.nextLine();
        //output
        System.out.println(postalCode);
    }
}