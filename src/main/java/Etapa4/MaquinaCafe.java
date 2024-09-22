package Etapa4;

import java.util.Scanner;

public class MaquinaCafe {
    //Ingredients de la maquina
    private static int mlAgua = 400;
    private static int gCafe = 120;
    private static int mlLeche = 540;
    private static int vasos = 9;
    private static int dinero = 550;

    private static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        MaquinaCafe maquinaCafe = new MaquinaCafe();
        maquinaCafe.mostrarEstado();
        while (true) {
            System.out.println("\nEscribe la acción a realizar (buy, fill, take):");
            String action = teclado.next();

            switch (action) {
                case "buy" -> comprar();
                case "fill" -> reponer();
                case "take" -> retirarDinero();
                default -> System.out.println("Acción no reconocida.");
            }
        }

    }


    public static void comprar () {
        System.out.println("¿Qué quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int opcion = teclado.nextInt();

        if ("atrás".equals(opcion)) {
            return; // Voltar sem comprar
        }
        int aguaUtilizar = 0, lecheUtilizar = 0, cafeUtilizar = 0, precio = 0;

        switch (opcion) {
            case 1 -> {
                aguaUtilizar = 250;
                cafeUtilizar = 16;
                precio = 4;


            }
            case 2 -> {
                aguaUtilizar = 350;
                lecheUtilizar = 75;
                cafeUtilizar = 20;
                precio = 7;

            }
            case 3 -> {
                aguaUtilizar = 200;
                lecheUtilizar = 100;
                cafeUtilizar = 12;
                precio = 6;
            }
            default -> {
                System.out.println("Ese café no está disponible en nuestro catalogo");
                return;
            }
        }

        if (mlAgua < aguaUtilizar) {
            System.out.println("Lo siento, no hay suficiente agua para el preparo.");
        } else if (mlLeche < lecheUtilizar) {
            System.out.println("Lo siento, no hay suficiente leche para el preparo.");
        } else if (gCafe < cafeUtilizar) {
            System.out.println("Lo siento, no hay suficiente gramos de café para el preparo.");
        } else if ( vasos < 1 ) {
            System.out.println("Lo siento, no hay suficientes vasos.");
        } else {
            mlAgua -= aguaUtilizar;
            mlLeche -= lecheUtilizar;
            gCafe -= cafeUtilizar;
            vasos --;
            dinero += precio;
            System.out.println("Preparando el café...");

            mostrarEstado();
        }

    }

    public static void reponer (){
        System.out.println("Escribe cuántos ml de agua quieres añadir:");
        int reponerAgua = teclado.nextInt();

        mlAgua += reponerAgua;

        System.out.println("Escribe cuántos ml de leche quieres añadir:");
        int reponerLeche = teclado.nextInt();

        mlLeche += reponerLeche;

        System.out.println("Escribe cuántos gramos de café quieres añadir:");
        int reponerGCafe = teclado.nextInt();

        gCafe += reponerGCafe;

        System.out.println("Escribe cuántos vasos desechables quieres añadir:");
        int reponerVasos = teclado.nextInt();

        vasos += reponerVasos;

        System.out.println("Repuestos completos.");

        mostrarEstado();

    }

    public static void  mostrarEstado (){
        System.out.println("La máquina tiene:");
        System.out.println(mlAgua+" ml de agua\n"+mlLeche+" ml de leche\n"+gCafe+" g de café\n"+vasos+" vasos desechables\n"+dinero+"€ en efectivo.");

    }

    public static void retirarDinero(){
        System.out.println("Retiraste " +dinero+"€");
        dinero = 0;
    }

}
