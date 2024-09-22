# Etapa 5/6: Realizar un seguimiento de los suministros
## Descripción
Mejoremos el programa para que pueda realizar múltiples acciones, una tras otra. Debería preguntar repetidamente al usuario qué quiere hacer. Si el usuario escribe "buy", "fill"o "take", entonces el programa debería hacer exactamente lo mismo que hizo en el paso anterior. Sin embargo, si el usuario quiere apagar la máquina de café, debería escribir "exit". El programa debería terminar con este comando. Además, cuando el usuario escriba "remaining", el programa debería mostrar todos los recursos que tiene la máquina de café. Esto significa que no debería mostrar los niveles de existencias restantes al principio o al final del programa.

**Recuerde que:**

- Para preparar un espresso, la cafetera necesita 250 ml de agua y 16 g de granos de café. Cuesta 4 dólares.
- Para preparar un café con leche, la máquina de café necesita 350 ml de agua, 75 ml de leche y 20 g de granos de café. Cuesta 7 dólares.
- Y para el capuchino, la cafetera necesita 200 ml de agua, 100 ml de leche y 12 g de café. Cuesta 6 dólares.

## Objetivos
Escriba un programa que funcione sin fin para preparar café para todas las personas interesadas hasta que se dé la señal de apagado. Introduzca dos opciones nuevas: "remaining"y "exit".

No olvides que puedes quedarte sin recursos para preparar café. Si la máquina de café no tiene suficientes recursos para preparar café, el programa debería mostrar un mensaje que diga que no puede preparar una taza de café e indicar qué es lo que falta.

Y la última mejora del programa en este paso: si el usuario escribe "buy"comprar una taza de café y luego cambia de opinión, debería poder escribir "back"para regresar al ciclo principal.

## Ejemplo
Su máquina de café debe tener los mismos recursos iniciales que en el ejemplo ( 400 ml de agua, 540 ml de leche, 120 g de granos de café, 9 vasos desechables, $550 en efectivo).

El símbolo mayor que seguido de un espacio ( > ) representa la entrada del usuario. Tenga en cuenta que no forma parte de la entrada.


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
