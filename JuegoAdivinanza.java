import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; //Numero aleatorio entre 1 y 100

        int num=0; //Numero ingresado por el usuario
        int intentos=0; //Numero de intentos     
        int intentosMaximos=10; //Numero maximo de intentos
        int adivinado=0; //Bandera para saber si se encontro el numero

        System.out.println("Juego de Adivinanza");
        System.out.println("Tendras "+intentosMaximos+" intentos para adivinar un numero de entre 1 y 100\n");

        while(intentos<intentosMaximos){ 
            System.out.print("\nIngresa un numero: ");
            num=scanner.nextInt();

            if(num<1 || num>100){
                System.out.println("El numero ingresado no esta en el rango de 1 a 100");
                continue; //NO SE CUENTA COMO UN INTENTO
            }
    
            if (num == numeroAleatorio) {
                adivinado=1;
                System.out.println("¡Felicidades! Has adivinado el número " + numeroAleatorio + " en " + intentos + " intentos.");
                break;
            } else if (num < numeroAleatorio) {
                System.out.println("Tu numero es menor al numero aleatorio. Sigue intentando.");
            } else {
                System.out.println("Tu numero es mayor al numero aleatorio. Sigue intentando.");
            }

            intentos++;
        }

        if (adivinado==0){
            System.out.println("\nLo siento, has agotado tus intentos. El número correcto era: " + numeroAleatorio);
        }
        scanner.close();
    }    
}