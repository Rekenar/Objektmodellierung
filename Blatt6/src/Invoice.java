public class Invoice implements SeasonSale {

    private String customerName;
    private String productNumber;
    private String productName;
    private double taxrate;
    private double pricePerItem;
    private int count;
    private double discount;
    private static int invoicenr;
    private Payment payment;

    public Invoice(String customerName, String productNumber, String productName, double
            taxrate, double pricePerItem, int count, double discount){
        this.customerName = customerName;
        this.productNumber = productNumber;
        this.productName = productName;
        this.taxrate = taxrate;
        this.pricePerItem = pricePerItem;
        this.count = count;
        this.discount = discount;
        setinvoicenr();
    }

    /**
     * Getter Methods
     */

    public String getCustomerName() {
        return customerName;
    }
    public String getProductName() {
        return productName;
    }
    @Override
    public double getPricePerItem() {
        return pricePerItem;
    }
    public String getProductNumber(){
        return productNumber;
    }
    @Override
    public int getCount() {
        return count;
    }
    @Override
    public double getDiscount() {
        return discount;
    }
    @Override
    public String getName() {
        return customerName;
    }
    @Override
    public double gettaxrate() {
        return taxrate;
    }
    public static int getinvoicenr(){
        return invoicenr;
    }
    public Payment getPayment() {
        return payment;
    }
    public String getPaymentMethod() {
        if(payment instanceof PaymentByCash){
            return "ByCash";
        }else{
            return "ByCard";
        }
    }

    /**
     * Setter Methods
     */

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setTaxrate(double taxrate) {
        this.taxrate = taxrate;
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public void setQuantity(int count){
        if(getCount() > 0){
            this.count = count;
        }
    }
    public void setperItemPrice(double price){
        if(getPricePerItem() > 0){
            this.pricePerItem =price;
        }
    }
    public static void setinvoicenr(){
        invoicenr++;
    }
    public void setPayment(Payment payment){
        this.payment = payment;
    }
    public void printInvoice(){
        System.out.println("************* INVOICES & PAYMENT MODES ***************");
        System.out.println("Invoice:");
        System.out.println("product number: " + getProductNumber() + "("+getProductName()+")");
        System.out.println("quantity: " + getCount());
        System.out.println("price per item + tax: " + (getPricePerItem()+ taxrate()));
        System.out.println("Save-up-to: " + getSave());
        System.out.println("Offer: " + getOffer());
        System.out.println();
        System.out.println("Payment Mode: " + getPaymentMethod());
        System.out.println("Amount Payed: " + (payment.paymentDetails()*10)/10);
        System.out.println();
        System.out.println("************* PURCHASER DETAILS ***************");
        System.out.println();
        System.out.println("Invoice No. " + invoicenr + " Purchaser: " + getCustomerName());
        if(payment instanceof PaymentByCard){
            System.out.println("The payment made through this card: "+ ((PaymentByCard)getPayment()).getCardNumber());
            System.out.println("Card Owner Name: " + getCustomerName());
            System.out.println("Expire date: " + ((PaymentByCard)getPayment()).getExpiryDate());
        }
        System.out.println("******************************************************");
        System.out.println();
    }
}