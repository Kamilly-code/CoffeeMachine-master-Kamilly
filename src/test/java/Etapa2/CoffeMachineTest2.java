package Etapa2;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class CoffeMachineTest2 {
    @Test
    public void calcularIgredientes(){
    String input = "125";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        CoffeeMachine2 cafe= new CoffeeMachine2();

        int numeroTazas = cafe.lerNumeroTazas();

        System.out.println("> "+numeroTazas);
        int mlAgua = numeroTazas * 200;
        int mlLeche = numeroTazas * 50;
        int gCafe = numeroTazas * 15;
        System.out.println("Para "+ numeroTazas + " tazas de café necesitas: \n" +
                 mlAgua +" ml de agua\n" +
                mlLeche+" ml de leche\n" +
                gCafe+" g de café");
    }
}
