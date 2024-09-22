# Etapa 6/6: Mejora tu código

## Descripción
Rediseñemos nuestro programa y escribamos una clase que represente una máquina de café. 
La clase debe tener un método que tome una cadena como entrada. Cada vez que el usuario ingresa una cadena en la consola, el programa invoca este método con un argumento: la línea que el usuario ingresa en la consola. Este sistema simula con bastante precisión cómo funcionan los dispositivos electrónicos del mundo real. Los componentes externos (como los botones de la máquina de café o tocar la pantalla) generan eventos que pasan a la interfaz única del programa.

La clase no debe utilizar la entrada del sistema en absoluto; solo manejará la entrada que le llegue a través de este método y su argumento de cadena.

El primer problema que se me ocurre es: ¿cómo escribir ese método de manera que represente todo lo que puede hacer esa máquina de café? Si el usuario ingresa un solo número, ¿cómo puede el método determinar cuál es ese número: una variante de café elegida por el usuario o la cantidad de vasos desechables que un trabajador especial agregó a la máquina de café?

La solución correcta a este problema es almacenar el estado actual de la máquina. La máquina de café puede estar en varios estados. Por ejemplo, el estado podría ser "eligiendo una acción" o "eligiendo un tipo de café". Cada vez que el usuario ingresa algo y un programa pasa esa línea al método, el programa determina cómo interpretar esta línea utilizando la información sobre el estado actual. Después de procesar esta línea, el estado de la máquina de café puede cambiar o puede permanecer igual.

**Recuerde que:**

- Para preparar un espresso, la cafetera necesita 250 ml de agua y 16 g de granos de café. Cuesta 4 dólares.
- Para preparar un café con leche, la máquina de café necesita 350 ml de agua, 75 ml de leche y 20 g de granos de café. Cuesta 7 dólares.
- Y para el capuchino, la cafetera necesita 200 ml de agua, 100 ml de leche y 12 g de café. Cuesta 6 dólares.
## Objetivo
Tu tarea final es refactorizar el programa para que pueda comunicarse con la máquina de café a través de un único método.

## Ejemplo
Su máquina de café debe tener los mismos recursos iniciales que en el ejemplo ( 400 ml de agua, 540 ml de leche, 120 g de granos de café, 9 vasos desechables, $550 en efectivo).
El símbolo mayor que seguido de un espacio ( > ) representa la entrada del usuario. Tenga en cuenta que no es parte de la entrada.
```
Escribe la acción a realizar (buy, fill, take, remaining, exit):
> remaining

La máquina de café tiene:
400 ml de agua
540 ml de leche
120 g de café
9 vasos desechables
$550 en efectivo

Escribe la acción a realizar (buy, fill, take, remaining, exit):
> buy

¿Qué quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino, back - menú principal:  
> 2
Tengo suficientes recursos, ¡marchando un café!

Escribe la acción a realizar (buy, fill, take, remaining, exit):
> remaining

La máquina de café tiene:
50 ml de agua
465 ml de leche
100 g de café
8 vasos desechables
$557 en efectivo

Escribe la acción a realizar (buy, fill, take, remaining, exit):
> buy

¿Qué quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino, back - menú principal:  
> 2
¡Lo siento, no tengo suficiente agua!

Escribe la acción a realizar (buy, fill, take, remaining, exit):
> fill

Escribe cuántos ml de agua quieres añadir: 
> 1000
Escribe cuántos ml de leche quieres añadir:
> 0
Escribe cuántos gramos de café quieres añadir: 
> 0
Escribe cuántos vasos desechables quieres añadir: 
> 0

Escribe la acción a realizar (buy, fill, take, remaining, exit):
> remaining

La máquina de café tiene:
1050 ml de agua
465 ml de leche
100 g de café
8 vasos desechables
$557 en efectivo

Escribe la acción a realizar (buy, fill, take, remaining, exit):
> buy

¿Qué quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino, back - menú principal:
> 2
Tengo suficientes recursos, ¡marchando un café!

Escribe la acción a realizar (buy, fill, take, remaining, exit):
> remaining

La máquina de café tiene:
700 ml de agua
390 ml de leche
80 g de café
7 vasos desechables
$564 en efectivo

Escribe la acción a realizar (buy, fill, take, remaining, exit):
> take

Te acabo de dar $564

Escribe la acción a realizar (buy, fill, take, remaining, exit):
> remaining

La máquina de café tiene:
700 ml de agua
390 ml de leche
80 g de café
7 vasos desechables
$0 en efectivo

Escribe la acción a realizar (buy, fill, take, remaining, exit):
> exit
```