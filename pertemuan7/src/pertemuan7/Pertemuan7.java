
package pertemuan7;

/**
 *
 * @author ketin  renta
 * nim : 2201010567
 * tgl : 2024-05-06
 */
public class Pertemuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       induk a2 = new induk();
       turunan al = new turunan();
       
       System.out.println("1. isi dari variabel nama : " +al.getNAMA());
       al.setNAMA("kristiana ketin renta");
       System.out.println("2. isi dari variabel nama : " +al.getNAMA());
       
       al.setNAMA();
       System.out.println("3. isi dari variabel nama : " +al.getNAMA());
       
       a2.cetakNAMA();
       al.cetakNAMA();
    }
    
}
