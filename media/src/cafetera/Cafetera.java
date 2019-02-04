
package cafetera;


public class Cafetera {
    
   final private int capacidadMax;
    private int capacidadAct;
   
 public Cafetera()
 {
    capacidadMax=1000;
     capacidadAct=0;
 }
 public Cafetera(int X)
 {
              this.capacidadMax=X;
              this.capacidadAct=this.capacidadMax;

 }
 public Cafetera(int CM,int CA)
 {
     this.capacidadMax=CM;
     this.capacidadAct=CA;
       if (CA>CM)
           CA=CM;
 }
         public int getCapacidadMax()
         {
             return capacidadMax;
         }
         public int getCapacidadAct()
         {
             return capacidadAct;
         }
         public void setCapacidadAct(int CA)
         {
             this.capacidadAct=CA;
         }
         public int llenarCafetera()
                 
         {
            this.capacidadAct=this.capacidadMax;
             
            return this.capacidadAct;
         }
         public int vaciarCafetera()
         {
             this.capacidadAct=0;
             
             return this.capacidadAct;
         }
         public void ServirTaza(int cantVertida)
                 
         {
           if (this.capacidadAct<cantVertida)
               
               cantVertida=this.capacidadAct;
           
               this.capacidadAct=this.capacidadAct-cantVertida;
            if(capacidadAct<=0){
                
             System.out.println("No hay cantidad suficiente");
                                    
            }
            
            else
            {
                System.out.println("La cantidad vertida es " + cantVertida+" cc");
            }
              
        }
         
         public int agregarCafe(int x)
         {
             
             this.capacidadAct+=x;
             
                     return this.capacidadAct;
         }
         
  }

