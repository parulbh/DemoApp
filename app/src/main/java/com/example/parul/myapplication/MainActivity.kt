package com.example.parul.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var autoCompleteTextViewUserName : AutoCompleteTextView
    private lateinit var editTextPassword : EditText
    private lateinit var buttonLogin : Button
    private lateinit var imageButtonFacebook : ImageButton
    private lateinit var imageButtonGoogle : ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        autoCompleteTextViewUserName = findViewById(R.id.autoCompleteTextViewUseName) as AutoCompleteTextView
        editTextPassword = findViewById(R.id.editTextPassword) as EditText
        buttonLogin = findViewById(R.id.buttonLogin) as Button
        imageButtonFacebook = findViewById(R.id.imageButtonFacebook) as ImageButton
        imageButtonGoogle = findViewById(R.id.imageButtonGoogle) as ImageButton





    }

}
