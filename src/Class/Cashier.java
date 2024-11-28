/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.sql.Date;

/**
 *
 * @author dkalh
 */
public class Cashier {

    public static void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private int CashierID;
    private String firstName;
    private String lastName;
    private String gender;
    private String AccountType;
    private Date dateOfBirth;
    private String PhoneNo;

    public Cashier(int CashierID, String firstName, String lastName, String gender, String AccountType, String PhoneNo) {
        this.CashierID = CashierID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.AccountType = AccountType;
        this.dateOfBirth = dateOfBirth;
        this.PhoneNo = PhoneNo;
    }

    public int getCashierID() {
        return CashierID;
    }

    public void setCashierID(int CashierID) {
        this.CashierID = CashierID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }
    
}
