package com.hitanshudhawan.firebasemlkitexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fullscreen.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fullscreen)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.hide()

        ml_kit.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }

        flutter.setOnClickListener {
            startActivity(Intent(applicationContext, InputNumbersActivity::class.java))
        }



    }


}
