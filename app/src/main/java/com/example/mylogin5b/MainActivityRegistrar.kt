package com.example.mylogin5b

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mylogin5b.databinding.ActivityMainBinding
import com.example.mylogin5b.databinding.ActivityMainRegistrarBinding

class MainActivityRegistrar : AppCompatActivity() {
    //Vincular vista Activity Main Registrar
    private lateinit var bindingRegis: ActivityMainRegistrarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingRegis = ActivityMainRegistrarBinding.inflate(layoutInflater)
        val view = bindingRegis.root
        setContentView(view)

        bindingRegis.btnCancelar.setOnClickListener {
            val intentPrinci = Intent(this, MainActivity::class.java)
            startActivity(intentPrinci)
        }
    }
}