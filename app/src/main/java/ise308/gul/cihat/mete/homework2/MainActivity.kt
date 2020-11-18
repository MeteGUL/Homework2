package ise308.gul.cihat.mete.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FootballPlayer()
        Player()
    }

    private fun FootballPlayer() {
        var test = FootballPlayer("fd", "fd", "mete", 12, "qewe")
        test.printInfo()


    }

    private fun Player() {

        var tt = Player("mete", "ew", "weq", 12)
        tt.printInfo();
    }

}