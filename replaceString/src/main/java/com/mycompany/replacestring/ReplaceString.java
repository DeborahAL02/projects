/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.replacestring;

import javax.swing.JOptionPane;

/**
 *
 * @author Deborah
 */
public class ReplaceString {
// replace an old value with a new one the first vale is the old one and the second value is the new value

    public static void main(String[] args) {
        String myInput = JOptionPane.showInputDialog("Enter your value");
        
        String newString = myInput.toLowerCase();

        if (newString.contains("a") || myInput.contains("A")) {

            String myInput2 = myInput.replace('a', 'm');//convert to lower case

            JOptionPane.showMessageDialog(null, "The string original string: \n" + newString.length());

            JOptionPane.showMessageDialog(null, "The updated string: \n" + myInput2);
        } else
            
        {
            JOptionPane.showMessageDialog(null, "The string does not contain an a !!!");
        }
    }
}
