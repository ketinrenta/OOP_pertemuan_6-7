
package latihanpersegi;

/**
 *
 * @author user
 */
public class luaspersegi {
    public float sisi1,sisi2,luas;
    public luaspersegi(float S1,float S2){
        sisi1 =  S1;
        sisi2 = S2;
    }
    
   public void setSISI1( float nVAL){
      sisi1 = nVAL;
              
  }
  public float getSISI1(){
      return sisi1;
  }
  public void setSISI2( float nVAL){
      sisi2  = nVAL;
  }
   public float getSISI2(){
      return sisi2;
    }
    public void  HLuaspersegi(){
       luas = (this.sisi1*this.sisi2);
   }
   public float getLUAS(){
       return luas ;
   }
}
