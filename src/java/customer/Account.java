package customer;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import business.User;

@Entity
public class Account implements Serializable{

    Account(double d, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public enum AccountType { CHECKING, SAVINGS }    
    
    private AccountType accountType;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;

  
  
    private User user;
    
    private double balance;
    
    //No Arg Construstor
    public Account() {
    }
   
    public Account(User user, double balance, AccountType accountType ) {
        this.accountId = accountId;
        this.user = user;
        this.balance = balance;
        this.accountType = accountType;
    }
    
    
     public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public AccountType getAccountType() {
        return accountType;
        
    }
    
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;   
    }
    
    public void credit(double credit) {
        balance += credit;
    }
    
    public void debit(double debit) {
        balance -= debit;
    } 
}