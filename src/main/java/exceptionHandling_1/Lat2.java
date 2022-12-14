package exceptionHandling_1;

import javax.swing.JOptionPane;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class Lat2 {
    public static void main(String[] args) {
        String inputStr = JOptionPane.showInputDialog(null, "Masukkan umur anda!");
        int age = 0;
        try {
            age = Integer.parseInt(inputStr);
        } catch (Exception e) {
            age = 0;
            System.out.println("Input tidak sesuai!");
        }
        System.out.println("Umur anda : " + age + " tahun");
    }

}



//    public static void main(String[] args) {
//        String inputStr = JOptionPane.showInputDialog(null, "Masukkan umur anda!");
//        int age = Integer.parseInt(inputStr);
//
//        System.out.println("Umur anda : " + age + " tahun");
//    }