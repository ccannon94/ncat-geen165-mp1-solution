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

    public CyberBank(){
        bankName = "";
        address = "";
        phoneNumber = "";
        bankBalance = 0.0;
        customers = new ArrayList<>();
    }
    
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
    
    /**
     * @return number of Customer objects in ArrayList
     */
    public int getNumCustomers(){
        return customers.size();
    }
    
    /**
     * @param index where requested customer is located
     * @return Customer at given index
     */
    public Customer getCustomer(int index){
        return customers.get(index);
    }
    
    /**
     * @param index to insert given Customer in ArrayList
     * @param item Customer object to add
     */
    public void setCustomer(int index, Customer item){
        if(customers.size() > index){
            for(int i = 0; i < customers.get(i).getNumAccounts(); i ++){
                bankBalance -= customers.get(i).getAccount(i).getBalance();
            }
        }
        
        for(int i = 0; i < item.getNumAccounts(); i ++){
            bankBalance += item.getAccount(i).getBalance();
        }
        
        customers.set(index, item);
    }
    
    /**
     * @param item Customer to add to ArrayList
     */
    public void addCustomer(Customer item){
        for(int i = 0; i < item.getNumAccounts(); i ++){
            bankBalance += item.getAccount(i).getBalance();
        }
        
        customers.add(item);
    }
    
    /**
     * @param index of Customer to remove in ArrayList
     * @return Customer that has been removed
     */
    public Customer deleteCustomer(int index){
        for(int i = 0; i < customers.get(i).getNumAccounts(); i ++){
            bankBalance -= customers.get(i).getAccount(i).getBalance();
        }
        
        return customers.remove(index);
    }
    
    public Customer authenticateCustomer(int custId, int pin){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getCustomerId() == custId && customers.get(i).getPin() == pin){
                return customers.get(i);
            }
        }
        
        return null;
    }
    
    public void loadBankData(String inputFileName){
        
    }
    
    public void saveBankData(String outputFileName){
        
    }
    
    @Override
    public String toString(){
        String customersString = "";
        
        for(int i = 0; i < customers.size(); i++){
            customersString += System.lineSeparator() + customers.get(i).toString();
        }
        
        return bankName + "#" + address + "#" + phoneNumber + customersString;
    }
}
