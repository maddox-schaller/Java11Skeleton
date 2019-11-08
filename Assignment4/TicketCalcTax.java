public class TicketCalcTax {
    public static void main(String[] args) {
        double ticketCost = 23.45;
        double ticketAmount = 8;
        double ticketTaxAlone = 0.12;
        double ticketTaxTotal = 1.12;
        double finalCost = ticketCost * ticketAmount;
        
        System.out.println("tax amount = " + finalCost * ticketTaxAlone);
        System.out.println("total with tax = " + finalCost * ticketTaxTotal);
    }
}