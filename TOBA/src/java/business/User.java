package business;

import java.io.Serializable;
import customer.*;

    public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String email;
    private String userName;
    private String password;
    

    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zipcode = "";
        email = "";
        userName = "";
        password = "";
    }

    public User(String firstName, String lastName, String phone, String address,
            String city, String state, String zipcode, String email, String userName,
            String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    
    public String getfirstName() {
        return firstName;
    }
    
    public String getlastName() {
        return lastName;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }
    
    public String getZipcode() {
        return zipcode;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    
    public void setLasttName (String lastName) {
        this.lastName = lastName;
    }
    
    public void setPhone (String phone) {
        this.phone = phone;
    }
    
    public void setAddress (String address) {
        this.address = address;
    }
    
    public void setCity (String city) {
        this.city = city;
    }
    
    public void setState (String state) {
        this.state = state;
    }
    
    public void setZipcode (String zipcode) {
        this.zipcode = zipcode;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public void setUserName (String userName) {
        this.userName = userName;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }
    
      public double getCheckingBal(){
        Account checking = AccountDB.selectAccount(this, "CHECKING");
        if (checking != null) 
            return checking.getBalance();
        return 0.00;
    }

    public double getSavingsBal(){
        Account savings = AccountDB.selectAccount(this, "SAVINGS");
        if (savings != null) 
            return savings.getBalance();
        return 0.00;
    }
}
