
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author ketin renta 
 * nim:2201010567
 * tgl : 2024-29-04
 */
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        System.out.println("Nilai Alas: ");
        float nAlas = dIN.nextFloat();
        
        System.out.println("Nilai Tinggi: ");
        float nTinggi = dIN.nextFloat();
        
        Luassegi3 LS = new Luassegi3(nAlas,nTinggi);
        
        //LS.setALAS(71);
       // LS.setTINGGI(86);
        LS.HLuassegi3();
        
       System.out.println("Nilai Alas: " + LS.getALAS());
       System.out.println("Nilai Tinggi: " + LS.getTINGGI());
       System.out.println("jadi luas segi tiga: ");
       System.out.println("luas = 0.5 X Alas X Tinggi");
       System.out.println("luas = 0.5 X "+ LS.getALAS()+" X "+LS.getTINGGI());
       System.out.println("     = " + LS.getLUAS());
    }
    
}
