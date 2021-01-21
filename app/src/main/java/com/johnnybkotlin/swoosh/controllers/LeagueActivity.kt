package com.johnnybkotlin.swoosh.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.johnnybkotlin.swoosh.R
import com.johnnybkotlin.swoosh.models.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


        league_next_btn.setOnClickListener {
            if(player.league != "") {
                val skilledIntent = Intent(this@LeagueActivity,SkillActivity::class.java);
                skilledIntent.putExtra("Player",player);
                startActivity(skilledIntent)
            }else{
                Toast.makeText(this@LeagueActivity,"Please select a League",Toast.LENGTH_LONG).show()
            }
        }
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

    fun onCoedClicked(view: View) {

        if(coed_league_btn.isChecked) {
            mens_league_btn.isChecked = false
            womens_league_btn.isChecked = false
            player.league = "Co-ed"
        }else{
            mens_league_btn.isChecked = false
            womens_league_btn.isChecked = false
            player.league = ""
        }

    }
    fun onWomensClicked(view: View) {

        if(womens_league_btn.isChecked) {
            mens_league_btn.isChecked = false
            coed_league_btn.isChecked = false
            player.league = "Women's"
        }else{
            mens_league_btn.isChecked = false
            coed_league_btn.isChecked = false
            player.league = ""

        }
    }
    fun onMensClicked(view: View) {

        if(mens_league_btn.isChecked) {
            womens_league_btn.isChecked = false
            coed_league_btn.isChecked = false
            player.league = "Men's"
        }else{
            womens_league_btn.isChecked = false
            coed_league_btn.isChecked = false
            player.league = ""
        }
    }
}