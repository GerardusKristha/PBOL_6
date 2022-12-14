package exceptionHandling_1;

import java.util.Scanner;

/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class Cal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1 = 0;
        int bilangan2 = 0;
        boolean correct = false;
        do {
            try {
                System.out.print("Masukkan bilangan 1 : ");
                bilangan1 = input.nextInt();
                correct = true;
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input, mohon di ulangi!");
                input.next();
            }
        } while (!correct);
        correct = false;
        do {
            try {
                System.out.print("Masukkan bilangan 2 : ");
                bilangan2 = input.nextInt();
                correct = true;
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input, mohon di ulangi!");
                input.next();
            }
        } while (!correct);
        
        int hasil = bilangan1+bilangan2;
        System.out.println("Hasil penjumlahan kedua bilangan itu : " + hasil);
    }
}
