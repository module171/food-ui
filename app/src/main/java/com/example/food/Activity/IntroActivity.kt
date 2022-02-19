package com.example.food.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.food.MainActivity
import com.example.food.R
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        startbtn.setOnClickListener(View.OnClickListener {

            val intein =Intent(this,MainActivity::class.java)
            startActivity(intein)

        })
    }
}