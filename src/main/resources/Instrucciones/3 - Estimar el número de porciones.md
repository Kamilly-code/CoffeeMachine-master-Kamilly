# Etapa 3/6: Estimar el número de porciones
Una máquina de café real no tiene un suministro infinito de agua, leche o granos de café. Y si ingresas un número muy grande, es casi seguro que una máquina de café real no tendría los suministros necesarios para preparar todo ese café.

En esta etapa, debes mejorar el programa anterior. Ahora comprobarás las cantidades de agua, leche y granos de café disponibles en tu cafetera en ese momento.

## Objetivos
Escriba un programa que haga lo siguiente:

Solicita las cantidades de agua, leche y granos de café disponibles en el momento y luego pregunta la cantidad de tazas que necesita el usuario.

Si la máquina de café tiene suficientes suministros para preparar la cantidad de café especificada, el programa debería imprimir "Sí, puedo hacer esa cantidad de café".

Si la máquina de café puede preparar más que eso, el programa debería generar "Sí, puedo hacer esa cantidad de café (e incluso N tazas más)", donde N es la cantidad de tazas de café adicionales que la máquina de café puede preparar.

Si la cantidad de recursos proporcionados no es suficiente para preparar la cantidad de café especificada, el programa debería generar "No, sólo puedo hacer N taza(s) de café".

Al igual que en la etapa anterior, la cafetera necesita 200 ml de agua, 50 ml de leche y 15 g de granos de café para preparar una taza de café.

### Ejemplos
El símbolo mayor que seguido de un espacio ( > ) representa la entrada del usuario. Tenga en cuenta que no forma parte de la entrada.

### Ejemplo 1:
```
Escribe cuántos ml de agua tiene la máquina:
> 300
Escribe cuántos ml de leche tiene la máquina:
> 65
Escribe cuántos gramos de café tiene la máquina:
> 100
Escribe cuántas tazas de café necesitas hacer:
> 1
Sí, puedo hacer esa cantidad de café.
```
### Ejemplo 2:

```
Escribe cuántos ml de agua tiene la máquina:
> 500
Escribe cuántos ml de leche tiene la máquina:
> 250
Escribe cuántos gramos de café tiene la máquina:
> 200
Escribe cuántas tazas de café necesitas hacer:
> 10
"No, sólo puedo hacer 2 taza(s) de café"
```

### Ejemplo 3:
```
Escribe cuántos ml de agua tiene la máquina:
> 1550
Escribe cuántos ml de leche tiene la máquina:
> 299
Escribe cuántos gramos de café tiene la máquina:
> 300
Escribe cuántas tazas de café necesitas hacer:
> 3
Sí, puedo hacer esa cantidad de café (e incluso 2 tazas más)
```

### Ejemplo 4:
```
Escribe cuántos ml de agua tiene la máquina:
> 0
Escribe cuántos ml de leche tiene la máquina:
> 0
Escribe cuántos gramos de café tiene la máquina:
> 0
Escribe cuántas tazas de café necesitas hacer:
> 1
No, sólo puedo hacer 0 taza(s) de café
```

### Ejemplo 5:
```
Escribe cuántos ml de agua tiene la máquina:
> 0
Escribe cuántos ml de leche tiene la máquina:
> 0
Escribe cuántos gramos de café tiene la máquina:
> 0
Escribe cuántas tazas de café necesitas hacer:
> 0
Sí, puedo hacer esa cantidad de café.
```

### Ejemplo 6:
```
Escribe cuántos ml de agua tiene la máquina:
> 200
Escribe cuántos ml de leche tiene la máquina:
> 50
Escribe cuántos gramos de café tiene la máquina: 
> 15
Escribe cuántas tazas de café necesitas hacer:
> 0
Sí, puedo hacer esa cantidad de café (e incluso 2 tazas más)
```
