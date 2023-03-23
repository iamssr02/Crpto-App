package com.example.cryproapp

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val textWelcome = findViewById<TextView>(R.id.textWelcome)
        val textApp = findViewById<TextView>(R.id.textApp)

        CoroutineScope(Dispatchers.Main).launch {
            delay(1200)
            textWelcome.visibility = View.VISIBLE
            textWelcome.animation = AnimationUtils.loadAnimation(applicationContext,R.anim.spash_text_anim)
            textApp.visibility = View.VISIBLE
            textApp.animation = AnimationUtils.loadAnimation(applicationContext,R.anim.splash_text_anim2)
            delay(700)
            startActivity(Intent(applicationContext,MainActivity::class.java))
            finish()
        }


    }
}