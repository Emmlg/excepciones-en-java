
package conversion;


public class conversionDecimal {
    //Atributos
    float cifra;
   private   int cifraE;
   private int resultado;
 
    //metodo constructor
   public conversionDecimal(float cifra){
        this.cifra = cifra;
  }    
     
//metodo para traducir la parte entera en binario
 public String conversionBinariaE(){
    //procedimiento
    cifraE = (int) cifra;
   
    String almacen=" ";
    
    if(cifraE<=0){ 
       return "0";
    }else
        
       while(cifraE>0){
        resultado=(cifraE%2);
        almacen= resultado+almacen;
        cifraE=cifraE/2;
       }
     return almacen;
}  
 //metodo para traducir la parte decimal entera a octal
  public String conversionOctalE(){
  
      //procedimiento
     cifraE = (int) cifra;
  
    String almacen=" ";
     if(cifraE<=0){
     
     return "0";
     
    }else
        while(cifraE>0){
           resultado=(cifraE%8);
           almacen= resultado + almacen;
           cifraE=cifraE/8;
        }
         return almacen;  
  }

  
   
  // metodo para traducir la cifra Entera a Hexadecimal
 public String conversionHexE(){
   
      cifraE=(int) cifra;
 
    String almacen=" ";
     if(cifraE>0){
         
     
     while(cifraE>0){
     resultado=(cifraE%16);
     switch(resultado){
         case 10: almacen="A"+almacen;break;
         case 11: almacen="B"+almacen;break;
         case 12: almacen="C"+almacen;break;
         case 13: almacen="D"+almacen;break;
         case 14: almacen="E"+almacen;break;
         case 15: almacen="F"+almacen;break;
         default: almacen=resultado+almacen;
     }
     cifraE=cifraE/16;
     } 
 return almacen;
     }else
         return "0";
 }
 
  // metodo que retorna toda las conversiones
    
public  String mostrarOpciones(){

    return 
         "\n -----------------------------------"
         +" \n 1.-Mostrar todas las unidades \n 2.- Conversion Binaria "
         + "\n 3.- Conversion Hexadecimal \n 4.- Conversion Octal " ;

}
public String mostrarMenuGeneral(){
return "\n"
        + "---------*-*-MENU-*-*---------"
      +"\n1.-Conversion de base decimal a los demas sistemas \n2.-Salir " ;

}
  
  
  
    
}//fin clase
    
