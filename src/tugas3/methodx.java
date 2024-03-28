/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class methodx {
   /* public double luas_lingkaran(int diameter) {
        int jari2 = diameter/2;
        double luas = Math.PI * Math.pow(jari2,2);
        return luas;
    }
    public static void main(String[] args) {
        methodx mt = new methodx();
        System.out.println(mt.luas_lingkaran(20));
        System.exit(0);
    }*/
    public double volume_tabung(double tinggi, int jari2){
        return tinggi + jari2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //deklarasi variabel
        int r;
        double t, vt;   //vt: volume tabung
        
        //input
        System.out.print("Masukkan nilai jari-jari : ");
        r = input.nextInt();
        System.out.print("Masukkan nilai tinggi : ");
        t = input.nextDouble();
        //proses
        vt = Math.PI*Math.pow(r, 2)*t;
        //output
        System.out.println(vt);
               
    }
}
