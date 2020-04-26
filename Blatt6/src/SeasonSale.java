public interface SeasonSale extends Offer{

    default double getRate(){
        return ((getPricePerItem() + taxrate()-getSave())*getCount());
    }
    String getName();
}
