package com.johnnybkotlin.swoosh.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.johnnybkotlin.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


        league_next_btn.setOnClickListener {
            if(selectedLeague != "") {
                val skilledIntent = Intent(this@LeagueActivity,SkillActivity::class.java);
                skilledIntent.putExtra("League",selectedLeague);
                startActivity(skilledIntent)
            }else{
                Toast.makeText(this@LeagueActivity,"Please select a League",Toast.LENGTH_LONG).show()
            }
        }
    }

    fun onCoedClicked(view: View) {

        mens_league_btn.isChecked = false
        womens_league_btn.isChecked = false
        selectedLeague = "Co-ed"

    }
    fun onWomensClicked(view: View) {

        mens_league_btn.isChecked = false
        coed_league_btn.isChecked = false
        selectedLeague = "Women's"

    }
    fun onMensClicked(view: View) {

        womens_league_btn.isChecked = false
        coed_league_btn.isChecked = false
        selectedLeague = "Men's"

    }
}