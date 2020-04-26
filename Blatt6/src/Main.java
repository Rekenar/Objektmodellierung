import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Philipp Fößl", "1235", "batteries"
                , 5.0, 12,5,4.0);
        invoice.setPayment(new PaymentByCard(invoice, new Date(2020, 6, 26), 1561658498));
        invoice.printInvoice();
        invoice.setPayment(new PaymentByCash(invoice));
        invoice.printInvoice();

    }
}
