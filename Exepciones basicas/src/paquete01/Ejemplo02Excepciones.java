
package paquete01;


public class Ejemplo02Excepciones {
    
    public Ejemplo02Excepciones(){
    
    }
    
    public static void main(String[] args) {
        
    
   
 int nums[]={4,8,16,32,64,128,256,512};
 int denom[]={2,0,4,4,0,8}; 
 
 try{ for (int i=0; i<nums.length; i++){
     try{ System.out.println(nums[i]+" / "+ denom[i]+" es "+nums[i]/denom[i]); 
     } catch (ArithmeticException exc){ 
         System.out.println("¡No se puede divide por cero!"); }
 } 
 } 
 catch (ArrayIndexOutOfBoundsException exc){ 
     System.out.println ("Alguna excepción ocurrió.");
     System.out.println ("ERROR: Programa terminado.");
}   
    
}}
