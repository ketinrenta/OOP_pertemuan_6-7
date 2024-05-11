
package latihanpersegi;

import java.util.Scanner;

/**
 *
 * @author ketin renta 
 * nim:2201010567
 * tgl : 2024-29-04
 */
public class Latihanpersegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner dIN = new Scanner(System.in);
        System.out.println("Nilai sisi1: ");
        float nSisi1 = dIN.nextFloat(); 
        System.out.println("Nilai sisi2: ");
        float nSisi2 = dIN.nextFloat();
        luaspersegi LP = new luaspersegi(nSisi1,nSisi2);
        System.out.println("Nilai  keliling sisi: ");
          float nSisi = dIN.nextFloat();
        kelilingpersegi KP = new kelilingpersegi(nSisi);
        //LS.setALAS(71);
       // LS.setTINGGI(86);
        LP.HLuaspersegi();
        KP.Kkelilingpersegi();
        
        
       System.out.println("HITUNG LUAS PERSEGI");
       System.out.println("Nilai sisi1: " + LP.getSISI1());
       System.out.println("Nilai sisi2: " + LP.getSISI2());
       System.out.println("jadi luas persegi : ");
       System.out.println("luas = SISI X SISI ");
       System.out.println("luas = "+ LP.getSISI1()+" X "+ LP.getSISI2());
       System.out.println("     = " + LP.getLUAS());
       
       
       System.out.println("HITUNG KELILING PERSEGI");
       System.out.println("Nilai sisi: " + KP.getSISI());
       System.out.println("jadi keliling persegi : ");
       System.out.println("keliling = 4 X SISI ");
       System.out.println("keliling = "+ 4 +" X "+ KP.getSISI());
       System.out.println("     = " + KP.getKELILING());
    
    
    }
    
}
