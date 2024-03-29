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
public class luaslingkaran {
    public static double luaslingkaran(double phi,double r){
        double luas = phi * r *r;
        return luas;
    }
    public static void main(String[] args) {
        double phi = 3.14;
        double jari2 ;
        jari2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Jari-jari : "));
        JOptionPane.showMessageDialog(null,"Luas lingkaran : "+luaslingkaran(phi,jari2));
    }
}
