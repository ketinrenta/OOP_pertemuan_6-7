
package pertemuan7;

/**
 *
 * @author keetin renta
 * nim : 2201010567 
 * tgl : 2024-05-06
 */
public class induk {
    private String nama;
    public int nilai = 0;
    
public induk(String nm, int nl){
    nama = nm;
    nilai = nl;
            
}
    
    public void setNAMA(String nVAL){
        //nama = nVal;
        this.nama = nVAL;
    }
    public void setNAMA(){
        this.nama = " saya siapa?";
    }
    public String getNAMA(){
        return this.nama;
    }
    public void cetakNAMA(){
        System.out.printf("isi variabel nama : %s dengan tinggi  badan %d\n\n",this.nama,this.nilai);
    }
}
