import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {

    print("Introduzca un número: ")

    val sc = Scanner(System.`in`)
    while (!sc.hasNextInt()) {
        System.out.print("Introduzca un número: ");
        sc.next()
    }
    var numero = sc.nextInt()

    //Parte del cuadrado
    if (esPar(numero)){
        if(numero!=0) {

            repeat(numero){
                print(" — ")
            }
            println()
            repeat(numero){
                print("|")
                repeat(numero){
                    print("   ")   //parece que con 3 espacios se queda la forma del cuadrado mas consistente, comprobado con valores de 2 hasta 24
                }
                println("|")
            }
            repeat(numero) {
                print(" — ")
            }
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
