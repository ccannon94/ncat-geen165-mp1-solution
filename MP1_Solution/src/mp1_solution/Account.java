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
public class Account {
    private AccountType accountType;
    private String accountNumber;
    private double balance;
    ArrayList<Transaction> transactions;

    /**
     * @return the accountType
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
     * @return number of Transaction objects in ArrayList transactions
     */
    public int getNumTransactions(){
        return transactions.size();
    }
    
    /**
     * @param index of the Transaction
     * @return Transaction stored at given index
     */
    public Transaction getTransactions(int index){
        return transactions.get(index);
    }
    
    /**
     * @param index location in ArrayList to add item
     * @param item Transaction to be added
     */
    public void setTransaction(int index, Transaction item){
        if(transactions.size() > index){
            switch(transactions.get(index).getTransactionType()){
                case debit:
                    balance += transactions.get(index).getAmount();
                    break;
                case credit:
                    balance -= transactions.get(index).getAmount();
                    break;
                default:
                    break;
            }
        }
        
        switch(item.getTransactionType()){
            case debit:
                balance -= item.getAmount();
                break;
            case credit:
                balance += item.getAmount();
            default:
                break;
        }
        
        transactions.set(index, item);
    }
    
    /**
     * @param item to be appended to ArrayList
     */
    public void addTransaction(Transaction item){
        switch(item.getTransactionType()){
            case debit:
                balance -= item.getAmount();
                break;
            case credit:
                balance += item.getAmount();
            default:
                break;
        }
        
        transactions.add(item);
    }
    
    /**
     * @param index of Transaction to remove
     * @return the Transaction that was removed from ArrayList
     */
    public Transaction deleteTransaction(int index){
        switch(transactions.get(index).getTransactionType()){
            case debit:
                balance += transactions.get(index).getAmount();
                break;
            case credit:
                balance -= transactions.get(index).getAmount();
                break;
            default:
                break;
        }
        
        return transactions.remove(index);
    }
    
}
