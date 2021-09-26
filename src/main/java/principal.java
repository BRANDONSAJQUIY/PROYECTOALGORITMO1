

/**PROYECTOALGORITMO
 *FECHA: 25 DE SEPTIEMBRE 2021
 * @AUTHOR BRNDON JEREMIAS SAJQUIY BOCH
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class principal {
    static String AmenidadSelect;
    static int Amenidad;
    static int GamaSelect;
    public static void main(String[] args) {
Scanner sn = new Scanner(System.in);

System.out.println("---CONCESIONARIA DE AUTOMOVIL SAJQUIY---");
System.out.println("1. Seleccionar Automovil");
System.out.println("0. Salir");

boolean salir = false;
int opcion;

while(!salir){
            
        try{
        
        System.out.println("Introduce el numero que desea ejecutar");
        opcion = sn.nextInt();
        
        System.out.println("-----GAMA------------PRECIO(US$)-");
        System.out.println("*********************************");
        
        switch(opcion){
                
            case 1:
                System.out.println("1. Sedán Económico---------18,940");
                break;
                
            case 0:
                salir=true;
                break;
            default:
                System.out.println("ingrese 1 ó 0 para ejecutar");
        }
    System.out.println("2. Sedán-------------------23,570");
    System.out.println("3. Deportivo---------------24,100");
    System.out.println("4. Híbrido-----------------25,100");
    System.out.println("5. Coupe-------------------19,350");
    System.out.println("6. Coupe Deportivo---------24,100");
    System.out.println("7. Compacto----------------16,190");
    System.out.println("8. Hatchback---------------20,150");
    System.out.println("9. Economico verión Rally--34,700");
    System.out.println("0. Salir");
    
        }catch(InputMismatchException e){
            System.out.println("Debes introducir un numero");
            sn.next();
        }
        System.out.println("_______________________________");
    }

    System.out.println("Haz salido del concesionario");
    
}
static void amenidades (){
    System.out.println("_______________________________________");
    System.out.println("Tipos de amenidades");
    
    
}
}    //FIN CLASE
    
