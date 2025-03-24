import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; //Numero aleatorio entre 1 y 100

        int num=0; //Numero ingresado por el usuario
        int intentos=0; //Numero de intentos     
        int intentosMaximos=5;

        System.out.println("Juego de Adivinanza");
        System.out.println("Tendras (NUMERO DE INTENTOS) intentos para adivinar un numero de entre 1 y 100\n");


        System.out.println("El numero aleatorio es: "+numeroAleatorio); //ESTA LINEA SOLO ES PARA PRUEBAS, BORRAR EN LA VERSION FINAL


        while(intentos<intentosMaximos){ //REEMPLAZAR EL 3 POR UNA VARIABLE DE LIMITE DE INTENTOS
            System.out.print("Ingresa un numero: ");
            num=scanner.nextInt();

            if(num<1 || num>100){
                System.out.println("El numero ingresado no esta en el rango de 1 a 100");
                continue; //NO SE CUENTA COMO UN INTENTO
            }
            //IMPLEMENTAR LA LOGICA PARA ADIVINAR EL NUMERO
                int numeroUsuario = scanner.nextInt();
                intentos++;
    
                if (numeroUsuario == numeroAleatorio) {
                    System.out.println("¡Felicidades! Has adivinado el número " + numeroAleatorio + " en " + intentos + " intentos.");
                } else if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El número es mayor. Sigue intentando.");
                } else {
                    System.out.println("El número es menor. Sigue intentando.");
                }
            scanner.close();
        }
        if (intentos<intentosMaximos) {
            System.out.println("Lo siento, has agotado tus intentos. El número correcto era: " + numeroAleatorio);
        }
        scanner.close();
    }


            //IMPLEMENTAR LAS PISTAS DENTRO DEL WHILE, CADA PISTA DESPUES DE CADA INTENTO




            //IMPLEMENTAR EL LIMITE DE INTENTOS Y EL AUMENTO DE INTENTOS HECHOS


    
}
