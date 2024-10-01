package com.example.mylogin5b

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylogin5b.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*binding.tvRegistrarse.setOnClickListener {
            val intento1 = Intent(this,MainActivityRegistrar::class.java)
            startActivity(intento1)
        }*/
        binding.tvRegistrarse.setOnClickListener {
            val intentRegistrar = Intent(this, MainActivityRegistrar::class.java)
            startActivity(intentRegistrar)
            //Toast.makeText(this, "Registrarse presionado", Toast.LENGTH_SHORT).show()
        }
    }
}