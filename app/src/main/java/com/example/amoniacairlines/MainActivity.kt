package com.example.amoniacairlines

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        lateinit var dbHandler: DBhandlerAmoniac
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHandler = DBhandlerAmoniac(this)

        btn_signup.setOnClickListener{
            startActivity(Intent(this, Signup::class.java))
        }
    }
}