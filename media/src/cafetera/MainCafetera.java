
package cafetera;

public class MainCafetera {

    public static void main(String[] args) {

        Cafetera Mcafe=new Cafetera();
        
        Mcafe.ServirTaza(50);
       
        System.out.println("Acabas de llenar la cafetera al maximo, la capidad actual es de : "+ Mcafe.llenarCafetera()+" cc");
        System.out.println("la capacidad actual es: "+Mcafe.getCapacidadAct()+" cc");
        Mcafe.ServirTaza(50);
        System.out.println("la capacidad actual es: "+Mcafe.getCapacidadAct()+" cc");
        
        System.out.println("Acabas de vaciar la cafetera, la capacidad actual es de: "+ Mcafe.vaciarCafetera()+" cc");
        System.out.println("Acabas de agregar cafe la cantidad de:  " + Mcafe.agregarCafe(600)+" cc");
        
                

    }
    
}
