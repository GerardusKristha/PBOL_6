package exceptionHandling_1;

import java.util.Scanner;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Lat1_edit1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jarak Perjalanan Anda(km): ");
        int jarak = input.nextInt();
        System.out.print("Masukkan banyak bensin yang di habiskan(liter): ");
        int liter = input.nextInt();
        
        int konsumsi = 0;
        try{
            konsumsi = jarak/liter;
        }catch(Exception e){
            konsumsi=0;
        }
        System.out.println("Konsumsi BBM anda adalah : "+ konsumsi+" km/liter");
    }
}
