package ise308.gul.cihat.mete.homework2

import android.util.Log

class BasketballPlayer(
    override var name: String,
    override var team: String,
    override var position: String,
    override var age: Int,
    val hand: String,
    val height: Double
) : Player(name, team, position, age) {
    val TAG = "Basketballer"

    init {
        Log.i(TAG, "$name's strong foot is $hand.")
    }

    override fun printInfo() {
        println("Player:" + name + "Team:" + team + "Position:" + position + "Age:" + age + "Strong Hand:" + hand + "Height:" + height)
    }

    //Is player plays in this team?
    fun play(club: String) {
        if (team == club) {
            println("Yes, $name is player of $team")
        } else {
            println("NO! $name is player of $team")
        }
    }

    //Is player plays in this team and his age?
    fun play(club: String, pos: String) {
        if (team == club) {
            if (position == pos) {

                println("Yes, $name is player of $team and plays in $pos position")
            }
        } else {
            println("NO! $name is player of $team and plays in $pos position")
        }
    }
}