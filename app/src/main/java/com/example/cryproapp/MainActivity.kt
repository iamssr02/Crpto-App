package com.example.cryproapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var mProgressBar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mProgressBar = findViewById(R.id.phoneProgressBar)
        mProgressBar.visibility = View.GONE
        val textView = findViewById<TextView>(R.id.textView2)
        textView.animation = AnimationUtils.loadAnimation(applicationContext,R.anim.spash_text_anim)

        //Not yet implemented
        findViewById<Button>(R.id.gSignInBtn).setOnClickListener {
            Toast.makeText(this, "Only design is made",Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.send_otp_button).setOnClickListener {
            Toast.makeText(this, "Only design is made",Toast.LENGTH_SHORT).show()
        }
    }
}