package com.example.myloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<TextView>(R.id.username);
        val password = findViewById<TextView>(R.id.password);
        val login = findViewById<MaterialButton>(R.id.loginbtn);

        login.setOnClickListener(){
            if(username.text.toString() == "admin" && password.text.toString() == "admin"){
                Toast.makeText(this@MainActivity,"Login Successful !!!",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this@MainActivity,"Login Failed !!!",Toast.LENGTH_SHORT).show()
            }
        }

    }
}