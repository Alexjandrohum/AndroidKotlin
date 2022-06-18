package com.hermen.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appBarBotom = findViewById<Button>(R.id.appbar_botom)
        appBarBotom.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.appbar_botom -> {
                val intentAppBarBotom = Intent(this, AppbarBotom::class.java)
                startActivity(intentAppBarBotom)
            }
        }
    }
}