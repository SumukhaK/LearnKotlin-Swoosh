package com.johnnybkotlin.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SkillActivity : BaseActivity() {

    var league = "";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra("League").toString();

    }

    fun onBeginnerlicked(view: View) {
        Toast.makeText(this," I'm a Beginner in the ${league} league",Toast.LENGTH_LONG).show()
    }
    fun onBallerlicked(view: View) {
        Toast.makeText(this," I'm a Baller in the ${league} league",Toast.LENGTH_LONG).show()
    }
}