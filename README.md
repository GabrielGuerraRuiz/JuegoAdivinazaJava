# JuegoAdivinanzaJava

## Índice
1. [Descripción del proyecto](#descripcion_del_proyecto)
2. [Desarrollo](#desarrollo)
3. [Instrucciones para compilar y ejecutar el programa](#instrucciones_para_compilar_y_ejecutar_el_programa)
4. [Capturas de pantalla del programa en funcionamiento](#capturas_de_pantalla_del_programa_en_funcionamiento)
5. [Enlace al repositorio de GitHub](#enlace_al_repositorio_de_GitHub)

---

## **Descripción del Proyecto**
Este proyecto consiste en el desarrollo de un juego de adivinanza en Java, donde el usuario tiene que adivinar un número aleatorio entre 1 y 100 dentro de un límite de 10 intentos.

### **Funcionalidades**
1. Generación de un número aleatorio entre 1 y 100.
2. Entrada de usuario para intentar adivinar el número.
3. Indicaciones sobre si el número ingresado es mayor o menor que el número aleatorio.
4. Límite de 10 intentos para adivinar.
5. Mensajes de victoria o derrota según el resultado.

---

## **Desarrollo**

### **Menú**
El programa inicia mostrando un mensaje de bienvenida y explicando la mecánica del juego.
![image](https://github.com/user-attachments/assets/78a8c05f-a23c-4d55-981a-f287474db5cf)


### **Estructura del Código y Explicación**

#### **Clase `SistemaRegistroEstudiantes`**
Esta clase principal contiene el `main` del programa y maneja la lógica del juego.

#### **Generación del Número Aleatorio**
![image](https://github.com/user-attachments/assets/9b1e129f-9c60-4d1e-a3a0-c4fc4e4f2d51)
Se genera un número aleatorio entre 1 y 100 usando la clase `Random`.

#### **Bucle de Intentos**
![image](https://github.com/user-attachments/assets/bfe5c550-d565-46e5-a371-8399ff88c940)
Se ejecuta un `while` que permite al usuario intentar adivinar el número hasta que alcance el límite de intentos o lo adivine correctamente.

#### **Manejo de Derrota**
![image](https://github.com/user-attachments/assets/9d3c28d6-0bd4-45be-a980-c0184f03bc97)
Si el usuario no adivina el número en 10 intentos, se le informa el número correcto.

---

## **Instrucciones para compilar y ejecutar el programa**
Para compilar el programa, usa el siguiente comando:

### **Compilar**:
```
javac SistemaRegistroEstudiantes.java
```
Esto generará un archivo `SistemaRegistroEstudiantes.class` en el mismo directorio si el código no tiene errores.

### **Capturas de pantalla del programa en funcionamiento**
Caso: no es adivinado
![image](https://github.com/user-attachments/assets/958ecf7f-de18-463b-9d9f-15a9c1928631)

Caso 2: el numero es adivinado
![image](https://github.com/user-attachments/assets/6b63d3bb-9993-41c3-bec5-f5e87e03ad9c)

Caso 3: se ingresa un numero fuera del rango de numeros
![image](https://github.com/user-attachments/assets/991526b4-ca04-4e65-9cd7-f59d42414e4f)


Caso 4: se ingresa un caracter no valido
![image](https://github.com/user-attachments/assets/66990349-0e57-44a2-ba3a-a17cd62bc2ba)


### **Enlace al Planner**

[Microsoft Planner](https://planner.cloud.microsoft/webui/v1/plan/PncRRqNHU0OnJ10fjBIFZmQAFKCo?tid=f94bf4d9-8097-4794-adf6-a5466ca28563)
