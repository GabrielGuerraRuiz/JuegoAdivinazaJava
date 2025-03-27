import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; // Número aleatorio entre 1 y 100

        int num = 0; // Número ingresado por el usuario
        int intentos = 0; // Número de intentos
        int intentosMaximos = 10; // Número máximo de intentos
        boolean adivinado = false; // Bandera para saber si se encontró el número

        System.out.println("Juego de Adivinanza");
        System.out.println("Tendrás " + intentosMaximos + " intentos para adivinar un número entre 1 y 100\n");

        while (intentos < intentosMaximos) {
            System.out.print("\nIngresa un número: ");
            
            // Validación para evitar errores si el usuario ingresa algo que no es un número
            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next(); // Consumir la entrada inválida
                continue; // No contar como intento
            }

            num = scanner.nextInt();

            if (num < 1 || num > 100) {
                System.out.println("El número ingresado no está en el rango de 1 a 100.");
                continue; // No se cuenta como un intento
            }

            intentos++; // Incrementar intentos solo si el número es válido

            if (num == numeroAleatorio) {
                adivinado = true;
                System.out.println("¡Felicidades! Has adivinado el número " + numeroAleatorio + " en " + intentos + " intentos.");
                break;
            } else if (num < numeroAleatorio) {
                System.out.println("Tu número es menor al número aleatorio. Sigue intentando.");
            } else {
                System.out.println("Tu número es mayor al número aleatorio. Sigue intentando.");
            }
        }

        if (!adivinado) {
            System.out.println("\nLo siento, has agotado tus intentos. El número correcto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}
