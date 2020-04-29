/*
MAESTRA: Mireya Cacho
DESCRIPCION:
Metodos:
-Busqueda desordenada
-Busqueda ordenada
-Busqueda binaria
-Ordenacion burbuja
-Ordenacion rapida
Fecha:
21/02/20
 */
package tiempoejecucionramirezbriseño;
import java.util.Scanner;
import java.util.Random;
public class MetodosBusquedaOrdenacionRamirezBriseño {
    Scanner leer=new Scanner(System.in);
    static Random rnd=new Random();
    
    int tamaño=10000;
    int n_datos=0;
    int numeros[];
    int num=0,numero;
    
    boolean insertar(){//va devolver un valor
        boolean  cambio = false;
        if(n_datos<=tamaño){
        System.out.println("¿Cuantos numeros vas a ingresar?");
        num=leer.nextInt();
        System.out.println("----------------------");
        
        int auxNum[] = new int[n_datos];//pasando arreglo
         if (n_datos != 0) {
                System.arraycopy(numeros,0,auxNum,0,n_datos);//arreglo,desde donde,arreglo a copiar,desde donde,datos
            }
                if(n_datos+num>tamaño){
            System.out.println(n_datos>0?"Tienes ingresado "+n_datos+" solo puedes ingresar "+(tamaño-n_datos)+" mas":"Memoria insuficiente");//operacion ternaria
        }else{
               numeros = new int[num+n_datos];//pase el arreglo a otro
               if (n_datos != 0) {
                   System.arraycopy(auxNum,0,numeros,0,n_datos);//copiar arreglo
                   cambio = true;
               }
               try{//Atrapar EXEPCIONES los errores
                    for (int i = n_datos; i < num+n_datos; i++) {
                    
                    numeros[i]=leer.nextInt();
                   
                  }
               n_datos = n_datos+num;// n_datos += num;
               }catch(Exception  e){
                   System.out.println("El valor que ingresaste no es entero");
               }
            }
          }
          return cambio;
        } 
    boolean insertarrandom(){
        boolean  cambio1 = false;
        if(n_datos<=tamaño){
        System.out.println("¿Cuantos numeros vas a ingresar?");
        num=leer.nextInt();
        System.out.println("----------------------");
        
        int auxNum[] = new int[n_datos];//pasando arreglo
         if (n_datos != 0) {
                System.arraycopy(numeros,0,auxNum,0,n_datos);//arreglo,desde donde,arreglo a copiar,desde donde,datos
            }
                if(n_datos+num>tamaño){
            System.out.println(n_datos>0?"Tienes ingresado "+n_datos+" solo puedes ingresar "+(tamaño-n_datos)+" mas":"Memoria insuficiente");//operacion ternaria
        }else{
               numeros = new int[num+n_datos];//pase el arreglo a otro
               if (n_datos != 0) {
                   System.arraycopy(auxNum,0,numeros,0,n_datos);//copiar arreglo
                   cambio1 = true;
               }
                    for (int i = 0; i < numeros.length; i++) {
                    numeros[i]=(int)(rnd.nextDouble()*100.0);
                  //  numeros[i]=leer.nextInt();
                        System.out.println(numeros[i]);
                  }
               n_datos = n_datos+num;// n_datos += num;
            }
          }
          return cambio1;
    }
    void mostrar(){
        System.out.println("--Contenido del arreglo--");
        for (int i = 0; i < n_datos; i++) {
             System.out.println(numeros[i]);
        }
    }
    void b_desordenada(){
        boolean band=false;
        System.out.println("Ingresa el numero a buscar");
        numero=leer.nextByte();
                for (int i = 0; i < n_datos; i++) {
                if(numero==numeros[i]){
                System.out.println("Numero encontrado");
                band=true;
                break;
                }
             }
                if(band==false){
                    System.out.println("Numero no encontrado ");   
           }
         }
     
    void b_ordenada(){
       boolean band=false;
       System.out.println("Ingresa el numero a buscar");
       numero=leer.nextByte(); 
       int pos=0;
        //Arrays.sort(numeros);
        for (int n : numeros) {// For each 
            if(numero==n){
                System.out.println("El dato se encontro en la posicion "+pos);
                band=true;
                break;
            }else{
                pos++;
            }
        }
          if(band==false){
              System.out.println("El dato no se encontro en el arreglo");
          } 
    }
    void b_binaria(){
   boolean band=false;
   System.out.println("Ingresa el numero a buscar");
   numero=leer.nextByte(); 
    int centro =Math.round(numeros.length/2);//redondear  Math.ceil 1.2 a 2
 while (centro >= 0 && centro <numeros.length) {//& nomas toma en cuenta la primera
     if ( numeros[centro] == numero ){
         System.out.println("Dato encontrado en la posicion "+centro);
         band=true;
         break;
     }   
     else if ( numeros[centro] < numero ) {
     centro = centro+1;
     } else {
     centro = centro-1;
     }
 }
     if(!band){//! = false
        System.out.println("Dato no encontrado en el arreglo");
    }
 }
       
    void ordenacion_burbuja(){
       int aux;
        for (int i = 0; i < numeros.length-1; i++) {//metodo burbuja
            for (int j = 0; j < numeros.length-i-1; j++) {
                if(numeros[j]>(numeros[j+1])){
                   aux=numeros[j];
                   numeros[j]=numeros[j+1];
                   numeros[j+1]=aux;
                }
            }
        }
    }
    void quicksortNum(int izq,int der){//metodo se llama asi mismo RECURSIVIDAD
        //Arrays.sort(numeros);
        int pivote=numeros[izq];//primera posicion que se toma
        int i=izq;//izq-der
        int j=der;//der-izq
        int aux;
        while(i<j){
            while(numeros[i]<=pivote && i<j){
                i++;
            }
            while(numeros[j]>pivote){
                j--;
            }
                if(i<j){
                    aux=numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=aux;
                }
                
              }
            
        numeros[izq]=numeros[j];
        numeros[j]=pivote;
        if(izq<j-1){
           quicksortNum(izq,j-1);
        }
        if(j+1<der){
           quicksortNum(j+1,der); 
        }   
      }
    }

