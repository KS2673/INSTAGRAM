package com.example.instagram

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var loginbtn:Button
    private lateinit var name:EditText
    private lateinit var pswd:EditText
    private lateinit var loginfcbk:Button
    private lateinit var frgtpswrd:TextView
    private lateinit var signup:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setclick()
    }
    private fun setclick()
    {
        elementbind()
        loginbtn.setOnClickListener(View.OnClickListener { Toast.makeText(applicationContext,"Welcome...",Toast.LENGTH_LONG) })

    }
    private fun elementbind()
    {
        loginbtn=findViewById(R.id.instalogin)
        name=findViewById(R.id.instanme)
        pswd=findViewById(R.id.instapswrd)
        loginfcbk=findViewById(R.id.instafb)
        frgtpswrd=findViewById(R.id.frgt)
        signup=findViewById(R.id.sign_up)

    }

    fun replaceLoginFragment() {
        TODO("Not yet implemented")
    }
}