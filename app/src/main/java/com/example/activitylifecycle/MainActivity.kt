package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val button: Button=findViewById(R.id.btnStartAnotherActivity)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            // start your next activity
            startActivity(intent)
        }
            Toast.makeText(this,"Activity1: OnCreate",Toast.LENGTH_LONG).show();
        }
        override fun onStart() {
            super.onStart()
          Log.i("Start","STARTED")
            Toast.makeText(this,"Activity1: OnStart",Toast.LENGTH_SHORT).show();
        }
        override fun onResume() {
            super.onResume()
            Toast.makeText(this,"Activity1: OnResume",Toast.LENGTH_SHORT).show();
        }
        override fun onStop() {
            super.onStop()

            Toast.makeText(this,"App state: OnStop",Toast.LENGTH_SHORT).show();
        }
        override fun onPause() {
            super.onPause()

            Toast.makeText(this,"Activity1: OnPause",Toast.LENGTH_SHORT).show();
        }
        override fun onRestart() {
            super.onRestart()

            Toast.makeText(this,"Activity1: OnRestart",Toast.LENGTH_SHORT).show();
        }
        override fun onDestroy() {
            super.onDestroy()

            Toast.makeText(this,"Activity1: OnDestroy",Toast.LENGTH_LONG).show();
        }
    }