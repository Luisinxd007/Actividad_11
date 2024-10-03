package com.example.mylogin5b

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylogin5b.databinding.ActivityMainRegistrarBinding

class MainActivityRegistrar : AppCompatActivity() {

    // Vincular vista Activity Main Registrar
    private lateinit var bindingRegis: ActivityMainRegistrarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingRegis = ActivityMainRegistrarBinding.inflate(layoutInflater)
        val view = bindingRegis.root
        setContentView(view)

        // Configurar botón "Cancelar" para regresar a la actividad principal
        bindingRegis.btnCancelar.setOnClickListener {
            val intentPrinci = Intent(this, MainActivity::class.java)
            startActivity(intentPrinci)
        }

        // Configurar botón "Registrar" para validar y registrar los datos
        bindingRegis.btnRegistrar.setOnClickListener {
            val usuario = bindingRegis.txtNewUsuario.text.toString()
            val password = bindingRegis.txtNewPassword.text.toString()
            val correo = bindingRegis.txtCorreo.text.toString()
            val nombre = bindingRegis.txtNombre.text.toString()

            // Validación de campos
            if (usuario.isNotEmpty() && password.isNotEmpty() && correo.isNotEmpty() && nombre.isNotEmpty()) {
                // Mostrar un mensaje de éxito (puedes agregar tu lógica para guardar en la base de datos)
                Toast.makeText(this, "Usuario registrado exitosamente", Toast.LENGTH_LONG).show()
            } else {
                // Mostrar un mensaje si algún campo está vacío
                Toast.makeText(this, "Por favor llena todos los campos", Toast.LENGTH_LONG).show()
            }
        }
    }
}
