import java.util.*
import kotlin.random.*
import kotlin.random.Random

fun main(args: Array<String>) {

    print("Introduzca un número: ")

    val sc = Scanner(System.`in`)
    while (!sc.hasNextInt()) {
        System.out.println("Introduzca un número: ");
        sc.next()
    }
    var numero = sc.nextInt()

    //Parte del cuadrado
    if (esPar(numero)){
        if(numero!=0) {
            println(" _")
            repeat(numero) {
                println("| |")
            }
            println(" -")
        }
    }else {

    //Parte de la lista

        val lista = List(numero*5) { Random.nextInt(1,100) }
        print("Elementos: ")
        println(lista)

        print("Elementos pares: ")
        println(lista.filter{esPar(it)})

        print("Elementos ordenados: ")
        println(lista.sorted())
    }

}

fun esPar (x: Int) : Boolean{
    return x%2==0
}

/*

Crea un programa en Kotlin (Intellij) que:

a) Pida al usuario que introduzca un número al que llamaremos X. (1 punto)
b) Si el número es par, de mostrar un cuadrado de X elementos y mostrar los por pantalla del siguiente modo:
Suponiendo X = 2 (3 puntos)



c) Si el número es impar debe crearse una lista de X * 5 elementos compuesta de números aleatorios. (1 punto)

Posteriormente debes:
1- mostrar todos los elementos de la lista. (1 punto)
2- mostrar los elementos pares de la lista. (2 puntos)
3- mostrar los elementos ordenados. (2 puntos)



 */