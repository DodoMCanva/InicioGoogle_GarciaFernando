package mx.itson.practica10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bienvenida : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        val correo = intent.getStringExtra("Correo")
        val proveedor = intent.getStringExtra("Proveedor")

        val textoCorreo = findViewById<TextView>(R.id.evCorreo)
        val textoProveedor = findViewById<TextView>(R.id.evProveedor)
        textoCorreo.text = textoCorreo.text.toString()+" "+correo
        textoProveedor.text = textoProveedor.text.toString()+" "+proveedor

        findViewById<Button>(R.id.btnSalir).setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}