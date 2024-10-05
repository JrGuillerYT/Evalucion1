package evaluacion;
public class Evaluacion {
public static void main(String[] args) {
       int numero = 5;
        
        System.out.println("tabla de multiplicar del numero " +  numero);
       
        for (int i = 1; i <= 12; i++) {
        int resultado = numero * i;
        
            System.out.println(numero +" x " + i + " = " + resultado );
        
        }
    }
}