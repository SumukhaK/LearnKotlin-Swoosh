package com.johnnybkotlin.swoosh.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.johnnybkotlin.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = "";
    var skills = "";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra("League").toString();

    }

    fun onBeginnerlicked(view: View) {
        skills = "beginner"
        baller_btn.isChecked = false
        //Toast.makeText(this," I'm a Beginner in the ${league} league",Toast.LENGTH_LONG).show()
    }
    fun onBallerlicked(view: View) {
        skills = "baller"
        beginner_btn.isChecked = false
        //Toast.makeText(this," I'm a Baller in the ${league} league",Toast.LENGTH_LONG).show()
    }

    fun onskillFinishClicked(view: View) {

        if(skills != "") {
            val intent = Intent(this@SkillActivity, FinishActivity::class.java);
            intent.putExtra("League",league)
            intent.putExtra("skill",skills)
            startActivity(intent);
        }else{
            Toast.makeText(this," Please select a skill level..",Toast.LENGTH_LONG).show()
        }
    }
}