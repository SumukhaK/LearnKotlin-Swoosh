package com.johnnybkotlin.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        get_started_button.setOnClickListener {
            //Toast.makeText(this@WelcomeActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@WelcomeActivity, LeagueActivity::class.java);
            startActivity(intent);
        }


    }
}


