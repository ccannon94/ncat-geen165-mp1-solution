/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp1_solution;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

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
        String inputFile = "";
        String outputFile = "";
        
        if(args.length == 0){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            
            int openResult = fileChooser.showOpenDialog(null);
            if(openResult == JFileChooser.APPROVE_OPTION){
                inputFile = fileChooser.getSelectedFile().getAbsolutePath();
            }
            
            int saveResult = fileChooser.showSaveDialog(null);
            if(saveResult == JFileChooser.APPROVE_OPTION){
                outputFile = fileChooser.getSelectedFile().getAbsolutePath();
            }
        }else{
            inputFile = args[0];
            outputFile = args[1];
        }
        
        ATM_UI activeATM = new ATM_UI(bank, inputFile, outputFile);
        activeATM.setVisible(true);
        activeATM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
