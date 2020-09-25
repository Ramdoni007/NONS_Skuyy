package com.blueskywalker.nonsskuyy.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blueskywalker.nonsskuyy.R
import kotlinx.android.synthetic.main.activity_onboarding_two.*

class OnboardingTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_two)

        btn_home.setOnClickListener {
            var intent = Intent(this@OnboardingTwoActivity, OnBoardingThreeActivity::class.java)
            startActivity(intent)
        }
    }
}