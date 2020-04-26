public interface SalesTax extends Product{
    default double taxrate(){
        return getPricePerItem() * (gettaxrate()/100);
    }
    double gettaxrate();
}
