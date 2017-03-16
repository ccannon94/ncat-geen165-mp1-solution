/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp1_solution;

import java.util.ArrayList;

/**
 *
 * @author CCannon
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String dob;
    private String address;
    private String phoneNumber;
    private int customerId;
    private int pin;
    ArrayList<Account> accounts;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * @return number of Account objects in ArrayList
     */
    public int getNumAccounts() {
        return accounts.size();
    }

    /**
     * @param index of the Account user would like to access
     * @return Account at given index
     */
    public Account getAccount(int index) {
        return accounts.get(index);
    }

    /**
     * @param index where user would like to insert Account
     * @param item Account to be added to ArrayList
     */
    public void setAccount(int index, Account item) {
        accounts.set(index, item);
    }

    /**
     * @param item to add to ArrayList
     */
    public void addAccount(Account item) {
        accounts.add(item);
    }
    
    /**
     * @param index of Account to remove
     * @return Account removed from ArrayList
     */
    public Account deleteAccount(int index){
        return accounts.remove(index);
    }
}
