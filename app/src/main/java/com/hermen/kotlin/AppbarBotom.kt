package com.hermen.kotlin

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.hermen.kotlin.databinding.ActivityAppbarBotomBinding

class AppbarBotom : AppCompatActivity() {

    private lateinit var binding: ActivityAppbarBotomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAppbarBotomBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}