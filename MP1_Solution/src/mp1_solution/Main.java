/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp1_solution;

import javax.swing.JOptionPane;

/**
 *
 * @author CCannon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CyberBank bank = new CyberBank();
        bank.setAddress("1601 E Market St, Greensboro, NC 27401");
        bank.setBankName("Aggie Federal Credit Union");
        bank.setPhoneNumber("111-222-3333");
        
        Customer cust1 = new Customer();
        cust1.setFirstName("Chris");
        cust1.setLastName("Cannon");
        cust1.setAddress("123 Main St, Matthews, NC 28105");
        cust1.setDob("3/10/1994");
        cust1.setPhoneNumber("123-456-7890");
        cust1.setPin(1234);
        cust1.setCustomerId(11234455);
        
        Account myAcct = new Account();
        myAcct.setAccountNumber("abc1230");
        myAcct.setAccountType(AccountType.checking);
        
        Transaction trans1 = new Transaction();
        trans1.setAmount(350.25);
        trans1.setDate("1/1/15");
        trans1.setDescription("Direct deposit");
        trans1.setTransactionType(TransactionType.credit);
        
        myAcct.addTransaction(trans1);
        
        Transaction trans2 = new Transaction();
        trans2.setAmount(5.95);
        trans2.setDate("2/5/15");
        trans2.setDescription("Chickfila point of sale");
        trans2.setTransactionType(TransactionType.debit);
        
        myAcct.addTransaction(trans2);
        
        cust1.addAccount(myAcct);
        
        Account myAcct2 = new Account();
        myAcct2.setAccountNumber("sg343f");
        myAcct2.setAccountType(AccountType.savings);
        
        Transaction trans3 = new Transaction();
        trans3.setAmount(550);
        trans3.setDate("1/3/15");
        trans3.setDescription("Check deposit");
        trans3.setTransactionType(TransactionType.credit);
        
        myAcct2.addTransaction(trans3);
        
        cust1.addAccount(myAcct2);
        
        bank.addCustomer(cust1);
        
        Customer cust2 = new Customer();
        cust2.setFirstName("Jim");
        cust2.setLastName("Bob");
        cust2.setAddress("321 1st St, Anytown, NC 12345");
        cust2.setDob("11/8/1960");
        cust2.setCustomerId(24681012);
        cust2.setPhoneNumber("800-867-5309");
        cust2.setPin(9876);
        
        Account hisAcct = new Account();
        hisAcct.setAccountNumber("djf3r4rh84yh4");
        hisAcct.setAccountType(AccountType.investment);
        
        Transaction trans4 = new Transaction();
        trans4.setAmount(15000.35);
        trans4.setDate("4/3/15");
        trans4.setDescription("401k rollover");
        trans4.setTransactionType(TransactionType.credit);
        
        hisAcct.addTransaction(trans4);
        
        cust2.addAccount(hisAcct);
        
        bank.addCustomer(cust2);
        
        JOptionPane.showMessageDialog(null, bank.toString());
    }
    
}
