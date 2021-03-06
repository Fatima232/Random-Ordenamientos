/*
DESCRIPCION:
Main
1 Insertar(numero de elementos que indique el usuario-n- de 1 a 10 enteros)
2 Mostrar arreglo
3 Busqueda
 3.1 Secuencial con arreglo Desordenado
 3.2 Secuencial con arreglo ordenado
 3.3 Binaria
 3.4 Regresar
4 Ordenancion
 4.1 Metodo burbuja
 4.2 Quick sort
 4.3 Regredar
5 Salir
Fecha:
20/04/2020
 */
package tiempoejecucionramirezbriseño;
import java.util.Scanner;
public class TiempoEjecucionRamirezBriseño {

    static MetodosBusquedaOrdenacionRamirezBriseño b= new MetodosBusquedaOrdenacionRamirezBriseño();
    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
   
      byte opcion,opb,opo,opi;
      boolean arreglo=false;
      boolean arreglo2=false;
      boolean arreglo3=false;
       do{
           System.out.println("_____M E N U_____\n " +
                   "Opcion 1:Insertar numeros\n " +
                   "Opcion 2:Mostrar arreglo\n " +
                   "Opcion 3:Busqueda\n " +
                   "Opcion 4:Ordenacion\n " +
                   "Opcion 5:nanoTime\n" +
                   "Opcion 6:Salida");
           opcion=leer.nextByte();
           switch(opcion){
               case 1:
                   System.out.println("_____I N S E R T A R _____\n" +
                           "opcion 1:Manual\n" +
                           "Opcion 2:Random\n" +
                           "Opcion 3:Regresar");
                   opi=leer.nextByte();
                   switch(opi){
                       case 1:
                            boolean cambio = b.insertar();
                            if (cambio) {
                       arreglo2=false;
                       arreglo3=false;
                   }
                   arreglo=true;
                       break;
                       case 2:
                            boolean cambio1 = b.insertarrandom();
                           if (cambio1) {
                       arreglo2=false;
                       arreglo3=false;
                   }
                   arreglo=true;
                       case 3:
                   }
               break;
               case 2:
                  if(arreglo==true){
                     b.mostrar();   
                   }else{
                       System.out.println("Error no se han ingresado numeros");
                   }
               break;
               case 3:{
                   if(arreglo==true){
                       System.out.println("_____B U S Q U E D A_____\n " +
                           "opcion 1:Secuencial con arreglo desordenado\n " +
                           "Opcion 2:Secuencias con arreglo ordenado\n " +
                           "Opcion 3:Binaria\n " +
                           "Opcion 4:Regresar");
                        opb=leer.nextByte();
                   switch(opb){
                       case 1:
                           double tiempoInicial=System.nanoTime();
                           b.b_desordenada();
                           double tiempoFinal=System.nanoTime();
                           double tiempoTotal=tiempoFinal-tiempoInicial;
                           System.out.println("El tiempo de ejcucion es: "+tiempoTotal/1000000000);
                       break;
                       case 2:
                           double tiempoInicial2=System.nanoTime();
                           if(arreglo2==true){
                           b.b_ordenada();
                           }else{
                               System.out.println("Error el arreglo no se ha ordenado");
                           }
                           double tiempoFinal2=System.nanoTime();
                           double tiempoTotal2=tiempoFinal2-tiempoInicial2;
                           System.out.println("El tiempo de ejcucion es: "+tiempoTotal2/1000000000);
                       break;
                       case 3:
                           double tiempoInicial3=System.nanoTime();
                           if(arreglo2==true){                         
                           b.b_binaria();                          
                           }else{
                               System.out.println("Error el arreglo no se ha ordenado");
                           }
                           double tiempoFinal3=System.nanoTime();
                           double tiempoTotal3=tiempoFinal3-tiempoInicial3;
                           System.out.println("El tiempo de ejcucion es: "+tiempoTotal3/1000000000);
                       break;
                       case 4:  
                   }
                      
                   }else{
                       System.out.println("Error no se han ingresado numeros");
                       
                   }
                  
               }
               break;
               case 4:{
                    if(arreglo==true){
                   System.out.println("_____O R D E N A C I O N_____\n " +
                           "Opcion 1:Metodo burbuja\n " +
                           "Opcion 2:Quick Sort\n " +
                           "Opcion 3:Regresar");
                   opo=leer.nextByte();
                   switch(opo){
                       case 1:
                           double tiempoInicial4=System.nanoTime();
                           if(arreglo3==false){                          
                           b.ordenacion_burbuja();                           
                           arreglo2=true;
                           arreglo3=true;
                           }else{
                               System.out.println("Error el arreglo ya ha sido ordenado anteriormente");
                           }
                           double tiempoFinal4=System.nanoTime();
                           double tiempoTotal4=tiempoFinal4-tiempoInicial4;
                           System.out.println("El tiempo de ejcucion es: "+tiempoTotal4/1000000000);
                       break;
                       case 2:
                           double tiempoInicial5=System.nanoTime();
                           if(arreglo3==false){                          
                           b.quicksortNum(0,b.numeros.length-1);//llamada del quick sort donde le asignamos valore                          
                           arreglo2=true;
                           arreglo3=true;
                           }else{
                               System.out.println("El arreglo ya fue ordenado anteriormente");
                           }
                           double tiempoFinal5=System.nanoTime();
                           double tiempoTotal5=tiempoFinal5-tiempoInicial5;
                           System.out.println("El tiempo de ejcucion es: "+tiempoTotal5/1000000000);
                       break;
                       case 3:
                        
                   }
                     }else{
                       System.out.println("Error no  se han ingresado numeros");
                       
                   }
               }
               break;
               case 5:
                   System.out.println("Saliendo....");
               break;
               default:
                   System.out.println("Lo siento la opcion "+opcion+" no existe");
           }
       }
       while(opcion!=5);
    } 
}
              