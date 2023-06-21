
import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;

class testHotel {
    public static void main(String[] arg) {
        NumberFormat f = NumberFormat.getCurrencyInstance();
        // Create customer objects, calculate amounts, display receipts
        hotel customer1 = new hotel("10 - M", 2, 2);
        customer1.calculate();
        display(customer1, f);
        hotel customer2 = new hotel("12 - B");
        hotel customer3 = new hotel("12 - C", 2);
        customer3.calculate();
        customer2.addNights(1);
        customer2.calculate();
        display(customer2, f);
        customer3.addGuest(1);
        customer3.calculate();
        display(customer3, f);
        double grossRoom = customer1.getTotalRoom() + customer2.getTotalRoom() + customer3.getTotalRoom();
        double grossTelephone = customer1.getTelephone() + customer2.getTelephone() + customer3.getTelephone();
        double grossMeal = customer1.getTotalMeal() + customer2.getTotalMeal() + customer3.getTotalMeal();
        double grossTips = customer1.getTotalTips() + customer2.getTotalTips() + customer3.getTotalTips();
        double grossTax = customer1.getTotalTaxes() + customer2.getTotalTaxes() + customer3.getTotalTaxes();
        display(f, grossRoom, grossTelephone, grossMeal, grossTips, grossTax);
    }

    static void display(hotel h, NumberFormat f) {
        // Set up and display heading and date for each receipt
        System.out.println("\tThe ABC Cheap Lodging, Inc");
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance();
        System.out.println("\tDate: \t" + df.format(d));
        System.out.println("\tRoom#: \t" + h.getRoom());
        System.out.println("\tRoom Rate: \t" + f.format(h.getRoomRate()));
        System.out.println("\tLength of Stay: \t" + h.getNight() + " night(s)");
        System.out.println("\tNo. of Guests: \t" + h.getGuests());
        System.out.println("\tRoom Cost: \t" + f.format(h.getTotalRoom()));

        System.out.println("\tTax 6.5%: \t" + f.format(h.getTotalTaxes()));
        System.out.println("\t\t Subtotal: \t" + f.format(h.getSubtotal()));
        System.out.println("\tTelephone: \t" + f.format(h.getTelephone()));
        System.out.println("\tMeal Charges: \t" + f.format(h.getTotalMeal()));
        System.out.println("\tTip: \t" + f.format(h.getTotalTips()));
        // Display expenses line by line including subtotal as shown in the output
        // //Display to total
        System.out.println("\nTOTAL AMOUNT DUE\t.........." + f.format(h.getTotal())); // Display thank you message
        System.out.println("\nThanks for staying at The ABC Cheap Lodging, Inc");
        System.out.println("\tPlease come again !!!");
        System.out.println("\n");
    }

    static void display(NumberFormat f, double grossRoom, double grossTelephone, double grossMeal, double grossTips,
            double grossTax) {
        // Complete this method so that it displays the summary amounts as shown in the
        // output
        System.out.println("\t\t Official Use Only \t\t\n");
        System.out.println("\t\t Today's Summary \t\t");
        System.out.println("\tRoom: \t" + f.format(grossRoom));
        System.out.println("\tTelephone: \t" + f.format(grossTelephone));
        System.out.println("\tMeal: \t" + f.format(grossMeal));
        System.out.println("\tTips: \t" + f.format(grossTips));
        System.out.println("\tTax: \t" + f.format(grossTax));
        System.out.println("--------------------------------");
        System.out.println("\tGross Transaction: \t" + f.format(grossRoom + grossTelephone +
                grossMeal + grossTips + grossTax));
        System.out.println("\nProcess Completed.");
    }
}