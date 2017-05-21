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
        // TODO code application logic here
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
        
        JOptionPane.showMessageDialog(null, myAcct.toString());
    }
    
}
