package com.example.mylogin5b

import DBHelperUsuario
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
        setContentView(binding.root)

        val dbHelper = DBHelperUsuario(this)

        binding.btnLogin.setOnClickListener {
            val loginInput = binding.txtUsuario.text.toString()
            val passInput = binding.txtPassword.text.toString()
            val db = dbHelper.readableDatabase

            val selectionArgs = arrayOf(loginInput, passInput)
            val cursor = db.rawQuery(
                "SELECT * FROM usuarios WHERE userlogin = ? AND userPass = ?",
                selectionArgs
            )

            if (cursor.moveToFirst()) {
                Toast.makeText(this, "El usuario es correcto :-)", Toast.LENGTH_SHORT).show()
                // Aquí puedes agregar la lógica para navegar a otra actividad si el login es exitoso
            } else {
                Toast.makeText(this, "Usuario inválido :-(", Toast.LENGTH_SHORT).show()
            }

            cursor.close() // Mover el cierre del cursor aquí
            db.close() // Cerrar la base de datos aquí
        }

        binding.tvRegistrarse.setOnClickListener {
            val intentRegistrar = Intent(this, MainActivityRegistrar::class.java)
            startActivity(intentRegistrar)
        }
    }
}
