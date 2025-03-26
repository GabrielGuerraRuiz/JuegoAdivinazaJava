import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; //Numero aleatorio entre 1 y 100

        int num=0; //Numero ingresado por el usuario
        int intentos=0; //Numero de intentos        

        System.out.println("Juego de Adivinanza");
        System.out.println("Tendras (NUMERO DE INTENTOS) intentos para adivinar un numero de entre 1 y 100\n");


        System.out.println("El numero aleatorio es: "+numeroAleatorio); //ESTA LINEA SOLO ES PARA PRUEBAS, BORRAR EN LA VERSION FINAL


        while(intentos<3){ //REEMPLAZAR EL 3 POR UNA VARIABLE DE LIMITE DE INTENTOS
            System.out.print("Ingresa un numero: ");
            num=scanner.nextInt();

            if(num<1 || num>100){
                System.out.println("El numero ingresado no esta en el rango de 1 a 100");
                continue; //NO SE CUENTA COMO UN INTENTO
            }

            

            //IMPLEMENTAR LA LOGICA PARA ADIVINAR EL NUMERO



            //IMPLEMENTAR LAS PISTAS
            if (intentos == 1) {
                System.out.println("Pista: El número no es múltiplo de 5.");
            } else if (intentos == 2) {
                System.out.println("Pista: El número está más cerca de " + (numeroAleatorio - 10) + " o " + (numeroAleatorio + 10) + ".");
            } else if (intentos == 3) {
                System.out.println("Pista: El número es par." + (numeroAleatorio % 2 == 0 ? " Sí." : " No."));
            } else if (intentos == 4) {
                System.out.println("Última pista: El número está entre " + (numeroAleatorio - 5) + " y " + (numeroAleatorio + 5) + ".");
            }
        }

        if (num != numeroAleatorio) {
            System.out.println("Lo siento, has agotado tus intentos. El número correcto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}





            //IMPLEMENTAR EL LIMITE DE INTENTOS Y EL AUMENTO DE INTENTOS HECHOS





        }
        
        scanner.close();
    }
}