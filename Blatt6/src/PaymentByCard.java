import java.util.Date;

public class PaymentByCard extends Payment{

    private Date expiryDate;
    private int cardNumber;

    public PaymentByCard(Invoice invoice, Date expiryDate, int cardNumber){
        super(invoice);
        this.expiryDate = expiryDate;
        this.cardNumber = cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public double paymentDetails(){
        return seasonSale.getRate();
    }
}
