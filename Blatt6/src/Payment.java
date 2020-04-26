public abstract class Payment {
    public SeasonSale seasonSale;
    public Payment(SeasonSale seasonSale){
        this.seasonSale = seasonSale;
    }
    public abstract double paymentDetails();
}
