
package pertemuan6;

/**
 *
 * @author ketin renta
 * nim : 2201010567
 * tgl : 2024-29-04
 */
public class Luassegi3 {
  private float alas, tinggi,luas;
  
   public  Luassegi3(float AL,float Tg){
       alas = AL;
       tinggi = Tg;
   
   }
          
          
          
  
  public void setALAS( float nVAL){
      this.alas = nVAL;
      alas = nVAL;
              
  }
  public float getALAS(){
      return alas;
  }
  public void setTINGGI( float nVAL){
      tinggi  = nVAL;
  }
   public float getTINGGI(){
      return tinggi;
  }
   public void  HLuassegi3(){
       luas = (this.alas*this.tinggi)/2;
   }
   public float getLUAS(){
       return luas ;
   }
}
