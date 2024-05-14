/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package custo;
import javax.swing.JOptionPane;
public class Custo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hellw World");
        
        boolean meta = true;
        boolean beta = false;
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja repetir");
        
        meta = (resposta == JOptionPane.YES_OPTION);
        beta = (resposta == JOptionPane.NO_OPTION);
        
        if(meta == true) JOptionPane.showMessageDialog(null, "validação 1");
        if(beta == true) JOptionPane.showMessageDialog(null, "Confimação 2");
    }
    
}
