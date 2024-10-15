

# StreamsExample

Este proyecto se creó con la finalidad de entender mejor los conceptos de: 
- FUNCIONES LAMBDA
- STREAMS

## Tabla de Contenidos

- [Consumer](#Consumer)
- [BiConsumer](#BiConsumer)
- [Predicate](#Predicate)
- [BiPredicate](#BiPredicate)
- [Callable](#Callable)
- [BinaryOperator](#BinaryOperator)
- [Fuction](#Fuction)
- [BiFunction](#BiFunction)
- [Runnable](#Runnable)
- [Supplier](#Supplier)

## Consumer

- Un Consumer en Java es una interfaz funcional que representa una operación a realizar sobre un único elemento. En otras palabras, es una función que toma un valor como entrada y no devuelve ningún resultado (void). Su principal propósito es "consumir" un dato, realizando alguna acción sobre él, como imprimirlo, modificarlo o almacenarlo.

## BiConsumer

- Un BiConsumer es una interfaz funcional que representa una operación a realizar sobre dos elementos. Es una evolución del Consumer, pero en este caso, en lugar de aceptar un solo argumento, acepta dos.

## Predicate
- Un Predicate en Java es una interfaz funcional que representa una condición o predicado booleano. En otras palabras, es una función que toma un elemento como entrada y devuelve un valor booleano (true o false). Se utiliza para filtrar elementos en colecciones, verificar condiciones, y más.

## BiPredicate
- Un BiPredicate es una interfaz funcional que representa una condición o predicado booleano que se aplica a dos elementos. Es una extensión del Predicate, pero en lugar de evaluar un solo elemento, evalúa un par de elementos.

## Callable
- Un Callable en Java es una interfaz funcional que representa una tarea asíncrona que puede devolver un resultado. A diferencia de Runnable, que no devuelve ningún valor, Callable permite obtener un resultado cuando la tarea se completa.

## BinaryOperator
- Un BinaryOperator en Java es una interfaz funcional que representa una operación binaria sobre dos argumentos del mismo tipo, devolviendo un resultado del mismo tipo. En otras palabras, es una función que toma dos entradas y produce una salida, donde todos los valores son del mismo tipo.

## Fuction
- Un Function en Java es una interfaz funcional que representa una transformación de un elemento de un tipo a otro. En otras palabras, es una función que toma un argumento de un tipo y devuelve un resultado de otro tipo.

## BiFunction
- Un BiFunction en Java es una interfaz funcional que representa una función que acepta dos argumentos de diferentes tipos y produce un resultado de un tercer tipo. Es una extensión de Function, pero en lugar de un solo argumento, toma dos.

## Runnable
- No recibe ningun parametro solo ejecuta una tarea

## Supplier
- Un Supplier en Java es una interfaz funcional que representa un proveedor de valores. Es una función que no toma ningún argumento y devuelve un resultado de un tipo específico.

## UnaryOperator
- Un UnaryOperator en Java es una interfaz funcional que representa una operación que se aplica a un solo argumento y devuelve un resultado del mismo tipo. Es una especialización de Function para el caso en el que el operando y el resultado son del mismo tipo.





