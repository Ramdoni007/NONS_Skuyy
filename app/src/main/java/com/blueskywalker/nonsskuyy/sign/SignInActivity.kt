package com.blueskywalker.nonsskuyy.sign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blueskywalker.nonsskuyy.R
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_sign_in.*


class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btn_home.setOnClickListener {
            // Write a message to the database

            // Write a message to the database
            val database = FirebaseDatabase.getInstance()
            val myRef = database.getReference("message")

            myRef.setValue("Hello, World!")
        }


    }
}








