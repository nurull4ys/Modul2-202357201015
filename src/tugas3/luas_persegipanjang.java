/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class luas_persegipanjang {
    public static double Lpersegipanjang(double panjang,double lebar){
        double L = panjang*lebar;
        return L;
    }
    public static void main(String[] args) {
        double panjang, lebar;
        panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai panjang : "));
        lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai lebar : "));
        JOptionPane.showMessageDialog(null,"Luas Persegi Panjang = " + Lpersegipanjang(panjang,lebar)); 
    }
    
}
