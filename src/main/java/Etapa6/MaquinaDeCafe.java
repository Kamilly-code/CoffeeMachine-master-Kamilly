package Etapa6;

import java.util.Scanner;

public class MaquinaDeCafe {

    private static int agua = 400;
    private static int leche = 540;
    private static int cafe = 120;
    private static int vasos = 9;
    private static int dinero = 550;
    private static Estado estado = Estado.ESPERANDO;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (estado == Estado.ESPERANDO) {
                System.out.println("Escribe la acción a realizar (buy, fill, take, remaining, exit):");
            }

            String input = scanner.nextLine();
            estadoMaquina(input);

            if (estado == Estado.SALIR) {
                break;
            }
        }
    }


    public static void estadoMaquina (String comando) {

        switch (estado) {
            case ESPERANDO -> {
                switch (comando) {
                    case "buy" -> {estado = Estado.COMPRAR;
                    System.out.println("¿Qué quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino, back - menú principal:");}
                    case "fill" -> {estado = Estado.RELLENAR_AGUA; System.out.println("Escribe cuántos ml de agua quieres añadir:");}
                    case "take" -> tomarDinero();
                    case "remaining" -> mostrarEstado();
                    case "exit" -> estado = Estado.SALIR;
                }
            }
            case COMPRAR -> selecionarCafe(comando);
            case RELLENAR_AGUA -> rellenarAgua(comando);
            case RELLENAR_LECHE -> rellenarLeche(comando);
            case RELLENAR_CAFE -> rellenarCafe(comando);
            case RELLENAR_VASOS -> rellenarVasos(comando);

        }

    }

    private static void rellenarVasos(String comando) {
        vasos += Integer.parseInt(comando);
        estado = Estado.ESPERANDO;
    }

    private static void rellenarCafe(String comando) {
        cafe += Integer.parseInt(comando);
        estado = Estado.RELLENAR_VASOS;
        System.out.println("Escribe cuántos vasos desechables quieres añadir:");
    }

    private static void rellenarLeche(String comando) {
        leche += Integer.parseInt(comando);
        estado = Estado.RELLENAR_CAFE;
        System.out.println("Escribe cuántos gramos de café quieres añadir:");
    }

    private static void rellenarAgua(String comando) {
        agua += Integer.parseInt(comando);
        estado = Estado.RELLENAR_LECHE;
        System.out.println("Escribe cuántos ml de leche quieres añadir:");
    }

    private static void selecionarCafe(String comando) {
        switch (comando){
            case "1" -> hacerCafe(250,0,16,4);
            case "2" -> hacerCafe(350, 75, 20, 7);
            case "3" -> hacerCafe(200, 100, 12, 6);
            case "back" -> estado = Estado.ESPERANDO;
            default -> System.out.println("Opción no válida");

        }
    }

    private static void hacerCafe(int aguaNecesaria, int lecheNecesario, int cafeNecesario, int precio) {
        if (agua < aguaNecesaria) {
            System.out.println("¡Lo siento, no tengo suficiente agua!");
        } else if (leche < lecheNecesario) {
            System.out.println("¡Lo siento, no tengo suficiente leche!");
        } else if (cafe < cafeNecesario) {
            System.out.println("¡Lo siento, no tengo suficiente café!");
        } else if (vasos < 1) {
            System.out.println("¡Lo siento, no tengo suficientes vasos!");
        } else {
            agua -= aguaNecesaria;
            leche -= lecheNecesario;
            cafe -= cafeNecesario;
            vasos--;
            dinero += precio;
            System.out.println("Tengo suficientes recursos, ¡marchando un café!");
        }
        estado = Estado.ESPERANDO;
    }

    private static void mostrarEstado() {
        System.out.println("La máquina tiene:");
        System.out.println(agua+" ml de agua\n"+leche+" ml de leche\n"+cafe+" g de café\n"+vasos+" vasos desechables\n"+dinero+"€ en efectivo.");
        estado = Estado.ESPERANDO;
    }

    private static void tomarDinero() {
        System.out.println("Te acabo de dar $" + dinero);
        dinero = 0;
        estado = Estado.ESPERANDO;
    }
}
