/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aritmatic;

/**
 *
 * @author User
 */
public class Aritmatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        int bil = 10/0;
        System.out.println(bil);
        }catch (ArithmeticException n){
            System.out.println(n.getMessage());  
        }
    }
    
}
