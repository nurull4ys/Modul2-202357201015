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
public class luas_segitiga {
    public static double Lsegitiga(double alas,double tinggi){
        double L = 0.5*alas*tinggi;
        return L;
    }
    public static void main(String[] args) {
        double alas,tinggi;
        alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai alas : "));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai tinggi : "));
        JOptionPane.showMessageDialog(null,"Luas Segitiga = " + Lsegitiga(alas,tinggi));
    }
}
