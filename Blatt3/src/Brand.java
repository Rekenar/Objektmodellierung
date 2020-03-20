public class Brand {
    private String name;
    private String country;
    private String phone;
    private String email;

//Constructor for Brand Class

    public Brand(String name, String country, String phone, String email){
        this.name = name;
        this.country = country;
        this.phone = phone;
        this.email = email;
    }

//Getter for Brand class

    public String getName() {
        return name;
    }
    public String getCountry(){
        return country;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail(){
        return email;
    }

//Setter for Brand class

    public void setName(String name){
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
            this.phone = phone;
    }
}
