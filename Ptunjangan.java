/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptunjangan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ptunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner (System.in);
        
        System.out.println("======= Program Tunjangan =======");
        System.out.print("Gaji Pokok/Bulan = ");
        int gajiPokok = masukan.nextInt();
        System.out.print("Status Anda (Menikah/Belum) = ");
        String status = masukan.next();
        
        double tunjangan,total;
        if (status.equalsIgnoreCase("Menikah") || status.equalsIgnoreCase("menikah")){
            tunjangan = gajiPokok * 35/100;
            total = gajiPokok + tunjangan;  
        }else{
            tunjangan = 0;
            total = gajiPokok + tunjangan;
        }
        
        System.out.println("======= Hasil Gaji Anda =======");
        System.out.println("Gaji Pokok\t = "+gajiPokok);
        System.out.println("Tunjangan\t = "+tunjangan);
        System.out.println("Total\t\t = "+total);
        System.out.println("Developed by : Tassyakur Pasya");
            
    }
    
}
