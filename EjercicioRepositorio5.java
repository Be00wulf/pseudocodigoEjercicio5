//EjercicioRepositorio5
import java.util.Scanner;
public class EjercicioRepositorio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, edad, sexo, contadorMM = 0, contadorHm = 0;
        
        System.out.print("Ingrese la cantidad de personas: ");
        cantidad = entrada.nextInt();
        
            for(int i = 1; i <= cantidad; i++){
                System.out.print("Ingrese la edad: ");
                edad = entrada.nextInt();   
                
                System.out.print("Ingrese su sexo (1 = femenino, 0 = masculino): ");
                sexo = entrada.nextInt();
                
                if (edad >= 18 && sexo == 1) {
                    ++contadorMM;
               
                }   else if (edad < 18 && sexo == 0) {
                    ++contadorHm;
                }
                
            }
            
        System.out.println("Cantidad de mujeres mayores de edad: " + contadorMM);
        System.out.println("Cantidad de hombres menores de edad: " + contadorHm);
        
        
    }
}