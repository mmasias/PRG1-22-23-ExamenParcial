# Carrera de Camellos

En las ferias, se desarrollan entre otros divertimentos, un juego de carrera de camellos, que básicamente consiste en un camello "controlado" por el jugador, el cual va avanzando según el jugador acierte a embocar una pelota en un agujero.

## Reto base

Desarrolle un programa que simule esta carrera, atendiendo las siguientes reglas:

- El jugador elige un agujero al cual lanzar la pelota.
- En función a tabla indicaba debajo, se calcula la probabilidad de acierto. Si el jugador acierta, avanza el número de casillas indicado. 

|Agujero|Probabilidad de acierto|Avance del Caballo
|-|-|-
|1|60%|1
|2|40%|2
|3|30%|4
|4|10%|6

### Jugador al inicio
```
---++---------+---------+---------+---------+---------+---------++
---|0.........1.........2.........3.........4.........5.........6|
---|0123456789012345678901234567890123456789012345678901234567890|
---++---------+---------+---------+---------+---------+---------++
[J] ;--;'
---++---------+---------+---------+---------+---------+---------++
```
### Jugador en la posición 27
```
---++---------+---------+---------+---------+---------+---------++
---|0.........1.........2.........3.........4.........5.........6|
---|0123456789012345678901234567890123456789012345678901234567890|
---++---------+---------+---------+---------+---------+---------++
[J]                            ;--;'
---++---------+---------+---------+---------+---------+---------++
```

### Jugador al final
```
---++---------+---------+---------+---------+---------+---------++
---|0.........1.........2.........3.........4.........5.........6|
---|0123456789012345678901234567890123456789012345678901234567890|
---++---------+---------+---------+---------+---------+---------++
[J]                                                             ;--;'
---++---------+---------+---------+---------+---------+---------++
```

## Reto extendido

- Extienda el juego para que controle los aciertos del jugador: si el jugador no acierta tres veces seguidas, vuelve a la posición cero. 

## Reto ampliado

Amplíe el juego para que intervenga otro caballo gobernado por el ordenador. El caballo del ordenador puede moverse aleatoriamente 1, 2 o 3 casillas por turno.

### Jugador en la posición 27, ordenador en la posición 25
```
---++---------+---------+---------+---------+---------+---------++
---|0.........1.........2.........3.........4.........5.........6|
---|0123456789012345678901234567890123456789012345678901234567890|
---++---------+---------+---------+---------+---------+---------++
[J]                            ;--;'
---++---------+---------+---------+---------+---------+---------++
[O]                          ;--;'
---++---------+---------+---------+---------+---------+---------++
```
