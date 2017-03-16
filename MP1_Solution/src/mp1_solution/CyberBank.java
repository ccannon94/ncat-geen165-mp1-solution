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
public class CyberBank {
    private String bankName;
    private String address;
    private String phoneNumber;
    private double bankBalance;
    ArrayList<Customer> customers;

    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
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
     * @return the bankBalance
     */
    public double getBankBalance() {
        return bankBalance;
    }

    /**
     * @param bankBalance the bankBalance to set
     */
    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
}
