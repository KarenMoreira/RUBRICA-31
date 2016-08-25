package proyectoingenieriasoftwareii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Materia: Ingenieria de Software II
 * @author : Karen Moreira
 */
public class ProyectoIngenieriaSoftwareII {
    
    

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenido a mi Proyecto de HORARIOS ");
        System.out.println("Este ejercicio tiene muchas funciones ");
        int hora = -1;
        int minuto = -1;
        int segundos = -1;
        do {
            System.out.println("Ingresar en numeros enteros el valor de la Hora ");
            hora = validacion(entrada.readLine());
            if (hora <= -1) {
                hora = -1;
                System.out.println("Solo se puede Ingresar valores enteros Positivos");
            }
        } while (hora == -1);

        do {
            System.out.println("Ingresar en numeros enteros el valor de los minutos ");
            minuto = validacion(entrada.readLine());
            if (minuto < 0 || minuto >= 60) {
                minuto = -1;
                System.out.println("Solo se puede Ingresar valores enteros Positivos");
            }
        } while (minuto == -1);

        do {
            System.out.println("Ingresar en numeros enteros el valor de los segundos ");
            segundos = validacion(entrada.readLine());
            if (segundos < 0 || segundos >= 60) {
                segundos = -1;
                System.out.println("Solo se puede Ingresar valores enteros Positivos");
            }
        } while (segundos == -1);
        System.out.print("La hora ingresada es >>>" + hora + ":" + minuto + ":" + segundos);
        int converMinuto = minuto * 60;
        int converHora = hora * 3600;
        int segundosTotales = converMinuto + converHora + segundos;
        System.out.println("\nEl valor total en segundos es de>> " + segundosTotales);
    }

    //Método de validación
    public static int validacion(String cadena) {
        int num;
        try {
            num = Integer.parseInt(cadena);
            return num;
        } catch (Exception f) {
        }
        return -1;
    }
}
