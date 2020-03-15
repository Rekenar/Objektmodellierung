public class Workshop {
    private String name;
    private String country;
    private int postcode;
    private String city;
    private String street;
    private String phone;

     public Workshop(String name, String country, String city, String street, String phone, int postcode){
        this.name = name;
        this.country = country;
        this.city = city;
        this.street =street;
        this.phone = phone;
        this.postcode = postcode;
    }
    public String getName() {
        return name;
    }
    public String getCountry(){
        return country;
    }
    public String getPhone() {
        return phone;
    }
    public String getCity(){
        return city;
    }
    public String getStreet(){
         return street;
    }
    public int getPostcode(){
         return postcode;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setStreet(String street) {
        this.street = street;
    }
}
