package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this,"Activity2: OnCreate", Toast.LENGTH_LONG).show();
    }
    override fun onStart() {
        super.onStart()
        Log.i("Start","STARTED")
        Toast.makeText(this,"Activity2: OnStart", Toast.LENGTH_SHORT).show();
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Activity2: OnResume", Toast.LENGTH_SHORT).show();
    }
    override fun onStop() {
        super.onStop()

        Toast.makeText(this,"Activity2: OnStop", Toast.LENGTH_SHORT).show();
    }
    override fun onPause() {
        super.onPause()

        Toast.makeText(this,"Activity2 state: OnPause", Toast.LENGTH_SHORT).show();
    }
    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this,"Activity2 state: OnRestart", Toast.LENGTH_SHORT).show();
    }
    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this,"Activity2 state: OnDestroy", Toast.LENGTH_LONG).show();
    }
}
