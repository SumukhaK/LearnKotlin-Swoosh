package com.johnnybkotlin.swoosh.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.johnnybkotlin.swoosh.R
import com.johnnybkotlin.swoosh.models.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra("Player")!!;



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

    fun onBeginnerlicked(view: View) {

        if(beginner_btn.isChecked) {
            player.skill = "beginner"
            baller_btn.isChecked = false
        }else{
            player.skill = ""
            baller_btn.isChecked = false
        }
        //Toast.makeText(this," I'm a Beginner in the ${league} league",Toast.LENGTH_LONG).show()
    }
    fun onBallerlicked(view: View) {

        if(baller_btn.isChecked) {
            player.skill = "baller"
            beginner_btn.isChecked = false
        }else{
            player.skill = ""
            beginner_btn.isChecked = false
        }
        //Toast.makeText(this," I'm a Baller in the ${league} league",Toast.LENGTH_LONG).show()
    }

    fun onskillFinishClicked(view: View) {

        if(player.skill != "") {
            val intent = Intent(this@SkillActivity, FinishActivity::class.java);
            intent.putExtra("Player",player);
            startActivity(intent);
        }else{
            Toast.makeText(this," Please select a skill level..",Toast.LENGTH_LONG).show()
        }
    }
}