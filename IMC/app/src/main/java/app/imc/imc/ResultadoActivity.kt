package app.imc.imc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val indice = findViewById<TextView>(R.id.ra_tx_indice)
        val imc = findViewById<TextView>(R.id.ra_tx_imc)
        val icono = findViewById<ImageView>(R.id.ra_img_icono)

        val b = intent

        indice.text = b.getStringExtra("INDICE")
        imc.text = b.getStringExtra("IMC")
        icono.setImageResource(b.getIntExtra("ICONO",0))

    }
}
