package com.example.doanything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.press).setOnClickListener(){
            val name=findViewById<TextView>(R.id.editTT).editableText.toString()


            val intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("name",name)
            startActivity(intent)

        }


    }
}