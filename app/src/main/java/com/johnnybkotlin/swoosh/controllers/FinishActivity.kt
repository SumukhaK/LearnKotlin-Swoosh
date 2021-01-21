package com.johnnybkotlin.swoosh.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.johnnybkotlin.swoosh.R
import com.johnnybkotlin.swoosh.models.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var player = Player("","");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra("Player")!!;


        selection_textview.setText("Looking for a ${player.league} ${player.skill} league around you...")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable("Player",player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable("Player")!!
        }
    }
}