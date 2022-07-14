

package conversion;

public class ConversionD extends conversionDecimal {
//atributo
private int aux=0;
private int entero;
private float parteD;


//metodo constructor
    public ConversionD(float cifra) {
        super(cifra);
    }
    
    
 // metodo para traducir la parte Decimal a binario
  public String conversionBinariaD(){

        
   String almacen=" ";
    entero=(int) cifra;      
    parteD=cifra-entero;
       
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
  
  // metodo para traducir la cifra decimal a octal
 public String conversionOctalD(){
 
 String almacen=" ";

   entero= (int) cifra;

   parteD=cifra-entero;

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
 
   
  //metodo para traducir la cifra decimal a hexadecimal
  public String conversionHexD(){

      
      String almacen=" ";
      entero= (int) cifra;
      parteD=cifra-entero;
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
  
  
   //es un metodo que muestra las conversiones de todas las unidades 
      public String mostrarUnidades(){
  
      return "\nEl numero binario es: "+conversionBinariaE()+conversionBinariaD()
      +"\nEl numero Octal es: "+conversionOctalE()+conversionOctalD()
      +"\nEl numero Hexadecimal: "+conversionHexE()+conversionHexD();
      
  
  }
    
    
    
    
    
}
