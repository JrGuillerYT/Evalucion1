package evaluacion;
public class Clase1 {
     public static void main(String[] args) {
        
        String nombrePersona = "jose";
        int edad = 12;
        int mayor = 18;
        int resultado = mayor - edad;
             
        System.out.println("Bienvenido:"+ nombrePersona);
        System.out.println("verificacion si es mayor de edad:");
        System.out.println("::::::::::::::::::::::::::::::::::");
        System.out.println("su edad es:" + edad);
         System.out.println("::::::::::::::::::::::::::::::::::");
        System.out.println("eres menor de edad:" + edad);
        
        if ( edad >= 18 ) {
        System.out.println(nombrePersona + "es mayor de edad");
        } else {
            System.out.println("te faltan.. " + resultado + " años" );
        }
    }
}