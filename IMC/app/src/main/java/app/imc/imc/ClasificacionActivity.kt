package app.imc.imc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import app.imc.imc.adaptador.ImcAdapter
import app.imc.imc.data.listadoClasificacion

class ClasificacionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clasificacion)

        val datos = listadoClasificacion()
        val rc_listado = findViewById<RecyclerView>(R.id.rc_cla_imc)
        rc_listado.layoutManager = LinearLayoutManager(this)
        rc_listado.adapter = ImcAdapter(datos,this)

    }
}
