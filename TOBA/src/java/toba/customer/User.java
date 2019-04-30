/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.customer;

/**
 *
 * @author lawrencewilson
 */

import java.io.Serializable;

public class User implements Serializable{
    
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String userName;
    private String password;
    


public User(){
    firstName = "";
    lastName = "";
    phone = "";
    address = "";
    city = "";
    state = "";
    zip = "";
    email = "";
    userName = "";
    password = "";
}

public User (String firstName, String lastName, String phone,
             String address, String state, String zip, String email, 
            String userName, String password){
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.address = address;
    this.state = state;
    this.zip = zip;
    this.email = email;
    this.userName = userName;
    this.password = password;
}

public String getFirstName(){
    return firstName;
}

public void setFirstName(String firstName){
    this.firstName = firstName;
}

public String getLastName(){
    return lastName;
}

public void setLastName(String lastName){
    this.lastName = firstName;
}

public String getPhone(){
    return phone;
}

public void setPhone(String phone){
    this.phone = phone;
}

public String getAddress(){
    return address;
}

public void setAddress(String address){
    this.address = address;
}

public String getState(){
    return state;
}

public void setState(String state){
    this.state = state;
}

public String getZip(){
    return zip;
}

public void setZip(String zip){
    this.zip = zip;
}

public String getEmail(){
    return email;
}

public void setEmail(String email){
    this.email = email;
}
public String getUserName(){
    return userName;
}

public void setUserName(String userName){
    this.userName = userName;
}

public String getPassWord(){
    return email;
}

public void setPassword(String password){
    this.password = password;


}
}