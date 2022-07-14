
package conversiones;
public class Decimal extends Entero{
    
    //atributo
private int aux=0;
private int entero;
private float parteD;

//metodo constructor
    public Decimal(float cifraGeneral) {
        super(cifraGeneral);
    }
// metodo para traducir la parte Decimal a binario
     @Override
    String conversionB() {
      String almacen=" ";
    entero=(int) cifraGeneral;      
    parteD=cifraGeneral-entero;
       
    if(parteD>0){
         do{             
           parteD = parteD*2;
           aux=(int) parteD;
             if(parteD>=1){
              almacen=almacen+1;
               parteD=parteD-aux;
               }else{
              almacen=almacen+0;         
               }       
        }while(parteD != 0.0);
           return "."+almacen;
    }else
       return " ";
    }  

      //metodo para traducir la parte decimal  a octal
    @Override
    String conversionO() {   
        
     String almacen=" ";

   entero= (int) cifraGeneral;

   parteD=cifraGeneral-entero;

   if(parteD>0){// checar!!
    do{
      parteD=parteD*8;
      aux=(int) parteD;
      if(parteD>=1){
       almacen=almacen+aux;
       parteD=parteD-aux;
       }else
       almacen=almacen+0;

    }while(parteD !=0.0);
 return "."+almacen;
   
   }else
       return " ";
  
    }
    
// metodo para traducir la cifra decimal a Hexadecimal
    @Override
    String conversionH() {   
    
     String almacen=" ";
      entero= (int) cifraGeneral;
      parteD=cifraGeneral-entero;
     if(parteD>0) {
      do{
        parteD=parteD*16;
        aux=(int) parteD;
         if(parteD>=1){
            switch(aux){
             case 10: almacen=almacen+"A";break;
             case 11: almacen=almacen+"B";break;
             case 12: almacen=almacen+"C";break;
             case 13: almacen=almacen+"D";break;
             case 14: almacen=almacen+"E";break;
             case 15: almacen=almacen+"F";break;
             default:  almacen=almacen+aux;break;
            }
      
        parteD=parteD-aux;
         }else
            almacen=almacen+0;      
        }while(parteD !=0.0);
      
   return "."+almacen;
     }else
         return " ";
    
    }  
    

  
  
@Override
    String informacion(){

    return 
         "\n -------- ESCOGE LAS SIGUIENTES OPCIONES ---------"
         +" \n 1.- Mostrar todas las unidades \n 2.- Conversion Binaria "
         + "\n 3.- Conversion Hexadecimal     \n 4.- Conversion Octal " ;

}
      
      
    

    
    
}//fin de la clase Decimal
