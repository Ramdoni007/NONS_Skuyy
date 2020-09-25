package com.blueskywalker.nonsskuyy.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blueskywalker.nonsskuyy.R
import com.blueskywalker.nonsskuyy.sign.SignInActivity
import kotlinx.android.synthetic.main.activity_onboarding_three.*

class OnBoardingThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_three)

        btn_home.setOnClickListener{
            finishAffinity()
            startActivity(Intent(this@OnBoardingThreeActivity , SignInActivity::class.java))
        }
    }
}