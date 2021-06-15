package com.example.newz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FrontPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front_page)

    }

    fun Click_To_Enter(view: View)
    {
       val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}