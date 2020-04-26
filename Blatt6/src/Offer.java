public interface Offer extends SalesTax{
    double getDiscount();

    default String getOffer(){
        if(getCount() >= 2){
            return "Discount: coupon";
        }
        return "No Discount";
    }

    default double getSave(){
        if(getCount() >= 2){
            return getPricePerItem() * getDiscount() / 100;
        }
        return 0;
    }
}
