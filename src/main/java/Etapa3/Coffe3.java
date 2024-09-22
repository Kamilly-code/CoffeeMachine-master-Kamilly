package Etapa3;

import java.util.Scanner;

public class Coffe3 {
   public static void main (String[] args){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Escribe cuántos ml de agua tiene la máquina:");
      int mlAgua = teclado.nextInt();
      System.out.println("Escribe cuántos ml de leche tiene la máquina:");
      int mlLeche = teclado.nextInt();
      System.out.println("Escribe cuántos gramos de café tiene la máquina:");
      int gCoffe = teclado.nextInt();
      System.out.println("Escribe cuántas tazas de café tiene la máquina:");
      int tazaCafe = teclado.nextInt();

      int limiteAgua = 200;
      int limiteLeche = 50;
      int limiteCafe = 30;

      //qunatas xicaras eu posso fazer?
      int tazasConAgua = mlAgua /limiteAgua;
      int tazasConLeche = mlLeche / limiteLeche;
      int tazasConCafe = gCoffe / limiteCafe ;

      int tazasPosibles = Math.min(tazasConAgua, Math.min(tazasConLeche, (tazasConCafe)));

      if (tazasPosibles >= tazaCafe) {
         int tazasExtra = tazasPosibles - tazaCafe;
         if (tazasExtra > 0) {
            System.out.println("Sí, puedo hacer esa cantidad de café (e incluso " + tazasExtra + " tazas más).");

         } else{
            System.out.println("Sí, puedo hacer esa cantidad de café.");
         }


         //int  = mlAgua - 200;
      } else System.out.println("No, sólo puedo hacer "+tazasPosibles+ " de café");
      teclado.close();

   }
}
