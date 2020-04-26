public class PaymentByCash extends Payment{

    public PaymentByCash(Invoice invoice){
        super(invoice);
    }

    @Override
    public double paymentDetails() {
        return seasonSale.getRate();
    }
}
