
package conversiones;

public abstract class Conversiones {
    //atributo
    float cifraGeneral;
    
    //metodo construcotr
    public Conversiones(float cifraGenral){
 this.cifraGeneral= cifraGeneral;
}
   
    
//metodos
abstract String conversionB();
abstract String conversionO();
abstract String conversionH();
abstract String informacion();
abstract String menuPrincipal();




}//Fin de la clase Conversiones
