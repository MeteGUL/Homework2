package ise308.gul.cihat.mete.homework2

import android.util.Log

class FootballPlayer(
    override var name: String,
    override var team: String,
    override var position: String,
    override var age: Int,
    val foot: String
) : Player(name, team, position, age) {
    val TAG = "Footballer"
    var footNo: Int = 0
        set(footNo: Int){
            this.footNo=footNo
            println("Foot Number setted by overriding")
        }

    init {
        Log.i(TAG, "$name's strong foot is $foot.")
    }

    override fun printInfo() {
        println("Player:" + name + "Team:" + team + "Position:" + position + "Age:" + age + "Strong Foot:" + foot)
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
    fun play(club: String, old: Int) {
        if (team == club) {
            if (age == old) {

                println("Yes, $name is player of $team and $age years old")
            }
        } else {
            println("NO! $name is player of $team")
        }
    }

    fun learnFoot() {
        println("Player's strong foots': $foot")
    }
}