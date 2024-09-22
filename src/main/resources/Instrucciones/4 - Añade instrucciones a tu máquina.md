# Etapa 4/6: Agrega funciones a tu máquina

¡Simulemos una máquina de café real! ¿Qué necesitamos para ello?
Esta máquina de café tendrá un suministro limitado de agua, leche, granos de café y vasos desechables. Además, calculará cuánto dinero recibe por vender café.

Hay varias opciones para la máquina de café que queremos que implementes: primero, debe vender café. Puede hacer diferentes tipos de café: espresso, café con leche y capuchino. Por supuesto, cada variedad requiere una cantidad diferente de ingredientes, sin embargo, en cualquier caso, solo necesitarás un vaso desechable para cada bebida. En segundo lugar, la máquina de café debe ser reabastecida por un trabajador. En tercer lugar, otro trabajador  debe poder sacar dinero de la máquina de café.

## Objetivos
Escriba un programa que ofrezca comprar una taza de café, reponer los suministros o retirar el dinero. Tenga en cuenta que el programa debe realizar una de las acciones mencionadas a la vez. También debe calcular las cantidades de ingredientes restantes y cuánto dinero queda. Muestre la cantidad de ingredientes antes y después de la compra.

**En primer lugar, el programa lee una opción de la entrada estándar, que puede ser "buy", "fill", "take".** 
- Si un usuario quiere comprar café, la entrada es "buy".
- Si un trabajador piensa que es hora de completar todos los suministros para la máquina de café, la línea de entrada será "fill". 
- Si otro trabajador decide que es hora de sacar el dinero de la máquina de café, obtendrá la entrada "take".

Si el usuario escribe **"buy"** deberá elegir uno de los tres tipos de café que puede preparar la cafetera: espresso, café con leche o capuchino.

- Para preparar un **espresso**, la cafetera necesita 250 ml de agua y 16 g de café. Cuesta 4 dólares .
- Para preparar un **café con leche**, la máquina de café necesita 350 ml de agua, 75 ml de leche y 20 g de café. Cuesta 7 dólares .
- Y para un **capuchino**, la cafetera necesita 200 ml de agua, 100 ml de leche y 12 g de café. Cuesta 6 dólares .

Si el usuario escribe **"fill"**, el programa debe preguntarle cuánta agua, leche, café y cuántos vasos desechables desea agregar a la máquina de café.

Si el usuario escribe **"take"** el programa debe entregar todo el dinero que ganó con la venta de café.

En estos momentos la cafetera tiene 550$ , tiene capacidad para 400 ml de agua, 540 ml de leche, 120 g de granos de café y 9 vasos desechables.

En resumen, su programa debe imprimir el estado de la máquina de café, procesar una consulta del usuario y luego imprimir el estado de la máquina de café. **Intente usar métodos para implementar cada acción que la máquina de café puede realizar.**

### Ejemplos
Un espresso debe ser el número 1 en la lista, un café con leche el número 2 y un capuchino el número 3.
Las opciones se nombran como "buy", "fill", ."take"

El símbolo mayor que seguido de un espacio ( > ) representa la entrada del usuario. Tenga en cuenta que no forma parte de la entrada.

## Ejemplo 1:
```
La máquina de café tiene:
400 ml de agua
540 ml de leche
120 g de café
9 vasos desechables
$550 en efectivo

Escribe la acción a realizar (buy, fill, take):
> buy
¿Qué quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino:
> 3

La máquina de café tiene:
200 ml de agua
440 ml de leche
108 g de café
8 vasos desechables
$556 en efectivo
```
## Ejemplo 2:
```
La máquina de café tiene:
400 ml de agua
540 ml de leche
120 g de café
9 vasos desechables
$550 en efectivo

Escribe la acción a realizar (buy, fill, take):
> fill
Escribe cuántos ml de agua quieres añadir:
> 2000
Escribe cuántos ml de leche quieres añadir:
> 500
Escribe cuántos gramos de café quieres añadir:
> 100
Escribe cuántos vasos desechables quieres añadir:
> 10

La máquina de café tiene:
2400 ml de agua
1040 ml de leche
220 g de café
19 vasos desechables
$550 en efectivo
```
## Ejemplo 3:
```
La máquina de café tiene:
400 ml de agua
540 ml de leche
120 g de café
9 vasos desechables
$550 en efectivo
Te acabo de dar $550

La máquina de café tiene:
400 ml de agua
540 ml de leche
120 g de café
9 vasos desechables
$0 en efectivo
```