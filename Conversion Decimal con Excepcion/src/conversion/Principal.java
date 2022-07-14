
package conversion;

import java.util.Scanner;


public class Principal {//principal
    
 static Scanner leer= new Scanner(System.in);
 
    static float dato;
   
    // metodo que da bienvenida
     private static String bienVenida(){


return "\n *-*-*-*-*-*    Bienvenido/a   -*-*-*-*-*-**-*-**--*" +
        "\n Conversión de unidades \n" +
" Mediante la realización del proyecto se pretende dar solución a la conversión "
    + "\n entre unidades decimales a sus distintas equivalencias, "
    + "\n tanto en binario, hexadecimal y octal, con el fin de sistematizar y"
    + "\n ejemplificar los métodos mediante la elaboración del software,"
    + "\n el cual cuente con los recursos necesarios para dar soluciones a las conversiones de ejercicios planteados"
    + "\n con el fin de verificar resultados si así se requiere. ";



}
    // metodo que adquiere los datos
 public static void getDatosEntradas(){/////
 
    
       System.out.print("Ingrese la cantidad: ");
          do{
           dato=leer.nextFloat();
           }while(dato<0);
  }




        
    // CODIGO MAIN   *-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
    
    public static void main(String[] args){
    
        int menu,menu1 = 0; 

      //  conversionDecimal objE= new conversionDecimal(dato);// creacion del objeeto        
        ConversionD objD=new ConversionD(dato);
      
       System.out.println( bienVenida() );  
       
    do{         // ciclo para repetir el programa
      
         System.out.println( objD.mostrarMenuGeneral() );
        do{
            System.out.print("Que desea hacer ?: ");
           menu=leer.nextInt();          
          }while(menu<=0||menu>3  );
        
     switch(menu){
     
         case 1:  getDatosEntradas();
                  objD.cifra =dato;
                  System.out.println( objD.mostrarOpciones() );
                  do{ 
                    System.out.print("Escoge las siguientes opciones:\n");
                    menu1=leer.nextInt();
                    }while(menu1<=0 ||menu1>4);
                
                 switch(menu1){
                  case 1: System.out.println(objD.mostrarUnidades()); break;
                  case 2: System.out.print("El numero binario es : "+objD.conversionBinariaE()+objD.conversionBinariaD()+"\n");
                  break;
                  case 3: System.out.print("El numero Hexadecimal es: "+objD.conversionHexE()+objD.conversionHexD()+"\n");
                  break;
                  case 4: System.out.print("El numero octal es: "+objD.conversionOctalE()+objD.conversionOctalD()+"\n");
                  break;}
        break;     
        

         case 2:   System.out.println("Gracias por usar el programa..");
         break;
                        

     }
    
   }while(menu!=2);            
                        

         
     
     
    

    
    }}//Fin de main   
