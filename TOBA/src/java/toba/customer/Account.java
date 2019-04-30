/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.customer;

import java.io.Serializable;
/**
 *
 * @author lawrencewilson
 */

public class Account implements Serializable {
    private double balance;
    private String accountID;
    private User user;
    
    
public Account (double balance, User user){
    this.balance = balance;
    this.accountID = user.getPhone() + user.getZip();
    this.user = user;
}

public User getUser(){
    return user;
}

public double getBalance(){
    return balance;
}

public void debit(double debit){
    this.balance = balance - debit;
}

public void credit(double credit){
    this.balance = balance + credit;
}
}
