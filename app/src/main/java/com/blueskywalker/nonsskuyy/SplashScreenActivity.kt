package com.blueskywalker.nonsskuyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.blueskywalker.nonsskuyy.onboarding.OnboardingOneActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var handler = Handler() // Ini adalah Proses Deklarasi variable
        handler.postDelayed({  // ini adalah kode logic untuk menahan Screen Activity selama 5 detik dan juga proses berpindah langsung ke onBoardingOne
            var intent = Intent(this@SplashScreenActivity,OnboardingOneActivity::class.java)
            startActivity(intent)
            finish()

        },5000)
    }
}