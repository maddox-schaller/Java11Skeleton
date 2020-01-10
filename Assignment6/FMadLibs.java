import java.util.Scanner;

class FMadLibs {
    public static void main(String[] args) {
        
        String feature, animal, name;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name");
        name = scan.nextLine();
        System.out.println("Enter a feature");
        feature = scan.nextLine();
        System.out.println("Enter an animal");
        animal = scan.nextLine();
        
       
        System.out.format("%s has %s like an %s", name, feature, animal);
        
        
    } 
}
    