
package conversiones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejecucion {
    
   static Scanner leer=new Scanner(System.in);
    static float dato;
    
     public static void getDatosEntradas(){
      
        do{
            try{

            System.out.print("Ingrese la cantidad: ");
            dato=leer.nextFloat();
            break;          
            }catch(InputMismatchException nfe){
            System.out.println("error de ejecucion");  
            leer.nextLine();
            }
            
          
        }while(true);
     }
    
    // *-*-*-*-*-*-*-*-*-*- EJECUCION DEL PROGRAMA -*-*-*-*-*-*-*
    public static void main(String[] args) {
        
 int menu,menu1 = 0; 
 
       // creacion del objeeto   
        Entero objE= new Entero(dato);     
        Decimal objD=new Decimal(dato);
      leerArchivo menus = new leerArchivo();
      menus.Bienvenida();
       
       
         // ciclo para repetir el programa
    do{       
        System.out.println("\n");
        menus.menuGenral();
         
        do{
            try{
            System.out.print("\n ¿Que desea hacer ?: ");
           menu=leer.nextInt(); 
           break;
            }catch(InputMismatchException  nfe){
                System.out.println("Error en la lectura de dato");
                leer.nextLine();
            }
          }while(true);
        
     switch(menu){
     
        case 1:    do{
                    try{
                     getDatosEntradas();
                     objE.cifraGeneral=dato;
                     objD.cifraGeneral=dato;
                      break;
                      }catch(InputMismatchException nfe){
                          System.out.println("errror,ingrese un numero");
                          leer.nextLine();
                      }
                    }while(true);

                menus.MenuOpcionesDeUnidades();
                  
                  do{
                  do{ 
                      try{
                    System.out.print("\nEscoge las siguientes opciones:");
                    menu1=leer.nextInt();
                    break;
                      }catch(InputMismatchException nfe){
                          System.out.println("errror,ingrese un numero");
                          leer.nextLine();
                      }
                    }while(true);
                  
                  }while(menu1<=0||menu1>4);
                  
                switch(menu1){
                  case 1:
                        
                      try{
                        FileWriter file = new FileWriter("txt//nuevo.txt",true);
                        file.write("\nEl numero binario es: "  + objE.conversionB() + objD.conversionB()
                                           + "\nEl numero Octal es: "    + objE.conversionO() + objD.conversionO()
                                           + "\nEl numero Hexadecimal: " + objE.conversionH() + objD.conversionH());
                        file.close();   
                        
                          System.out.println("\nEl numero binario es: "  + objE.conversionB() + objD.conversionB()
                                           + "\nEl numero Octal es: "    + objE.conversionO() + objD.conversionO()
                                           + "\nEl numero Hexadecimal: " + objE.conversionH() + objD.conversionH());

                        }catch(IOException e){
                        System.out.println("Error de E/S "+ e);
                       }break;
                      
                                                                 
                  case 2: 
                         try{
                        FileWriter file = new FileWriter("txt//nuevo.txt",true);
                        file.write("El numero binario es : "     +objE.conversionB() +objD.conversionB()+"\n");
                        file.close();
                        System.out.println(" El numero binario es : "     +objE.conversionB() +objD.conversionB()+"\n");

                    }catch(IOException e){
                        System.out.println("Error de E/S "+ e);
                    }break;
                      
                                
                  case 3:
                        try{
                        FileWriter file = new FileWriter("txt//nuevo.txt",true);
                        file.write("El numero Hexadecimal es: "  +objE.conversionH() +objD.conversionH()+"\n");
                        file.close();
                        
                            System.out.print("El numero Hexadecimal es: "  +objE.conversionH() +objD.conversionH()+"\n");
            

                    }catch(IOException e){
                        System.out.println("Error de E/S "+ e);
                    }break;
                             
                       
                  case 4:
                         try{
                        FileWriter file = new FileWriter("txt//nuevo.txt",true);
                        file.write("El numero octal es: "        +objE.conversionO() +objD.conversionO()+"\n");
                        file.close();
                        
                        
                             System.out.print("El numero octal es: "        +objE.conversionO() +objD.conversionO()+"\n");
            

                    }catch(IOException e){
                        System.out.println("Error de E/S "+ e);
                    }break;                     

                 }
        break;     
        

        case 2:  System.out.println("El historial es....");
            System.out.println(" ");
                 menus.historial();       
            break;
 
        case 3:  
            try{
                       FileWriter file = new FileWriter("txt//nuevo.txt");
                       file.write("");
                       file.close();
            
                        FileReader fileR = new FileReader("txt//nuevo.txt");
                        int valor = fileR.read();
            
                        while(valor != -1 ){
                            System.out.print((char)valor);
                            valor = fileR.read();
                        }
                        System.out.println("");
                        fileR.close();
                    }catch(IOException e){
                        System.out.println("Error de E/S "+ e);
                    }
                break;

        case 4:  System.out.println("Gracias por usar el programa..");
            break;

     }//fin del switch
    
   }while(menu!=4);            
                        

       
}
}// FIn de la CLase EJECUCION


   class leerArchivo{

    public void Bienvenida(){

    try{
       FileReader entrada= new FileReader("txt//BienVenida.txt");
       int c= entrada.read();
       while(c!=-1){
       c=entrada.read();
       char letra=((char)c);
       System.out.print(letra);

    }
    entrada.close();

    }catch(IOException e){
       System.out.println("no se encuentra el archivo");

    }

}
    
  public void menuGenral(){

    try{
      FileReader entrada1= new FileReader("txt//MenuGeneral.txt");
      int c= entrada1.read();
      while(c!=-1){
      c=entrada1.read();
      char letra=((char)c);
      System.out.print(letra);

       }
    entrada1.close();

    }catch(IOException e){
      System.out.println("no se encuentra el archivo");

    }

} 
  
  
public void MenuOpcionesDeUnidades(){

    try{
      FileReader entrada2= new FileReader("txt//MenuOpcionesDeUnidades.txt");
      int c= entrada2.read();
      while(c!=-1){
      c=entrada2.read();
      char letra=((char)c);
      System.out.print(letra);

    }
  entrada2.close();

    }catch(IOException e){
      System.out.println("no se encuentra el archivo");

    }

} 


  
public void historial(){

    try{
      FileReader entrada3= new FileReader("txt//nuevo.txt");
      int c= entrada3.read();
      while(c!=-1){
      c=entrada3.read();
      char letra=((char)c);
      System.out.print(letra);

      }
   entrada3.close();

   }catch(IOException e){
      System.out.println("no se encuentra el archivo");

    }

} 

  
}// fin de la clase