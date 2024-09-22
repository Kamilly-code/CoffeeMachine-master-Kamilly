package Etapa2;

import java.util.Scanner;

public class CoffeeMachine2 {
    public int lerNumeroTazas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba cuántas tazas de café vas a necesitar:");
        return teclado.nextInt();
    }
}
