/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.p1;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class Taller1P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // VARIABLE
        int x, total;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        
        //proceso
        {
        total = 2 * x;
    }
        JOptionPane.showMessageDialog(null,"El doble de " + x + " es: " + total);
        
        System.exit(0);
    }
    
}
