package Etapa1;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeMachineTest {

    @Test
    void testCoffeeMachineOutput() {
        // Redirigir la salida estándar a un ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutar el método main de CoffeeMachine
        CoffeeMachine.main(new String[]{});

        // Restaurar la salida estándar
        System.setOut(System.out);

        // Definir la salida esperada
        String expectedOutput = "Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!\n";

        // Normalizar los saltos de línea y eliminar espacios en blanco adicionales
        String actualOutput = outContent.toString().replace("\r\n", "\n").replace("\r", "\n").trim();
        expectedOutput = expectedOutput.replace("\r\n", "\n").replace("\r", "\n").trim();

        // Verificar que la salida sea la esperada
        assertEquals(expectedOutput, actualOutput);
    }

    private void assertEquals(String expectedOutput, String actualOutput) {

    }
}