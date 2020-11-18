package ise308.gul.cihat.mete.homework2

open class Player(
    open var name: String,
    open var team: String,
    open var position: String,
    open var age: Int
) {


    init {
        println("Player class is called.")
    }

    open fun printInfo() {
        println("Player:"+ name + "Team:"+ team +"Pos:"+ position +"Age:"+ age)
    }

}
