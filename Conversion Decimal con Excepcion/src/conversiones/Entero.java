
package conversiones;


public class Entero extends Conversiones{

    //atributos
       private   int cifraE;
       private int resultado;
    
       public Entero(float cifraGeneral){
       super(cifraGeneral);
       this.cifraE=0;
       this.resultado=0;
       }
       
    
    //metodo para traducir la parte entera en binario
    @Override
    String conversionB() {
        
     cifraE = (int) cifraGeneral;
   
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
    @Override
    String conversionO() {
        cifraE = (int) cifraGeneral;
  
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
    @Override
    String conversionH() {        
  cifraE=(int) cifraGeneral;
 
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

    @Override
    String informacion() {
       return "\n *-*-*-*-*-  Bienvenido/a   -*-*-*-*-*" +
        "\n Conversión de unidades \n" +
" Mediante la realización del proyecto se pretende dar solución a la conversión "
    + "\n entre unidades decimales a sus distintas equivalencias, "
    + "\n tanto en binario, hexadecimal y octal, con el fin de sistematizar y"
    + "\n ejemplificar los métodos mediante la elaboración del software,"
    + "\n el cual cuente con los recursos necesarios para dar soluciones a las conversiones de ejercicios planteados"
    + "\n con el fin de verificar resultados si así se requiere. ";

    }

@Override
    String menuPrincipal() {
    return "\n"
        + "-*-*-*-*- MENU -*-*-*-*-"
      +"\n1.-Conversión de base decimal a los demas sistemas \n2.-Salir " ;

    
    }
    
    
 
    
}//fin de la clase Enteros