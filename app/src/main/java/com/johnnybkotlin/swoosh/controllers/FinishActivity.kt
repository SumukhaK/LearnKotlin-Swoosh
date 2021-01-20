package com.johnnybkotlin.swoosh.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.johnnybkotlin.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var league = "";
    var skills = "";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra("League").toString()
        skills = intent.getStringExtra("skill").toString()


        selection_textview.setText("Looking for a ${league} ${skills} league around you...")
    }
}